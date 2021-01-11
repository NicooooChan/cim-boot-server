package com.farsunset.cim.push;

import com.farsunset.cim.sdk.server.model.CIMSession;
import com.farsunset.cim.sdk.server.model.Message;
import com.farsunset.cim.service.ApnsService;
import com.farsunset.cim.service.CIMSessionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/*
 * 消息发送实现类
 * 
 */
@Component
public class DefaultMessagePusher implements CIMMessagePusher {

	@Value("${server.host}")
	private String host;
	
	@Resource
	private CIMSessionService cimSessionService;
 
	

	@Resource
	private ApnsService apnsService;
	
	
	/*
	 * 向用户发送消息
	 * 
	 * @param message
	 */
	@Override
	public void push(Message message) {
		CIMSession session = cimSessionService.get(message.getReceiver());

		if(session == null) {
			return;
		}

		/*
		 * IOS设备，如果开启了apns，则使用apns推送
		 */
		if (session.isIOSChannel() && session.isApnsEnable()) {
			apnsService.push(message, session.getDeviceId());
			return;
		}
		
		/*
		 * 服务器集群时，判断当前session是否连接于本台服务器
		 * 如果连接到了其他服务器则转发请求到目标服务器
		 */
		if (session.isConnected() && !Objects.equals(host, session.getHost())) {
			/*
			 * @TODO
			 * 在此调用目标服务器接口来发送，如session.host = 123.123.123.123
			 * 调用目标服务器的消息发送接口http://123.123.123.123:8080/message/send
			 */
			return;
		}

		/*
		 * 如果是Android，浏览器或者windows客户端则直接发送
		 */
		if (session.isConnected() && Objects.equals(host, session.getHost())) {
			session.write(message);
		}
		
	}

}

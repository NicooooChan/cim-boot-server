package com.farsunset.cim.sdk.server.handler;

/**
 *  请求处理接口,所有的请求实现必须实现此接口
 */

import com.farsunset.cim.sdk.server.model.CIMSession;
import com.farsunset.cim.sdk.server.model.SentBody;

public interface CIMRequestHandler {

	/**
	 * 处理收到客户端从长链接发送的数据
	 */
	void process(CIMSession session, SentBody message);
}

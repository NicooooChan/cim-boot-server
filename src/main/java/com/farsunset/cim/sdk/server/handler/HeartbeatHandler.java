package com.farsunset.cim.sdk.server.handler;


import com.farsunset.cim.sdk.server.model.CIMSession;
import com.farsunset.cim.sdk.server.model.SentBody;

/**
 * 心跳handler，主要是让netty重置cheannel的空闲时间
 */
public class HeartbeatHandler implements CIMRequestHandler {
	@Override
    public void process(CIMSession session, SentBody body) {}
}

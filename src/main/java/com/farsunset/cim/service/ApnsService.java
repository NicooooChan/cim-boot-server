package com.farsunset.cim.service;

import com.farsunset.cim.sdk.server.model.Message;

public interface ApnsService {

	void push(Message message, String deviceToken);
}

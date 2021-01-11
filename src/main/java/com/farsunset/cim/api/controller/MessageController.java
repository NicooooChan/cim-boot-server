package com.farsunset.cim.api.controller;

import com.farsunset.cim.push.DefaultMessagePusher;
import com.farsunset.cim.sdk.server.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api/message")
public class MessageController  {

	@Resource
	private DefaultMessagePusher defaultMessagePusher;


	@PostMapping(value = "/send")
	public ResponseEntity<Long> send(Message message)  {

		message.setId(System.currentTimeMillis());

		defaultMessagePusher.push(message);

		return ResponseEntity.ok(message.getId());
	}

}

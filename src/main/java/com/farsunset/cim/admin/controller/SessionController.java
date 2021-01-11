package com.farsunset.cim.admin.controller;

import com.farsunset.cim.service.CIMSessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/console/session")
public class SessionController {

	@Resource
	private CIMSessionService cimSessionService;
	
	@GetMapping(value = "/list")
	public String list(Model model) {
		model.addAttribute("sessionList", cimSessionService.list());
		return "console/session/manage";
	}
}

package com.norisuke.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/view/master")
	public String master(Model model) {
		model.addAttribute("title","���ʃ��C�A�E�g");
		model.addAttribute("lib","view/master::lib");
		model.addAttribute("main","view/master::main");
		
		return "common/layout";
	}
}

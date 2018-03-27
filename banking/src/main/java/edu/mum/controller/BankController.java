package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class BankController {

	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("welcome", new String("welcome to online Banking"));
	
		return "home";
	
	}
	
}

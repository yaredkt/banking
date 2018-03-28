package edu.mum.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/admin")
public class AccountController {

//	@Autowired
//	private AccountService accountService;
	
	
	@RequestMapping(value= "/account/{id}", method= RequestMethod.GET )
	public String findOne(Model model) {
		
		return "accounts";
	}
	
}

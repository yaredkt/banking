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
	
	@RequestMapping(value= "/account", method= RequestMethod.GET )
	public String findOne(Model model) {

		model.addAttribute(model);
		
		return "manageAccount";
	}
	
	@RequestMapping(value="/addAccount", method = RequestMethod.GET)
	public String addAccount() {
		
		return "addAccount";
	}
	
	@RequestMapping(value="/addAccount", method = RequestMethod.POST)
	public String saveAccount() {
		
		return "addAccount";
	}
	
}

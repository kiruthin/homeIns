package com.homeIns.controller.nonauthed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.homeIns.controller.authed.service.UserService;
import com.homeIns.model.account.objects.Customer;
import com.homeIns.model.account.objects.User;

@Controller
public class LoginController {

	@Autowired
	private UserService uService;
	
		
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public Model getLoginPage(Model model) {

		System.out.println("Login GET");
		User user = new User();
		return model.addAttribute("command", user);
		//return "login";
		//return new ModelAndView("login", "command", user);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user") User user, ModelMap model) {

		System.out.println("POST User  ="+ user);
		System.out.println("POST Model ="+ model);
		
		if (uService.authenticate(user))
		{
			model.addAttribute("userobj", user);
			model.addAttribute("ValidUser", true);
			return new ModelAndView("welcome", "command", user);
			//return "login";
		}
		else 
		{
			model.addAttribute("ValidUser", false);
			return new ModelAndView("login", "command", user);
			//return "welcome";
		}	
		//return new ModelAndView("welcome", "user", new Customer());
	}     

}

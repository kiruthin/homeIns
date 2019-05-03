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
public class UserController{

	@Autowired
	private UserService uService;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public ModelAndView showAddUserForm(Model model) {

		User user = new User();
		//model.addAttribute("command", user);
		//return "addUser";
		return new ModelAndView("addUser", "command", user);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user, ModelMap model) {

		System.out.println("User  ="+ user);
		System.out.println("Model ="+ model);
		
		uService.saveUser(user);
		model.addAttribute("userForm", user);
	
		return "login";
		//return new ModelAndView("welcome", "user", new Customer());
	}     
}

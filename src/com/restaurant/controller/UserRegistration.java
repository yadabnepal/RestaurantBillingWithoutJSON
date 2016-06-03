package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.bean.User;
import com.restaurant.service.UserService;

@Controller
public class UserRegistration {
	UserService userService = new UserService();
	
	 @RequestMapping(value = "/userRegistration", method = RequestMethod.GET)
	   public ModelAndView studentGet() {
	      return new ModelAndView("userRegistration", "SpringWeb", new User());
	   }
	 
	 @RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	   public ModelAndView studentPost(@ModelAttribute("SpringWeb")User user, 
			   ModelMap model) {
		 user.setStatus(0);
		 user.setUserType("ADMIN");		
		 userService.createUser(user);
		 model.addAttribute("user", user.getUsername()+" has been registered successfully");
		 return new ModelAndView("index", "command", new User());
	   }

}

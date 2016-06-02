package com.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.bean.User;

@Controller
public class UserRegistration {
	
	 @RequestMapping(value = "/userRegistration", method = RequestMethod.GET)
	   public ModelAndView studentGet() {
		   
	      return new ModelAndView("userRegistration", "command", new User());
	   }
	 
	 @RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	   public String studentPost(@ModelAttribute("SpringWeb")User user, 
			   ModelMap model) {
		   model.addAttribute("user", user.getUsername()+" has been registered successfully");
	      return "index";
	   }

}

package com.restaurant.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.bean.User;

import org.springframework.ui.ModelMap;

@Controller
public class DefaultController{
 
   @RequestMapping(value="/",method = RequestMethod.GET)
   public ModelAndView printHello(ModelMap model) {
	   return new ModelAndView("index", "command", new User());
   }
   
}
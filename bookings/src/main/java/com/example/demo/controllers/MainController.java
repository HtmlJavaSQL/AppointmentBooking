package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView Method1() {
		
		ModelAndView mv = new ModelAndView();
	
		mv.addObject("name", "abhi");
		mv.setViewName("WelcomePage");
		
		return mv;
		
	}
	
	

}

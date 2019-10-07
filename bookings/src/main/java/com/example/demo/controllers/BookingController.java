package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.BookingsInfoPojo;
import com.example.demo.service.BookingService;

@RestController
public class BookingController {
	String response;
	
	@Autowired
	BookingService bookingService;
	
	
	@PostMapping("/savebooking")
	public ModelAndView RegisterBooking(BookingsInfoPojo bookingDetails ){

		ModelAndView mv = new ModelAndView();
		
		response = bookingService.SaveBooking(bookingDetails);
		
		
		mv.addObject("response",response);
		mv.setViewName("BookingStatusPage");
		return mv;
		
	}
	
}
	


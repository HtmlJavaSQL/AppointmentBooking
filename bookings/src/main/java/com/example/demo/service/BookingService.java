package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import com.example.demo.entity.BookingInfoTable;
import com.example.demo.pojo.BookingsInfoPojo;
import com.example.demo.interfaces.BookingRepo;


@Service
@EnableMongoRepositories(basePackages = "com.example.demo.interfaces")
public class BookingService {
	
	private boolean success = false;
	private String response;
	
	@Autowired
	BookingRepo bookingRepo;
	
	
	
	public String SaveBooking(BookingsInfoPojo bookingInfo) {
		
		if(bookingInfo != null) {
			
			BookingInfoTable bookingInfoTable  = new BookingInfoTable(bookingInfo.getUserId(),bookingInfo.getUserName(), bookingInfo.getDate(),"Confirmed");
			
			try {
				
				if(bookingRepo.FindUserBooking(bookingInfo.getDate(),bookingInfo.getUserId()).isPresent()) {
					response = "Booking already made for this slot, "
							+ "If you want to update, please choose different slot";
					System.out.println(response);
					success = true;
				}else {
					bookingRepo.save(bookingInfoTable);
					success = true;
					response = "Booking Successful";
				}
			}catch(Exception e){
				System.out.println(e);
			}finally {
				response = (success)?response:"Booking Failed";
			}
		}else {
			response =  "Please enter the details";
		}
		
		return response;
	}
	
}

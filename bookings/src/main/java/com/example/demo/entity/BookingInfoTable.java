package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class BookingInfoTable {
	
	@Id
	private int userId;
	private String userName;
	private String date;
	private String bookingStatus;
	
	public BookingInfoTable(int userId, String userName, String date, String bookingStatus) {
		this.userId = userId;
		this.userName = userName;
		this.date = date;
		this.bookingStatus = bookingStatus;
	}
	
	public BookingInfoTable() {}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}

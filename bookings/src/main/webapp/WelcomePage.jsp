<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<link href="css/Bookings.css" rel="stylesheet">
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body id="home">

	<h1>Welcome to Appointment Booking Site</h1>
	<div id=data>
		<h2>This site is developed by Maria, as a part of in-house
			project work. You can book an appointment by clicking below button.</h2>
		<a href="AppointmentPage.jsp">Get Appointment</a>

		<h3>NOTE: One userId can have only 1 active Booking. If you want
			to change the appointment date, please create new booking with latest
			date and time. System will update booking details in the database.</h3>
	</div>
</body>

</html>
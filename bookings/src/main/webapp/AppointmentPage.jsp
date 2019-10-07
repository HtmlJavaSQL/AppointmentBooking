<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Book Appointment</title>
    <link href="css/Bookings.css" rel="stylesheet">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-timepicker-addon/1.6.3/jquery-ui-timepicker-addon.min.css" />
</head>

<body id = "body">
	<h1>Enter Appointment Details</h1>
	<form method="post" action="savebooking">
	<ul>
		<li>Date: <input type="text" id="datepicker" name = "date" required="required"></li>
	  	<li>UserId : <input type="number" name="userId" required="required"></li>
	  	<li>UserName : <input type="text" name = "userName" required="required"></li>
	  	<li><button type="submit" value="submit" >Create Appointment</button></li>	
    </ul>
    </form>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-timepicker-addon/1.6.3/jquery-ui-timepicker-addon.min.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datetimepicker({
            	minDate:+0
            });
        });
  </script>
</body>


</html>
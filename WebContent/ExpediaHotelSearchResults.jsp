<%@page import="java.util.ArrayList"%>
<%@page import="com.expedia.hotel.mvc.*"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Search Results</title>
</head>
<body style='color: white; background-color: #000c'>
	<h1 align="center">Hotel Search Results:</h1>
	<div align="center">
		<%
// 	WARNING MSSG TO THE USER WHEN THE NUMBER OF REULTS = 0
					ArrayList<ExpediaHotelModal> Hotel_list =(ArrayList<ExpediaHotelModal>)request.getAttribute("Hotel");
					String sort_by = request.getAttribute("sort_by").toString();
					if (Hotel_list.size()==0) {
						out.println("<fieldset style='width:50%;position:absolute;left:35%;top:60%;margin:-100px 0 0 -150px'>No Results Found!</fieldset>");
					} else {
						
				%>
		<form action="/Expedia_project/ExpediaHotelController" method="get">
			<input type="hidden" name="sort_p" id="sort_p" value="1" />
			<div>
			
				<h4>Sort Results By:</h4>
				<input type="hidden" value="" /> 
				<select name="sort_value" id="sort_value">
					<option selected="selected" value="">-- Select One --</option>
					<option selected="${sort_by == 'star_rate' ?'selected':'' }" value="star_rate">Star Rate</option>
					<option selected="${sort_by == 'guest_rate' ?'selected':'' }" value="guest_rate">Guest Rate</option>
					<option selected="${sort_by == 'price' ?'selected':'' }" value="price">Price</option>
				</select>
				<button style="width: 100px; height: 30px" type="submit">Sort</button>
			</div>
		</form>
		<%
//	DISPLAY RESULTS TO THE USER IN TABLE FORMAT
						out.println("<h3 style='color:blue'>" +Hotel_list.size()+" Elements Found! </h3>");
						out.println("<table border='1' style='width:50%'><col width='25%'><col width='75%'>");
						out.println("<thead><th></th><th>Hotel Deatils</th></thead>");
						
						for(ExpediaHotelModal hotel : Hotel_list) {
							out.println("<tr><td><img style='width:80%' src="+hotel.getHotelImageUrl()+" /></td>");
							out.println("<td>"+hotel.toString()+"</td></tr>");
						}
						out.println("</table>");
					}
				%>
	</div>
</body>
</html>
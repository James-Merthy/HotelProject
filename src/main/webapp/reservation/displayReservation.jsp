<%@ page import="com.example.hotelproject.models.Client" %>
<%@ page import="com.example.hotelproject.service.ReservatonService" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.hotelproject.models.Room" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 15-07-22
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    private final ReservatonService service = ReservatonService.getInstance();
%>
<%
    ArrayList<Room> list = service.getAllReservation();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<h1> Toutes vos réservations </h1>

<%
    for (Room room : list){
%>
<ul>
    <li>
        <div>
            <p> <span> id: </span> <%= room.getRoomID() %> </p>
            <p> <span> nom: </span> <%= room.getPrice() %> $ </p>

        </div>
    </li>
</ul>
<%
    }
%>

</body>
</html>

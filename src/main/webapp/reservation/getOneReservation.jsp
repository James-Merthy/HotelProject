<%@ page import="com.example.hotelproject.service.ReservatonService" %>
<%@ page import="com.example.hotelproject.models.Room" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%!
    private final ReservatonService service = ReservatonService.getInstance();
%>

<%
    String id =  request.getParameter("id");
    if(id==null){
        response.setStatus(400);
        return;
    }
    Room room = service.getOne(Integer.parseInt(id));

%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> Detail Room</h1>

<div>
    <p> <span> id: </span> <%= room.getRoomID() %></p>
    <p> <span> price: </span> <%= room.getPrice() %> $ </p>
    <p> <span> enter date: </span> <%= room.getEnterDate() %> </p>
    <p> <span> exit date: </span> <%= room.getExitDate() %></p>
</div>

<a href= "<%= request.getContextPath()%>/index.jsp"> Go Back </a>

</body>
</html>

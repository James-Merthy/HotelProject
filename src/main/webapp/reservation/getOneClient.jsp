<%@ page import="com.example.hotelproject.service.ReservatonService" %>
<%@ page import="com.example.hotelproject.models.Client" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
  private ReservatonService service = ReservatonService.getInstance();
%>

<%
  String id = request.getParameter("id");
  if(id==null){
    response.setStatus(400);
    return;
  }
  Client client = service.getClient(Integer.parseInt(id));
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Display Client</h1>

<div>
  <p> <span> id: </span> <%= client.getClientID() %></p>
  <p> <span> first name: </span> <%= client.getFirstName()%></p>
  <p> <span> last name: </span> <%= client.getLastName()%></p>
  <p> <span> birth date : </span> <%= client.getBirthDate()%></p>

</div>

</body>
</html>

<%@ page import="com.example.hotelproject.service.ReservatonService" %>
<%@ page import="com.example.hotelproject.models.Client" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
  private final ReservatonService service = ReservatonService.getInstance();
%>

<%
  String id = request.getParameter("id");
  if(id==null){
    response.setStatus(400);
    return;
  }
  ArrayList<Client> clientList = service.getAllClients();
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Display Client</h1>

<div>
  <%
    for (Client client : clientList){
  %>
  <ul>
    <li>
      <div>
        <p> <span> Client number: </span> <%= client.getClientID() %> </p>
        <p> <span> First name: </span> <%= client.getFirstName() %> </p>
        <p> <span> Last name: </span> <%= client.getLastName() %> </p>
        <p> <span> Birth date: </span> <%= client.getBirthDate() %> </p>

      </div>
      <a href="getOneClient.jsp?id=<%=client.getClientID()%>">Show That Room</a>
    </li>
  </ul>
  <%
    }
  %>
</div>

</body>
</html>

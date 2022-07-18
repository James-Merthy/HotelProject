<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> Room Reservation Area</h1>

<form action = "<%= request.getContextPath()%>/reservation/addReservation">

    <div>
        <label for="firstName_input"> First Name : </label>
        <% String firstName = request.getParameter("firstName");%>
        <input type="text" id="firstName_input" name="firstName" value="<%= firstName==null ? "" : firstName%>">
    </div>

    <div>
        <label for="lastName_input"> Last Name : </label>
        <% String lastName = request.getParameter("lastName");%>
        <input type="text" id="lastName_input" name="lastName" value="<%= lastName==null ? "" : lastName%>">
    </div>

    <div>
        <label for="birthDate"> Birth Date  : </label>
        <% LocalDate birthDate = LocalDate.parse(request.getParameter("birthDate"));%>
        <input type="text" id="birthDate" name="birthDate" value="<%= birthDate==null ? "" : birthDate%>">
    </div>

    <div>
        <label for="roomPrice"> Room Price : </label>
        <% String roomPrice = request.getParameter("roomPrice");%>
        <input type="text" id="roomPrice" name="roomPrice" value="<%= roomPrice==null ? "" : roomPrice%>">
    </div>


    <div>
        <label for="enterDate"> Enter Date : </label>
        <% LocalDate enterDate = LocalDate.parse(request.getParameter("enterDate"));%>
        <input type="text" id="enterDate" name="enterDate" value="<%= enterDate==null ? "" : enterDate%>">
    </div>

    <div>
        <label for="exitDate"> Exit Date : </label>
        <% LocalDate exitDate = LocalDate.parse(request.getParameter("exitDate"));%>
        <input type="text" id="exitDate" name="exitDate" value="<%= exitDate==null ? "" : exitDate%>">
    </div>



</form>
</body>
</html>

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

<form action = "<%= request.getContextPath()%>/reservation/addReservation" method="post">

    <div>
        <label for="roomPrice"> Room Price : </label>
        <% String roomPrice = request.getParameter("roomPrice");%>
        <input type="text" id="roomPrice" name="roomPrice" value="<%= roomPrice==null ? "" : roomPrice%>">
    </div>


    <div>
        <label for="enterDate"> Enter Date : </label>
        <% LocalDate enterDate =
                request.getParameter("enterDate") == null ? null : LocalDate.parse(request.getParameter("enterDate"));%>
        <input type="date" id="enterDate" name="enterDate" value="<%= enterDate==null ? "" : enterDate%>">
    </div>

    <div>
        <label for="exitDate"> Exit Date : </label>
        <% LocalDate exitDate =
                request.getParameter("exitDate") == null ? null : LocalDate.parse(request.getParameter("exitDate"));%>
        <input type="date" id="exitDate" name="exitDate" value="<%= exitDate==null ? "" : exitDate%>">
    </div>
    <br>

    <input type = "submit">

</form>
</body>
</html>

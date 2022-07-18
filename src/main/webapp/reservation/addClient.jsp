<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: JAVA
  Date: 18-07-22
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Client Creation Area </h1>
<form action = "<%= request.getContextPath()%>/reservation/addClient" method="pos">
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
            <% LocalDate birthDate =
                    request.getParameter("birthDate") == null ? null : LocalDate.parse(request.getParameter("birthDate"));%>
            <input type="date" id="birthDate" name="birthDate" value="<%= birthDate==null ? "" : birthDate%>">
        </div>

</form>
</body>
</html>

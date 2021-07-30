<%--
  Created by IntelliJ IDEA.
  User: Tolstjak
  Date: 4/15/2021
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form action="StudentServlet" method="get">
        First Name: <input name="firstName" type="text" /> <br/> <br/>

        Last Name: <input name="lastName" type="text" /> <br/> <br/>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>

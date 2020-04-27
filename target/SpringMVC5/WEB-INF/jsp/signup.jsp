<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 4/27/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup User</title>
</head>
<body>

<form action="signup" method="post">
    <p>User ID: <input name="id" placeholder="Enter ID"></p>
    <p>User Name: <input name="name" placeholder="Enter Name"></p>
    <p>Street Address: <input name="address.street" placeholder="Enter Street Address"></p>
    <p>ZipCode Address: <input name="address.zipCode" placeholder="Enter Zip Code"></p>
    <input type="submit">
</form>

</body>
</html>

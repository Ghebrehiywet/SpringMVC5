<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 4/28/2020
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User signup form</title>
</head>
<body>

<p>${userModel.id}</p><br/>
<p>${userModel.name}</p><br/>
<p>${userModel.address.street}</p><br/>
<p>${userModel.address.zipCode}</p><br/>
<%--<p>${userModel.phoneNumber.areaCode}-${userModel.phoneNumber.number}</p><br/>--%>

</body>
</html>

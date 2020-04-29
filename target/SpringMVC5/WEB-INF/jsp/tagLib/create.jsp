<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 4/28/2020
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring tag Library demo</title>
</head>
<body>

<h2>Spring tag Library demo</h2>

<form:form action="create" method="post" modelAttribute="userModel">
    <p> First name <form:input path="name"></form:input><p/>
    <p> Age <form:input path="age"></form:input><p/>

    <p> Gender
   <%--     <form:select path="gender">
        <form:option value="Male">Male</form:option>
        <form:option value="FeMale">FeMale</form:option>
        </form:select>--%>
    <br/>
<%--            <form:select path="gender" items="${genderList}"></form:select>--%>
        <br/>
            <form:select path="gender" items="${genderMap}"></form:select>
    <p/>

    <input type="submit" value="Save">
    <button type="submit">Save</button>
</form:form>

</body>
</html>

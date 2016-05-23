<%--
  Created by IntelliJ IDEA.
  User: Yamuna
  Date: 18/05/16
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>
<input type="text">
<h1>Welcome to Spring Boot</h1>
<p>${name}</p>
<table>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Email</td>
        <td>Gender</td>
        <td>Action</td>

    </tr>
<c:forEach var="employee" items="${employees}">
    <tr>
        <td>${employee.id}</td>
        <td>${employee.name}</td>
        <td>${employee.email}</td>
        <td>${employee.gender}</td>
        <td><a href="\${employee.id}">Edit</a> &nbsp;<a id="${employee.id}">Delete</a></td>
    </tr>
</c:forEach>
    </table>
</body>
</html>

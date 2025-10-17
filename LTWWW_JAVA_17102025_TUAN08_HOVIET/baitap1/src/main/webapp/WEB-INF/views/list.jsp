<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic HTML5 Template</title>

</head>
<body>
<header>
    <h1>Employee List</h1>
    <table>
        <tr>
            <td>Id</td>
            <td>FirstName</td>
            <td>LastName</td>
            <td>Action</td>
        </tr>
    </table>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td><a href="${pageContext.request.contextPath}/update?employeeId={employeeId}">Edit</a></td>
        </tr>
    </c:forEach>
</header>

<footer>
    <p>Ho Viet</p>
</footer>
</body>
</html>
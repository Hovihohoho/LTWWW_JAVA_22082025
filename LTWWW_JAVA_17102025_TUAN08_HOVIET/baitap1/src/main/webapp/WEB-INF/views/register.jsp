<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <h1>Employee</h1>
    <%--@elvariable id="employee" type="java"--%>
    <form:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="employee">
        <table>
            <tr>
                <td>First Name:</td>
                <td>
                    <form:hidden path="id"/>
                    <form:input path="firstName"/>
                    <form:errors path="firstName" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="lastName"/>
                    <form:errors path="lastName" cssStyle="color: red"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Save Changes"/>
                </td>
            </tr>
        </table>
    </form:form>
</header>

<footer>
    <p>Ho Viet</p>
</footer>
</body>
</html>
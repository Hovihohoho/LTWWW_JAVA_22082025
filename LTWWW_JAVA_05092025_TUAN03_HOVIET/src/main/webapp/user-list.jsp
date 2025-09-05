<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.model.User" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h2>Registered Users</h2>

<table border="1" cellpadding="10">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Birthday</th>
        <th>Gender</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<User> userList = (List<User>) request.getAttribute("userList");
        if (userList != null && !userList.isEmpty()) {
            for (User user : userList) {
    %>
    <tr>
        <td><%= user.getFirstName() %></td>
        <td><%= user.getLastName() %></td>
        <td><%= user.getEmail() %></td>
        <td><%= user.getBirthday() %></td>
        <td><%= user.getGender() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr><td colspan="5">No users registered</td></tr>
    <% } %>
    </tbody>
</table>

<br/>
<a href="register.jsp">Register new user</a>

</body>
</html>

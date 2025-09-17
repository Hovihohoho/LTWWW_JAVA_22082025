<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="iuh.fit.se.ltwww_java_05092025_tuan04_hoviet.model.User" %>
<html>
<head>
    <title>Danh sách người dùng</title>
    <style>
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ccc; padding: 8px; text-align: center; }
        th { background: #f0f0f0; }
    </style>
</head>
<body>
<h2>Danh sách người dùng đã đăng ký</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Họ tên</th>
        <th>Email</th>
        <th>Ngày sinh</th>
        <th>Giới tính</th>
    </tr>
    <%
        List<User> users = (List<User>) request.getAttribute("users");
        if(users != null) {
            for(User u : users) {
    %>
    <tr>
        <td><%= u.getId() %></td>
        <td><%= u.getFirstName() + " " + u.getLastName() %></td>
        <td><%= u.getEmail() %></td>
        <td><%= u.getBirthday() %></td>
        <td><%= u.getGender() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
<br>
<a href="register.jsp">Quay lại đăng ký</a>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="iuh.fit.se.bai02.model.Product" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Thêm vào giỏ</th>
    </tr>
    <%
        List<Product> products = (List<Product>) request.getAttribute("products");
        for(Product p : products) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td>$<%= p.getPrice() %></td>
        <td>
            <form action="cart" method="post">
                <input type="hidden" name="action" value="add">
                <input type="hidden" name="id" value="<%= p.getId() %>">
                <button type="submit">Thêm</button>
            </form>
        </td>
    </tr>
    <% } %>
</table>
<br>
<a href="cart">Xem giỏ hàng</a>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="iuh.fit.se.bai02.model.CartItem" %>
<html>
<head>
    <title>Giỏ hàng</title>
</head>
<body>
<h2>Giỏ hàng</h2>
<%
    Map<Integer, CartItem> cart = (Map<Integer, CartItem>) session.getAttribute("cart");
    if (cart == null || cart.isEmpty()) {
%>
<p>Giỏ hàng trống!</p>
<%
} else {
%>
<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Số lượng</th>
        <th>Tổng</th>
        <th>Hành động</th>
    </tr>
    <%
        double grandTotal = 0;
        for (CartItem item : cart.values()) {
            grandTotal += item.getTotal();
    %>
    <tr>
        <td><%= item.getProduct().getId() %></td>
        <td><%= item.getProduct().getName() %></td>
        <td>$<%= item.getProduct().getPrice() %></td>
        <td>
            <form action="cart" method="post" style="display:inline;">
                <input type="hidden" name="action" value="update">
                <input type="hidden" name="id" value="<%= item.getProduct().getId() %>">
                <input type="number" name="quantity" value="<%= item.getQuantity() %>" min="1">
                <button type="submit">Cập nhật</button>
            </form>
        </td>
        <td>$<%= item.getTotal() %></td>
        <td>
            <form action="cart" method="post" style="display:inline;">
                <input type="hidden" name="action" value="remove">
                <input type="hidden" name="id" value="<%= item.getProduct().getId() %>">
                <button type="submit">Xóa</button>
            </form>
        </td>
    </tr>
    <% } %>
    <tr>
        <td colspan="4"><b>Tổng cộng</b></td>
        <td colspan="2"><b>$<%= grandTotal %></b></td>
    </tr>
</table>
<% } %>
<br>
<a href="products">Tiếp tục mua sắm</a>
</body>
</html>

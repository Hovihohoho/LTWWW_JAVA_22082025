<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration Form</title>
</head>
<body>
<h2>User Registration Form</h2>

<% String errorMsg = (String) request.getAttribute("errorMsg"); %>
<% if (errorMsg != null) { %>
<p style="color:red;"><%= errorMsg %></p>
<% } %>

<form action="user" method="post">
    <input type="text" name="firstName" placeholder="First Name" required />
    <input type="text" name="lastName" placeholder="Last Name" required /><br/><br/>

    <input type="email" name="email" placeholder="Your Email" required /><br/><br/>
    <input type="email" name="reEmail" placeholder="Re-enter Email" required /><br/><br/>
    <input type="password" name="password" placeholder="New Password" required /><br/><br/>

    Birthday:
    <input type="date" name="birthday" /><br/><br/>

    Gender:
    <input type="radio" name="gender" value="Female" /> Female
    <input type="radio" name="gender" value="Male" /> Male
    <br/><br/>

    <button type="submit">Sign Up</button>
</form>
</body>
</html>

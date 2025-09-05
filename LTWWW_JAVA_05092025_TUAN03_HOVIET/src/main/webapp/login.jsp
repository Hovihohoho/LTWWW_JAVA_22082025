<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Student Registration</title></head>
<body bgcolor="#ADD8E6">
<form action="process.jsp" method="post">
    <h2>Student Registration Form</h2>

    First Name: <input type="text" name="firstName" maxlength="30"/><br/><br/>
    Last Name: <input type="text" name="lastName" maxlength="30"/><br/><br/>

    Date of Birth:
    <select name="day">
        <% for (int i = 1; i <= 31; i++) { %>
        <option><%= i %></option>
        <% } %>
    </select>
    <select name="month">
        <% for (int i = 1; i <= 12; i++) { %>
        <option><%= i %></option>
        <% } %>
    </select>
    <select name="year">
        <% for (int i = 1980; i <= 2020; i++) { %>
        <option><%= i %></option>
        <% } %>
    </select><br/><br/>

    Email: <input type="email" name="email"/><br/><br/>
    Mobile Number: <input type="text" name="mobile" maxlength="10"/><br/><br/>

    Gender:
    <input type="radio" name="gender" value="Male"/>Male
    <input type="radio" name="gender" value="Female"/>Female<br/><br/>

    Address: <textarea name="address"></textarea><br/><br/>
    City: <input type="text" name="city"/><br/><br/>
    Pincode: <input type="text" name="pincode"/><br/><br/>
    State: <input type="text" name="state"/><br/><br/>
    Country: <input type="text" name="country" value="India"/><br/><br/>

    Course Applies For:
    <input type="radio" name="course" value="BCA"/> BCA
    <input type="radio" name="course" value="B.Com"/> B.Com
    <input type="radio" name="course" value="B.Sc"/> B.Sc
    <input type="radio" name="course" value="B.A"/> B.A<br/><br/>

    <input type="submit" value="Submit"/>
    <input type="reset" value="Reset"/>
</form>
</body>
</html>

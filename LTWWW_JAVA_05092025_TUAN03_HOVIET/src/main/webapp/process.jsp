<%@ page import="iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.model.Student" %>
<jsp:useBean id="stu" class="iuh.fit.se.ltwww_java_05092025_tuan03_hoviet.model.Student" scope="request" />
<jsp:setProperty name="stu" property="*" />

<html>
<head><title>Registration Result</title></head>
<body>
<h2>Student Details Submitted</h2>

Name: <jsp:getProperty name="stu" property="firstName"/> <jsp:getProperty name="stu" property="lastName"/><br/>
Date of Birth: <jsp:getProperty name="stu" property="dob"/><br/>
Email: <jsp:getProperty name="stu" property="email"/><br/>
Mobile: <jsp:getProperty name="stu" property="mobile"/><br/>
Gender: <jsp:getProperty name="stu" property="gender"/><br/>
Address: <jsp:getProperty name="stu" property="address"/>, <jsp:getProperty name="stu" property="city"/><br/>
Pincode: <jsp:getProperty name="stu" property="pincode"/><br/>
State: <jsp:getProperty name="stu" property="state"/><br/>
Country: <jsp:getProperty name="stu" property="country"/><br/>
Course Applied: <jsp:getProperty name="stu" property="course"/><br/>
</body>
</html>

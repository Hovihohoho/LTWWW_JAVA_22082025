<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>User Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: #f2f2f2;
        }
        .form-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px #ccc;
            width: 350px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #222;
        }
        input[type=text], input[type=email], input[type=password], select {
            width: 100%;
            padding: 8px;
            margin: 6px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .row {
            display: flex;
            gap: 10px;
        }
        .row input {
            flex: 1;
        }
        .gender {
            margin: 10px 0;
        }
        button {
            width: 100%;
            padding: 10px;
            background: #3b5cff;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background: #2f48c9;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>User Registration Form</h2>
    <form action="register" method="post">
        <div class="row">
            <input type="text" name="firstName" placeholder="First Name" required>
            <input type="text" name="lastName" placeholder="Last Name" required>
        </div>
        <input type="email" name="email" placeholder="Your Email" required>
        <input type="email" name="reemail" placeholder="Re-enter Email" required>
        <input type="password" name="password" placeholder="New Password" required>

        <label>Birthday</label>
        <div class="row">
            <select name="month" required>
                <option value="">Month</option>
                <option>January</option>
                <option>February</option>
                <option>March</option>
                <!-- thêm các tháng khác -->
            </select>
            <select name="day" required>
                <option value="">Day</option>
                <% for(int i=1;i<=31;i++){ %>
                <option><%=i%></option>
                <% } %>
            </select>
            <select name="year" required>
                <option value="">Year</option>
                <% for(int i=2025;i>=1950;i--){ %>
                <option><%=i%></option>
                <% } %>
            </select>
        </div>

        <div class="gender">
            <label><input type="radio" name="gender" value="Female" required> Female</label>
            <label><input type="radio" name="gender" value="Male" required> Male</label>
        </div>

        <button type="submit">Sign Up</button>
    </form>
</div>
</body>
</html>

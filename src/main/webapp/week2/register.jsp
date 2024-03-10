<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/3/10
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User Registration!</title>
    <script>
        function validateForm() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            var email = document.getElementById("email").value;
            var birthdate = document.getElementById("birthdate").value;

            // Username validation
            if (username.trim() == "") {
                alert("Username is required.");
                return false;
            }

            // Password validation
            if (password.length < 8) {
                alert("Password must be at least 8 characters long.");
                return false;
            }

            // Email validation
            var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                alert("Please enter a valid email address.");
                return false;
            }

            // Birthdate validation
            var dateRegex = /^\d{4}-\d{2}-\d{2}$/;
            if (!dateRegex.test(birthdate)) {
                alert("Please enter a valid birthdate in yyyy-mm-dd format.");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
<h2>New User Registration!</h2>
<form onsubmit="return validateForm()">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="birthdate">Birthdate:</label>
    <input type="text" id="birthdate" name="birthdate" placeholder="YYYY-MM-DD" required><br><br>

    <input type="submit" value="Register">
</form>
</body>
</html>

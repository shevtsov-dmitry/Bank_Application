<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
<%-- css --%>
<style>
    body{
        background-color: black;
    }
    *{
        color:white;
    }
    label{
        font-size: 5em;
        font-family: Cambria;
    }
    input{
        background-color: #800e13;
        height: 50px;
        font-size: 3em;
        font-family: Cambria;
    }
</style>
<%-- html--%>
<form action="register" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br>
    <input type="submit" value="Register">
    <input type="submit" value="Approve" name="approve">
</form>
</body>
</html>
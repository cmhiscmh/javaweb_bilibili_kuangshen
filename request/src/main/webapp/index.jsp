<%--
  Created by IntelliJ IDEA.
  User: Time
  Date: 2022/10/31
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

<h1>login</h1>>

<div style="text-align: center">

<form action="${pageContext.request.contextPath}/login" method="post">
    username: <input type="text" name="username"><br>
    password: <input type="text" name="password"><br>
    hobby:
    <input type="checkbox" name="hobbys" value="girl">girl
    <input type="checkbox" name="hobbys" value="code">code
    <input type="checkbox" name="hobbys" value="sing">sing
    <input type="checkbox" name="hobbys" value="movie">movie

    <br>

    <input type="submit">
    </form>
</div>
</body>
</html>

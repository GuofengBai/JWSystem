<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>集成教务系统</title>
</head>
<body>
<form action="" method="post" name="login">
    <p>用户名</p><br>
    <input id="username" name="username" value="${username}" type="text">
    <p>密码</p><br>
    <input id="passowrd" name="passowrd" value="${password}" type="password">
    <p>登录</p><br>
    <input id="submit" value="登录" type="submit">
</form>
<a href="/admin">登录教务员账号</a>
</body>
</html>

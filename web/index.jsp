<%--
  Created by IntelliJ IDEA.
  User: Starry
  Date: 2023/10/18
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>留言页面</title>
</head>
<body>
<h1>留言页面</h1>

<form action="MessageServlet" method="POST">
  用户名称：<input type="text" name="user"><br>
  留言内容：<textarea name="message"></textarea><br>
  <input type="submit" value="提交">
</form>
</body>
</html>

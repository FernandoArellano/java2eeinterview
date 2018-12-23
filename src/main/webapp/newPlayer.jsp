<%--
  Created by IntelliJ IDEA.
  User: Fernando_Arellano
  Date: 12/23/2018
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>New Player</p>
<form action="/addPlayer" method="post">
    Name<input name="name" type="text"/><br>
    Number<input name="number" type="text"/><br>
    Position<input name="position" type="text"/><br>
    Age<input name="age" type="text"/><br>
    <input type="submit" value="Add Player">
</form>
</body>
</html>

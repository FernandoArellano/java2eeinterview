<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- page directive errorPage, isErrorPage, import, isElIgnored, session, contentType, language-->
<!-- taglib import tag library-->
<!-- include directive, includes a file at compilation-->
<%--
  Created by IntelliJ IDEA.
  User: Fernando_Arellano
  Date: 12/23/2018
  Time: 12:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
</head>
<body>

<c:if test="${teamName !=null}">
    Team ${teamName} selected
</c:if>
<br>
<p>Select Team</p>
<form action="setTeam" method="post">
<select name="teamName">
    <option value="America">America</option>
    <option value="Chivas">Chivas</option>
    <option value="Tigres">Tigres</option>
</select>
    <input type="submit" value="Select Team">
</form>
<a href="/addPlayer">Add Player</a>
<a href="/seePlayers">See Players for team</a>
<br><br>

Declaration
<%! int x=0; %>
<br>
Scriptlet

<% String cadena = "soy una cadena en scriptlet";
    x++;
%>
<br>
Expression
<br>
<%= cadena.toUpperCase()%>
<%= x%>
<br><br>

jsp:
<br>
<jsp:useBean id="equipo" class="com.virtualpairprogrammers.domain.Equipo">
    <jsp:setProperty name="equipo" property="name" value="America"/>
    <jsp:setProperty name="equipo" property="championships" value="13"/>
    <jsp:setProperty name="equipo" property="fundation" value="1916"/>
</jsp:useBean>
${equipo}

<br>
jsp:getProperty
<jsp:getProperty name="equipo" property="name"/>
<br>

<jsp:include page="americaCampeon.jsp"/>
<br>



</body>
</html>

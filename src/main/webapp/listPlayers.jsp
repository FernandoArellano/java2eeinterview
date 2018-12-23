<%--
  Created by IntelliJ IDEA.
  User: Fernando_Arellano
  Date: 12/23/2018
  Time: 12:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Lista de Jugadores ${teamName}
<c:forEach items="${jugadores}" var="jugador">
   <p>${jugador}</p>
</c:forEach>
<br>
JSTL
<!--  -->
c:out
<c:out value="<p>fer</p>"/>
<br>
<c:set value="Set Test" var="setTest" scope="request"/>
<br>
Set
<c:out value="${setTest}"/>
<br>
Remove
<c:remove var="setTest"/>
<c:out value="${setTest}" default="Default Set"/>
<br>
c:catch
<% String cadena = null;%>
<c:catch var="cachar">
    <% String cadena2 = cadena.toLowerCase();%>
</c:catch>

<c:if test="${cachar !=null}">
    <p>Exception: ${cachar} ${cachar.message}</p>
</c:if>
<br>
c:choose
<c:set var="x" value="9"/>
<c:choose>
    <c:when test="x%2==0">
        <p>El numero es par</p>
    </c:when>
    <c:otherwise>
        <p>Numero impar</p>
    </c:otherwise>
</c:choose>
<br>
c:url
<a href="<c:url value="login.html"/>">Go to Login</a>
</body>
</html>

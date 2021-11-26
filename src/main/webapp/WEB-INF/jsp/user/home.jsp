<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Witaj,<strong><c:out value="${user.firstName}"/><br/></strong> </h2>

<sec:authorize access="isAuthenticated()">
    <p><h2>Witaj,</h2> <sec:authentication property="principal.firstName"/></p>

</sec:authorize>

<%--<input type="hidden" name="id" value="${user.id}">--%>
<a href="/calculator">Kalkulator zapotrzebowania kalorycznego </a><br>
<a href="/logout">Wyloguj</a>
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Witaj,<strong><c:out value="${user.firstName}"/><br/></strong> </h2>
<input type="hidden" name="id" value="${user.id}">
<a href="/calculator">Kalkulator zapotrzebowania kalorycznego </a>
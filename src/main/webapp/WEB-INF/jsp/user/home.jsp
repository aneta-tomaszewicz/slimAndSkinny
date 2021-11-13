<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Witaj,<strong><c:forEach items ="${users}" var ="user"><${user.firstName}></c:forEach></strong> </h2>

<a href="/user/form/calculator">Kalkulator zapotrzebowania kalorycznego </a>
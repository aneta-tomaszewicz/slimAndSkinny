<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post">
    <div><label> Email: <input <%--type="email" --%>name="username" placeholder="Podaj adres email"/> </label></div>
    <div><label> Password: <input type="password" name="password" placeholder="Podaj hasło"/> </label></div>
    <div><input type="submit" value="Zaloguj"/></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<%--<form method="post">
    <input type="hidden" name="id" value="${user.id}">
    Login(email):<input name="email" placeholder="Podaj adres email"/><br>
    Hasło:<input name="password" type="password" placeholder="Podaj hasło"/><br>
    <input type="submit" value="Zaloguj">

</form>--%>

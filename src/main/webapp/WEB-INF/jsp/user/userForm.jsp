<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form:form method="post" modelAttribute="user" action ="/user/form/add">
    Login(email): <form:input path="email" type="email" placeholder ="Podaj adres email"/><br>
    Imię: <form:input path="firstName" placeholder ="Podaj swoje imię"/><br>
    Hasło:<form:input path="password" type="password" placeholder ="Podaj hasło"/><br>
<%--    Powtórz hasło:<form:input path="password" type="password"/><br>--%>
    <input type="submit" value="Załóż konto">

</form:form>
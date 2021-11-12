<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form:form method="post" modelAttribute="user">
    Login(email): <form:input path="email" type="email"/><br>
    Imię: <form:input path="firstName"/><br>
    Hasło:<form:input path="password" type="password"/><br>
<%--    Powtórz hasło:<form:input path="password" type="password"/><br>--%>
    <input type="submit" value="Załóż konto">

</form:form>
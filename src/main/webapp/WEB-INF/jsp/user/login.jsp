<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post">
    Login(email):<input name="email"/><br>
    Hasło:<input name="password" type="password"/><br>
    <input type="submit" value="Zaloguj">

</form>

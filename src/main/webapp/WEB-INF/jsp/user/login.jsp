<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post">

    Login(email):<input name="username" placeholder="Podaj adres email"/><br>
    Hasło:<input name="password" type="password" placeholder="Podaj hasło"/><br>

    <input type="submit" value="Zaloguj"/>

</form>



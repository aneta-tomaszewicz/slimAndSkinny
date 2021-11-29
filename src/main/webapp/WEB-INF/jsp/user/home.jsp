<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<sec:authorize access="isAuthenticated()">
  <p><h2>Witaj,</h2> <sec:authentication property="principal.username"/> </p>

</sec:authorize>


<%--
<sec:authorize access="isAuthenticated()">
<authentication-manager>
    <user-service id="springDataUserDetailsService"/>
</authentication-manager>
--%>



<a href="/calculator">Kalkulator zapotrzebowania kalorycznego </a><br>
<a href="/logout">Wyloguj</a>
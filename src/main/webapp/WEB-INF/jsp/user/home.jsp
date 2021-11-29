<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<sec:authorize access="isAuthenticated()">
 <h2>Witaj  <sec:authentication property="principal.username"/></h2> <br>

</sec:authorize>


<%--
<sec:authorize access="isAuthenticated()">
<authentication-manager>
    <user-service id="springDataUserDetailsService"/>
</authentication-manager>
--%>


<a href="/caloricDemand">Dzienne zapotrzebowanie kaloryczne </a><br>
<a href="/calculator">Kalkulator zapotrzebowania kalorycznego </a><br>
<a href="/logout">Wyloguj</a>
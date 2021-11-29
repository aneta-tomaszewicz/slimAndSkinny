<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<li><a href="#" th:href="@{/logout}"><span class="glyphicon glyphicon-log-out"></span> Wyloguj się</a></li>
<%--<sec:authorize access="isAuthenticated()">
    <form action="<c:url value="/logout"/>" method="get">
        <input type="submit" value="Wyloguj">
        &lt;%&ndash;<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>&ndash;%&gt;
    </form>
</sec:authorize>--%>

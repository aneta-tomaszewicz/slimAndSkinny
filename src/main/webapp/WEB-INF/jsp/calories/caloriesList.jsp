<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<a href="/add">Dodaj kalorie</a>


<table cellspacing="0" cellpadding="2" border="3" style="width: 100%;">
<thead>
<tr>
    <th>Dzień:</th>
    <th>Śniadanie:</th>
    <th>Drugie śniadanie:</th>
    <th>Obiad:</th>
    <th>Podwieczorek:</th>
    <th>Kolacja:</th>
    <th>Podsumowanie:</th>
    <th>Bilans:</th>
    <th>Akcja:</th>
</tr>
</thead>
<tbody>
<tr>
    <c:forEach items="${meal}" var="meal">
        <td><strong><c:out value="${meal.date}"/></strong></td>
        <td><c:out value="${meal.breakfast}"/></td>
        <td><c:out value="${meal.elevenses}"/></td>
        <td><c:out value="${meal.lunch}"/></td>
        <td><c:out value="${meal.tea}"/></td>
        <td><c:out value="${meal.supper}"/></td>
        <td><c:out value="${meal.sum}"/></td>
        <td><c:out value="${meal.dayBalance}"/></td>
        <td><a href="edit?idToEdit=${meal.id}">Edytuj </a><br>
        <a href="remove?idToRemove=${meal.id}">Usuń </a></td>

        </tr>

</c:forEach>
        </table>

<%--<a href="/add">Dodaj kalorie</a>
<hr>
<c:forEach items="${meal}" var="meal"><br>
    <strong><c:out value="${meal.date}"/></strong><br>
    <c:out value="${meal.breakfast}"/>
    <c:out value="${meal.elevenses}"/>
    <c:out value="${meal.lunch}"/>
    <c:out value="${meal.tea}"/>
    <c:out value="${meal.supper}"/>

    <a href="edit?idToEdit=${meal.id}">Edytuj </a>
    <a href="remove?idToRemove=${meal.id}">Usuń </a>

    <hr>
</c:forEach>--%>








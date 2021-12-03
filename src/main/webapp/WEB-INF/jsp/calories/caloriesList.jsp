<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<a href="/add">Dodaj kalorie</a>
<hr>

<strong><c:out value="${meal.date}"/></strong><br>
<c:out value="${meal.breakfast}"/>
<c:out value="${meal.elevenses}"/>
<c:out value="${meal.lunch}"/>
<c:out value="${meal.tea}"/>
<c:out value="${meal.supper}"/>
<table>
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
</tr>
</thead>
<tbody>

<tr>
    <td><c:out value="${meal.date}"/></td>
    <td><c:out value="${meal.breakfast}"/></td>
    <td><c:out value="${meal.lunch}"/></td>
    <td><c:out value="${meal.tea}"/></td>
    <td><c:out value="${meal.supper}"/></td>
    <td>${meal.supper}</td>
</tr>
</table>





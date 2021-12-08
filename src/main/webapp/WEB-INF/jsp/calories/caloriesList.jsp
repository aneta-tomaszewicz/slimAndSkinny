<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<h1>Witaj <c:out value="${user.firstName}"/> </h1>

<a href="/logout">Wyloguj</a>
<left> <a href="/add">Dodaj kalorie</a> </left>
<center><a href="/calculator">Policz na nowo zapotrzebowanie</a> </center>
<h3><p style="text-align: right">Dzienne zapotrzebowanie kaloryczne: <c:out value="${user.userDetails.caloriesDemand}"/></p></h3>




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
    <th>Limit dzienny:</th>
    <th>Bilans:</th>
    <th>Efekt:</th>
    <th>Akcja:</th>
</tr>
</thead>
<tbody>

    <c:forEach items="${meal}" var="meal">

<tr>
        <td><strong><c:out value="${meal.date}"/></strong></td>
        <td><c:out value="${meal.breakfast}"/></td>
        <td><c:out value="${meal.elevenses}"/></td>
        <td><c:out value="${meal.lunch}"/></td>
        <td><c:out value="${meal.tea}"/></td>
        <td><c:out value="${meal.supper}"/></td>
        <td><c:out value="${meal.sum}"/></td>
        <td><c:out value="${user.userDetails.caloriesDemand}"/></td>
        <td><c:out value="${meal.dayBalance}"/></td>

    <td> <c:choose>
        <c:when test="${meal.sum > user.userDetails.caloriesDemand}">
            Zjadłeś za dużo! </a><br>
        </c:when>

        <c:otherwise>
           Jest dobrze, tak trzymaj
        </c:otherwise>
    </c:choose></td>

        <td><a href="edit?idToEdit=${meal.id}">Edytuj </a><br>
        <a href="remove?idToRemove=${meal.id}">Usuń </a></td>

        </tr>

</c:forEach>

        </table>










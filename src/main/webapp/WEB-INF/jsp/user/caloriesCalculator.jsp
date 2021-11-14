<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="option" uri="http://www.springframework.org/tags/form" %>

<h2> Oblicz swoje zapotrzebowanie kaloryczne</h2>
<form:form method="post" modelAttribute="userDetails">
    <form:input type="hidden" path="id" value="${user.id}"/>
Płeć:
Kobieta:<form:radiobutton path ="gender" value="F"/>
Mężczyzna:<form:radiobutton path ="gender" value="M"/><br>
Wiek:<form:input path ="age"  placeholder="18-100 lat"/><br>
Wzrost:<form:input path ="height"  placeholder="cm"/><br>
Waga:<form:input path = "weight"  placeholder="kg"/><br>
Aktywność fizyczna:
    <form:select path="activity"><br/>
        <form:option value="-" label="--Wybierz--"/><br/>
        <form:options items="${activities}"/>
    </form:select><br/>
Cel:
    <form:select path="purpose"><br/>
        <form:option value="-" label="--Wybierz--"/><br/>
        <form:options items="${purposes}"/>
    </form:select><br/><br>

<input type="submit" value ="Oblicz">
</form:form>

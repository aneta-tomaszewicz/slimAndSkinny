<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2> Oblicz swoje zapotrzebowanie kaloryczne</h2>
<form method="post">
    <input type="hidden" name="id" value="${user.id}"/>
    Płeć:
    Kobieta:<input type="radio" name ="gender" value="655">
    Mężczyzna:<input type="radio" name ="gender" value="66"><br>
    Wiek:<input type="number" name="age" placeholder="18-100 lat"><br>
    Wzrost:<input type="number" name ="height" placeholder="cm"><br>
    Waga:<input type="number" name ="weight" placeholder="kg"><br>
    Aktywność fizyczna:<select name = "activity">
    <option value="">Wybierz ...</option>
    <option type ="number" value="1.2">Brak aktywności zawodowej, chory, leżący</option>
    <option type ="number" value="1.4">Pracownik biurowy, którego aktywność związana jest wyłącznie z obowiązkami domowymi</option>
    <option type ="number" value="1.6">Pracownik biurowy, trenujący 2-3 razy w tygodniu przez minimum godzinę</option>
    <option type ="number" value="1.8">Pracownik biurowy, trenujący 3-4 razy w tygodniu przez minimum godzinę</option>
    <option type ="number" value="2.0">Zawodowy sportowiec, trenujący minimum 6 godzin tygodniowo lub osoba ciężko pracująca fizycznie</option>
</select><br>
    Cel:
    chcę schudnąć <input type="radio" name ="purpose" value="-400" >
    chcę utrzymać wagę<input type="radio" name ="purpose" value="0" >
    chcę przytyć<input type="radio" name ="purpose" value="400" ><br>

    <input type="submit" value ="Oblicz">
</form>


<%--formularz do @ModelAttribute
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
</form:form>--%>

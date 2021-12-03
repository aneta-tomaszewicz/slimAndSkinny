<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form:form method="post" modelAttribute="meal">
    <h2> Dzień : <form:input type ="date" path="date"/></h2> <br>
    Śniadanie:<form:input placeholder="ilość kalorii" path="breakfast" /><br>
    Drugie śniadanie:<form:input type="number" path="elevenses" placeholder="ilość kalorii"/><br>
    Obiad:<form:input type="number" path ="lunch" placeholder="ilość kalorii"/><br>
    Podwieczorek:<form:input type="number" path ="tea" placeholder="ilość kalorii"/><br>
    Kolacja:<form:input type="number" path="supper" placeholder="ilość kalorii"/><br>

    <input type="submit" value ="Zapisz"><br></form:form>

<%--<form:form method="post" modelAttribute="meal">
  <h2> Dzień : <form:input type ="date" path="date"/></h2> <br>
Śniadanie:<form:input type="number" path="breakfast" placeholder="ilość kalorii"/>
    <input type="submit" value ="Zapisz"><br></form:form>

<form:form method="post" modelAttribute="meal">
Drugie śniadanie:<form:input type="number" path="elevenses" placeholder="ilość kalorii"/>
    <input type="submit" value ="Zapisz"><br>
</form:form>

    <form:form method="post" modelAttribute="meal">
Obiad:<form:input type="number" path ="lunch" placeholder="ilość kalorii"/>
    <input type="submit" value ="Zapisz"><br>
    </form:form>

    <form:form method="post" modelAttribute="meal">
Podwieczorek:<form:input type="number" path ="tea" placeholder="ilość kalorii"/>
    <input type="submit" value ="Zapisz"><br>
    </form:form>

    <form:form method="post" modelAttribute="meal">
Kolacja:<form:input type="number" path="supper" placeholder="ilość kalorii"/>
    <input type="submit" value ="Zapisz"><br>
    </form:form>--%>




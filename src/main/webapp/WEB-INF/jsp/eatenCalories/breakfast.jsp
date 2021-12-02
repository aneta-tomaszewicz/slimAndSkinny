<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:forEach items="${meals}" var="m">
<strong><c:out value="${m.date}: ${m.breakfast}"/></strong><br>
</c:forEach>
<c:out value="${user.date} ${user.brekfast} (${student.gender})"/><br>
${date}
${breakfast}
    Drugie śniadanie:<input type="number" name ="elevenses" placeholder="ilość kalorii">
    <input type="submit" value ="Zapisz"><br></form>
<form method="post">
    Obiad:<input type="number" name ="lunch" placeholder="ilość kalorii">
    <input type="submit" value ="Zapisz"><br></form>
<form method="post">
    Podwieczorek:<input type="tea" name ="weight" placeholder="ilość kalorii">
    <input type="submit" value ="Zapisz"><br></form>
<form method="post">
    Kolacja:<input type="supper" name="age" placeholder="ilość kalorii">
    <input type="submit" value ="Zapisz"><br></form>



</form>




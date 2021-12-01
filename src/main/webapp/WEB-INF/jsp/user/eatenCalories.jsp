<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<form method="post">
  <h2> Dzień : <input type ="date" name ="date"></h2> <br>
Śniadanie:<input type="number" name="breakfast" placeholder="ilość kalorii">
    <input type="submit" value ="Zapisz"><br></form>
<form method="post">
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

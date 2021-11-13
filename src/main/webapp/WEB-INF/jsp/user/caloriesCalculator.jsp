<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2> Oblicz swoje zapotrzebowanie kaloryczne</h2>
<form>
Płeć:
Kobieta:<input type="checkbox" name ="gender" value="F">
Mężczyzna:<input type="checkbox" name ="gender" value="M"><br>
Wiek:<input type="number" placeholder="18-100 lat"><br>
Wzrost:<input type="number" placeholder="cm"><br>
Waga:<input type="number" placeholder="kg"><br>
Aktywnośc fizyczna:<br>
Cel:<br>

<input type="submit" value ="Oblicz">
</form>

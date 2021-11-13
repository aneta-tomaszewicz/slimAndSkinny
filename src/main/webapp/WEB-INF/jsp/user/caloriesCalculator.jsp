<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2> Oblicz swoje zapotrzebowanie kaloryczne</h2>
<form>
Płeć:
Kobieta:<input type="radio" name ="gender" value="F" multiple ="false">
Mężczyzna:<input type="radio" name ="gender" value="M" multiple ="false"><br>
Wiek:<input type="number" placeholder="18-100 lat"><br>
Wzrost:<input type="number" placeholder="cm"><br>
Waga:<input type="number" placeholder="kg"><br>
Aktywność fizyczna:<select name = "activity">
    <option value="">Wybierz ...</option>
    <option value="1.2">Brak aktywności zawodowej, chory, leżący</option>
    <option value="1.4">Pracownik biurowy, którego aktywność związana jest wyłącznie z obowiązkami domowymi</option>
    <option value="1.6">Pracownik biurowy, trenujący 2-3 razy w tygodniu przez minimum godzinę</option>
    <option value="1.8">Pracownik biurowy, trenujący 3-4 razy w tygodniu przez minimum godzinę</option>
    <option value="2.0">Zawodowy sportowiec, trenujący minimum 6 godzin tygodniowo lub osoba ciężko pracująca fizycznie</option>
</select><br>
Cel:
    chcę schudnąć <input type="radio" name ="purpose" value="-400" multiple ="false">
    chcę utrzymać wagę<input type="radio" name ="purpose" value="1" multiple ="false">
    chcę przytyć<input type="radio" name ="purpose" value="400" multiple ="false"><br>

<input type="submit" value ="Oblicz">
</form>

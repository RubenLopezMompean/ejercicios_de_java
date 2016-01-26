<%-- 
    Document   : index
    Created on : 25-ene-2016, 20:41:40
    Author     : ruben

Ejercicio 5
Realiza un conversor de euros a pesetas.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>C12Ejercicio5</title>
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="euro">Introduce importe en euros: </label>
        <input type="number" id="euro" name="euro" value="" step="0.01"/>
      <br>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>

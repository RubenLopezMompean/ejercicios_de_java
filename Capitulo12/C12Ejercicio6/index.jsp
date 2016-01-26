<%-- 
    Document   : index
    Created on : 25-ene-2016, 20:52:16
    Author     : ruben
Ejercicio 6
Realiza un conversor de pesetas a euros.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>C12Ejercicio6</title>
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="peseta">Introduce importe en pesetas </label>
        <input type="number" id="peseta" name="peseta" value="" step="0.01"/>
      <br>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>

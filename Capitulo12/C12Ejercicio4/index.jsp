<%-- 
    Document   : C12Ejercicio4
    Created on : 25-ene-2016, 12:34:52
    Author     : ruben

Ejercicio 4
Realiza una aplicación que calcule la media de tres notas.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>C12Ejercicio4</title>
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="nota1">Introduce nota1: </label>
      <input type="number" id="nota1" name="nota1" value="" step="0.01"/>
      <br>
      <label for="nota2">Introduce nota2: </label>
      <input type="number" id="nota2" name="nota2" value="" step="0.01"/>
      <br>
      <label for="nota3">Introduce nota3: </label>
      <input type="number" id="nota3" name="nota3" value="" step="0.01"/>

      <br/>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>

<%-- 
    Document   : index
    Created on : 25-ene-2016, 21:04:27
    Author     : ruben

Ejercicio 8
Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
ese número. El resultado se debe mostrar en una tabla ( <table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>C08Ejercicio8</title>
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="multi">¿Qué tabla de multiplicar desea saber? </label>
        <input type="number" id="muti" name="multi" value="">
      <br>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>

<%-- 
    Document   : index
    Created on : 25-ene-2016, 20:58:13
    Author     : ruben

Ejercicio 7
Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>C12Ejercicio7</title>
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="peseta">Introduce importe en pesetas: </label>
        <input type="number" id="peseta" name="peseta" value="" step="0.01"/>
      <br>
      
      <label for="euro">Introduce importe en euros: </label>
        <input type="number" id="euro" name="euro" value="" step="0.01"/>
      <br>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>

<%-- 
    Document   : index
    Created on : 19-ene-2016, 10:58:35
    Author     : ruben

Ejercicio 3
Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <title>C12Ejercicio3</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" type="text/css" href="estilocss.css">
  </head>
  <body>
    <form action="index2.jsp" method="post">
      <label for="nombre">Escribe tu nombre: </label>
      <input type="text" id="nombre" name="nombre" value="" />

      <br/>

      <input type="submit" value="Enviar" />
    </form>
  </body>
</html>


<!DOCTYPE html>
<!--
Ejercicio 1
Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla.
La página principal debe ser un archivo con la extensión jsp . Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. Fíjate en la
dirección que aparece en la barra de direcciones del navegador.

@ Rubén López Mompeán

-->
<html>
  <head>
      <title>C12Ejercicio1</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
      
    <%out.println("Rubén López Mompeán");%> <br>
    <%out.println("Calle Martín de la Plaza");%> <br>
    <%
      out.println("Teléfono 64354323</br>");
      out.println("Málaga");
    %>

  </body>
</html>


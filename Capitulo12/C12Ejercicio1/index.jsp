<!DOCTYPE html>
<!--
Ejercicio 1
Crea una aplicaci�n web en Java que muestre tu nombre y tus datos personales por pantalla.
La p�gina principal debe ser un archivo con la extensi�n jsp . Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. F�jate en la
direcci�n que aparece en la barra de direcciones del navegador.

@ Rub�n L�pez Mompe�n

-->
<html>
  <head>
      <title>C12Ejercicio1</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
      
    <%out.println("Rub�n L�pez Mompe�n");%> <br>
    <%out.println("Calle Mart�n de la Plaza");%> <br>
    <%
      out.println("Tel�fono 64354323</br>");
      out.println("M�laga");
    %>

  </body>
</html>


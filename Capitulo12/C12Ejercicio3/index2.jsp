<%-- 
    Document   : index2
    Created on : 25-ene-2016, 12:07:16
    Author     : ruben
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 3</title>
  </head>
  <body>
    <%
      out.print("Hola");
    %>
    <br>
    <%
      out.print("Tu nombre es "+request.getParameter("nombre"));         
    %>
  </body>
</html>

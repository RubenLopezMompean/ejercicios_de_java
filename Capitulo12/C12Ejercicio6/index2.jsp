<%-- 
    Document   : index2
    Created on : 25-ene-2016, 20:54:28
    Author     : ruben
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <%
      double euros = 0.006;
      double pesetas = Double.parseDouble(request.getParameter("peseta"));
      double cambio = pesetas * euros;
      out.print("El cambio de " + request.getParameter("pesetas") + "pesetas a euros es de " + cambio + "€");        
    %>
  </body>
</html>

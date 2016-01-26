<%-- 
    Document   : index2
    Created on : 25-ene-2016, 21:01:00
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
    <br>
    <%
      pesetas = 166.386;
      euros = Double.parseDouble(request.getParameter("euro"));
      cambio = pesetas * euros;
      out.print("El cambio de " + request.getParameter("euro") + "€ a pesetas es de " + cambio + "pesetas");        
    %>
  </body>
</html>

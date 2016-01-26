<%-- 
    Document   : index2
    Created on : 25-ene-2016, 20:43:57
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
      double pesetas = 166.386;
      double euros = Double.parseDouble(request.getParameter("euro"));
      double cambio = pesetas * euros;
      out.print("El cambio de " + request.getParameter("euro") + "€ a pesetas es de " + cambio + "pesetas");        
    %>
  </body>
</html>

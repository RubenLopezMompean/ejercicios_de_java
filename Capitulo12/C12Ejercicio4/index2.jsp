<%-- 
    Document   : index2
    Created on : 25-ene-2016, 12:42:34
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
      out.print("La nota media es: ");
      double n1 = Double.parseDouble(request.getParameter("nota1"));
      double n2 = Double.parseDouble(request.getParameter("nota2"));
      double n3 = Double.parseDouble(request.getParameter("nota3"));

      out.print((n1 + n2 + n3) / 3);         
    %>
  </body>
</html>

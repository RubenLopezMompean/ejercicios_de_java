<%-- 
    Document   : index2
    Created on : 25-ene-2016, 21:07:14
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
    <% int tabla = Integer.parseInt(request.getParameter("multi"));%>
  <table>
    <%
      for(int i = 0; i < 11; i++){
      out.println("<tr><td>" + tabla + " x " + i + "</td><td>" + " = " + "</td><td>" + tabla * i + "</td></tr>");
      }
    %>
  </table>
  </body>
</html>

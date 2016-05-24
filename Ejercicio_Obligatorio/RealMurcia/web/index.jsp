<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Real Murcia C.F</title>
      <link rel="stylesheet" href="style.css">
  </head>
  <body>
        
    <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/real_murcia","root", "root");

        Statement bd = conexion.createStatement();

     request.setCharacterEncoding("UTF-8"); 
    %>
    <header class="main">
      <h1><img class="titulo" src="Real_Murcia_CF.png">REAL<br/>MURCIA CF</h1>
      <clear>
    </header>
        <div>
          <table>
            <tr id="trcabecera">
              <th id="cabecera" colspan="8">
                  Plantilla Real Murcia CF
              </th>
            </tr>

            <tr id="primeraFila">
              <td class="td1">Numero</td>
              <td>Nombre</td>
              <td>Apellidos</td>
              <td>FechNac</td>
              <td>DNI</td>
              <td>Nacionalidad</td>
              <td>Posicion</td>
              <td class="td2"></td>
            </tr>

          <!-- Linea de Alta -->
            <tr>
              <form method="post" action="index.jsp">
                <td  class="td1"><input type="text" name="numero" maxlength="5" size="5"></td>
                <td><input type="text" name="nombre"></td>
                <td><input type="text" name="apellidos"></td>
                <td><input type="text" name="edad" maxlength="4" size="4"></td>
                <td><input type="text" name="dni" maxlength="9" size="9"></td> 
                <td><input type="text" name="nacionalidad"></td> 
                <td><select name="posicion"><option>Portero</option>
                <option>Defensa</option><option>Centrocampista</option><option>Delantero</option></select></td>
                <td  class="td2"><input type="submit" value="Añadir"></td>
              </form>
            </tr>

        <%

          /*******************************************/
          /****************** Alta *******************/
          /*******************************************/

          if (request.getParameter("numero")!= null && !request.getParameter("nombre").equals("")) {

            String insert = "Insert INTO Plantilla Values ("
              + Integer.valueOf(request.getParameter("numero")) +  ", " +
              "'" + request.getParameter("nombre") + "', " +
              "'" + request.getParameter("apellidos") + "', " +
              "'" + request.getParameter("edad") + "', " +
              "'" + request.getParameter("dni") + "', " +
              "'" + request.getParameter("nacionalidad") + "', " +
              "'" + request.getParameter("posicion") + "')";

            bd.execute(insert);

          }

          /*******************************/
          /********* Borrado *************/
          /*******************************/

          if (request.getParameter("borrado") != null) {

            bd.execute ("DELETE FROM PLANTILLA WHERE CodJu=" + request.getParameter("borrado"));

          }

          /*******************************************/
          /***************** Update ******************/
          /*******************************************/

          if (request.getParameter("update") != null) {

            String update = "Update Plantilla SET Nombre='" + request.getParameter("nombreMod") + "', " +
              "Apellidos='" + request.getParameter("apellidosMod") + "', " +
              "Edad='" + request.getParameter("edadMod") + "', " +
              "DNI='" + request.getParameter("dniMod") + "', " +
              "Nacionalidad='" + request.getParameter("nacionalidadMod") + "', " +
              "Posicion='" + request.getParameter("posicionMod") + "' " +
              "Where CodJu=" + Integer.valueOf(request.getParameter("numeroMod"));

            bd.execute(update);
          }

          ResultSet listado = bd.executeQuery("SELECT * FROM Plantilla");

          while (listado.next()) {

            // Linea a modificar 

            if (request.getParameter("modnumero") != null && listado.getString("CodJu").equals(request.getParameter("modnumero")) ) {

              out.print("<tr><form method=\"post\" action=\"index.jsp\"><td class=\"td1\">" + 
                      "<input type=\"text\" name=\"numeroMod\" readonly size=\"5\" value=\"" + request.getParameter("modnumero") + "\"></td>" + 
                      "<td><input type=\"text\" name=\"nombreMod\" value=\"" + request.getParameter("modnombre") + "\"></td>" + 
                      "<td><input type=\"text\" name=\"apellidosMod\" value=\"" + request.getParameter("modapellidos") + "\"></td>" +
                      "<td><input type=\"text\" name=\"edadMod\" value=\"" + request.getParameter("modedad") + "\"></td>" +
                      "<td><input type=\"text\" name=\"dniMod\" maxlength=\"9\" size=\"9\" value=\"" + request.getParameter("moddni") + "\"></td>" +
                      "<td><input type=\"text\" name=\"nacionalidadMod\" value=\"" + request.getParameter("modnacionalidad") + "\"></td>" +
                      "<td><select name=\"posicionMod\">");

                      if (request.getParameter("modposicion").equals("Portero")) {
                          out.print("<option selected>Portero</option><option>Defensa</option>"
                                  + "<option>Centrocampista</option><option>Delantero</option></select></td>");
                      } else if (request.getParameter("modposicion").equals("Defensa")) {
                          out.print("<option selected>Portero</option><option>Defensa</option>"
                                  + "<option>Centrocampista</option><option>Delantero</option></select></td>");
                      } else if (request.getParameter("modposicion").equals("Centrocampista")) {
                          out.print("<option selected>Portero</option><option>Defensa</option>"
                                  + "<option>Centrocampista</option><option>Delantero</option></select></td>");
                      } else if (request.getParameter("modposicion").equals("Delantero")) {
                          out.print("<option selected>Portero</option><option>Defensa</option>"
                                  + "<option>Centrocampista</option><option>Delantero</option></select></td>");
                      }

              out.print("<td class=\"td2\"><input type=\"hidden\" name=\"update\" value=\"modifica\">" +
                        "<input type=\"submit\" value=\"Aceptar\">" + 
                        "<a href=\"index.jsp\"><input type=\"button\" value=\"Cancelar\"></a>" + 
                        "</td></form></tr>");

            } else {

              out.println("<tr>" + "<td class=\"td1\">" + listado.getString("CodJu") + "</td>" +
                      "<td>" + listado.getString("Nombre") + "</td>" +
                      "<td>" + listado.getString("Apellidos") + "</td>" +
                      "<td>" + listado.getString("Edad") + "</td>" +
                      "<td>" + listado.getString("DNI") + "</td>" + 
                      "<td>" + listado.getString("Nacionalidad") + "</td>" + 
                      "<td>" + listado.getString("Posicion") + "</td>" + 
                      "<td class=\"td2\">" + "<form method=\"post\" action=\"index.jsp\">" +

                      // Formulario boton borrado
                      "<input type=\"hidden\" name=\"borrado\" value=\"" + listado.getString("CodJu") + "\">" +
                      "<input type=\"submit\" value=\"Borrar\">" + "</form>" + // Fin formulario Borrado

                      // Formulario Boton Modificar
                      "<form method=\"post\" action=\"index.jsp\">" + 
                      "<input type=\"hidden\" name=\"modnumero\" value=\"" + listado.getString("CodJu") + "\">" +
                      "<input type=\"hidden\" name=\"modnombre\" value=\"" + listado.getString("Nombre") + "\">" +
                      "<input type=\"hidden\" name=\"modapellidos\" value=\"" + listado.getString("Apellidos") + "\">" +
                      "<input type=\"hidden\" name=\"modedad\" value=\"" + listado.getString("Edad") + "\">" +
                      "<input type=\"hidden\" name=\"moddni\" value=\"" + listado.getString("DNI") + "\">" +
                      "<input type=\"hidden\" name=\"modnacionalidad\" value=\"" + listado.getString("Nacionalidad") + "\">" +
                      "<input type=\"hidden\" name=\"modposicion\" value=\"" + listado.getString("Posicion") + "\">" +
                      "<input class=\"modificar\" type=\"submit\" value=\"Modificar\">" + "</form>" + 
                      "</td></tr>");
              }
          } 

        %>
      </div>
    </table>
  </body>
</html>

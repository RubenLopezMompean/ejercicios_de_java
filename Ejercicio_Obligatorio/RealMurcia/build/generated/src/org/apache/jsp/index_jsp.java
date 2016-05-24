package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <title>Real Murcia C.F</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("        \n");
      out.write("    ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/real_murcia","root", "root");

        Statement bd = conexion.createStatement();

     request.setCharacterEncoding("UTF-8"); 
    
      out.write("\n");
      out.write("    <header class=\"main\">\n");
      out.write("      <h1><img class=\"titulo\" src=\"Real_Murcia_CF.png\">REAL<br/>MURCIA CF</h1>\n");
      out.write("      <clear>\n");
      out.write("    </header>\n");
      out.write("        <div>\n");
      out.write("          <table>\n");
      out.write("            <tr id=\"trcabecera\">\n");
      out.write("              <th id=\"cabecera\" colspan=\"8\">\n");
      out.write("                  Plantilla Real Murcia CF\n");
      out.write("              </th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            <tr id=\"primeraFila\">\n");
      out.write("              <td class=\"td1\">Numero</td>\n");
      out.write("              <td>Nombre</td>\n");
      out.write("              <td>Apellidos</td>\n");
      out.write("              <td>FechNac</td>\n");
      out.write("              <td>DNI</td>\n");
      out.write("              <td>Nacionalidad</td>\n");
      out.write("              <td>Posicion</td>\n");
      out.write("              <td class=\"td2\"></td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("          <!-- Linea de Alta -->\n");
      out.write("            <tr>\n");
      out.write("              <form method=\"post\" action=\"index.jsp\">\n");
      out.write("                <td  class=\"td1\"><input type=\"text\" name=\"numero\" maxlength=\"5\" size=\"5\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"apellidos\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"edad\" maxlength=\"4\" size=\"4\"></td>\n");
      out.write("                <td><input type=\"text\" name=\"dni\" maxlength=\"9\" size=\"9\"></td> \n");
      out.write("                <td><input type=\"text\" name=\"nacionalidad\"></td> \n");
      out.write("                <td><select name=\"posicion\"><option>Portero</option>\n");
      out.write("                <option>Defensa</option><option>Centrocampista</option><option>Delantero</option></select></td>\n");
      out.write("                <td  class=\"td2\"><input type=\"submit\" value=\"Añadir\"></td>\n");
      out.write("              </form>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        ");


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

        
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

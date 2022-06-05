package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: magenta; \n");
      out.write("            }\n");
      out.write("           </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <h1>REGISTRAR DATOS</h1>\n");
      out.write("        <form action=\"registrardatos.do\" method=\"POST\">  \n");
      out.write("        <table border=\"1\" cellpadding=\"3\" cellspacing=\"3\" bgcolor=\"green\">\n");
      out.write("         <tr>\n");
      out.write("        <td align=\"right\"> Dui: </td> \n");
      out.write("        <td><input type=\"text\" name=\"dui\"></td> \n");
      out.write("        </tr>   \n");
      out.write("        <tr>  \n");
      out.write("        <td align=\"right\"> Apellido: </td> \n");
      out.write("        <td> <input type=\"text\" name=\"apellido\"> </td> \n");
      out.write("        </tr> \n");
      out.write("        <tr>  \n");
      out.write("        <td align=\"right\"> Nombre: </td> \n");
      out.write("        <td> <input type=\"text\" name=\"nombre\"> </td> \n");
      out.write("        </tr>   \n");
      out.write("        </table>\n");
      out.write("        <input type=\"submit\" value=\"Guardar\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <form action=\"mostrar.do\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Mostrar\"/>\n");
      out.write("        </form>\n");
      out.write("            <nav aria-label=\"breadcrumb\">\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("            </nav>\n");
      out.write("        <a href=\"/GuiaTarea/DatoEliminar.jsp\">Eliminar</a>\n");
      out.write("        <a href=\"/GuiaTarea/DatoModificar.jsp\">Modificar</a>\n");
      out.write("    </body>\n");
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

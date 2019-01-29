package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallerypage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        \r\n");
      out.write("        <title>LIT Galley Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"nav\" style=\"display: flex\">\r\n");
      out.write("       <div id=\"menu\"> \r\n");
      out.write("             <input id=\"profile\" type=\"submit\" name=\"menu\" value=\"Profile\">\r\n");
      out.write("             <a href=\"gallerypage.jsp\">Gallery</a>\r\n");
      out.write("             <a href=\"shows.jsp\">Shows</a>\r\n");
      out.write("             <a href=\"home.jsp\">Logout</a>\r\n");
      out.write("          \r\n");
      out.write("    </div>\r\n");
      out.write("       \r\n");
      out.write(" <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"mymenuFunction()\">\r\n");
      out.write("             <i class=\"fa fa-bars\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    </div>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"main\"> \r\n");
      out.write("     \r\n");
      out.write("    <header class=\"header\"> \r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("        <a href=\"gallery.jsp\">\r\n");
      out.write("    <img src=\"img/Logo.png\" alt=\"logo\">\r\n");
      out.write("        </a>\r\n");
      out.write("     </div>\r\n");
      out.write("           </header> \r\n");
      out.write("     <div class=\"profile\"> \r\n");
      out.write("     <form action=\"search\">\r\n");
      out.write("       <div id=\"search\">      \r\n");
      out.write("    <input id=\"searchbar\" type=\"text\" placeholder=\"Search..\">\r\n");
      out.write("    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>       \r\n");
      out.write("       </div> \r\n");
      out.write("     </form>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img2.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img1.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\"  src=\"img/img3.jpeg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img4.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img5.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img6.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img7.jpg\">\r\n");
      out.write("                </div> \r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <div class=\"imgBox\">\r\n");
      out.write("                    <img class=\"img-responsive image-resize\" src=\"img/img8.jpg\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    <h2>Whoopsie Doopsie</h2>\r\n");
      out.write("                        <p>This is a short description of things and stuff</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>  \r\n");
      out.write("             </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

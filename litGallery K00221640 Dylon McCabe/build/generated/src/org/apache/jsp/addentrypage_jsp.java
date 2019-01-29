package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addentrypage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <script src=\"js/nav.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("     \n");
      out.write(" </head>\n");
      out.write("    \n");
      out.write("<body onresize=\"returnmenuFunction()\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">                               \n");
      out.write("    <div class=\"nav\" style=\"display: flex\">\n");
      out.write("       <div id=\"menu\" style=\"display: flex\"> \n");
      out.write("             <a href=\"gallerypage.jsp\">Gallery</a>\n");
      out.write("             <a href=\"shows.jsp\">Shows</a>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write(" <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"mymenuFunction()\">\n");
      out.write("             <i class=\"fa fa-bars\"></i>\n");
      out.write("    </a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write(" <div class=\"homemain\"> \n");
      out.write("     \n");
      out.write("    <header class=\"header\"> \n");
      out.write("    <div id=\"logo\">\n");
      out.write("        <a href=\"gallery.jsp\">\n");
      out.write("    <img src=\"img/Logo.png\" alt=\"logo\">\n");
      out.write("        </a>\n");
      out.write("     </div>\n");
      out.write("           </header> \n");
      out.write("     <div class=\"home\"> \n");
      out.write("     <form action=\"search\">\n");
      out.write("       <div id=\"search\">      \n");
      out.write("    <input id=\"searchbar\" type=\"text\" name=\"search\" placeholder=\"Search..\">\n");
      out.write("    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>       \n");
      out.write("       </div> \n");
      out.write("     </form>\n");
      out.write("        <div class=\"homecont\">\n");
      out.write("        \n");
      out.write("        <div id=\"signin\">\n");
      out.write("\t\t            \n");
      out.write("                    \n");
      out.write("\t\t    <form action=\"UserController\" method=\"get\" class=\"login-form\" name=\"Login\"> \n");
      out.write("                        <input class=\"signininput\" type=\"text\" name=\"firstName\" id=\"firstName\" Placeholder=\"Title\"><br>\n");
      out.write("                        <input class=\"signininput\" type=\"text\" name=\"lastName\" id=\"LastName\" Placeholder=\"Description\"><br>\n");
      out.write("                        \n");
      out.write("                        <input class=\"signininput\" type=\"Email\" name=\"email\" id=\"Email\" Placeholder=\"Price\"><br>\n");
      out.write("                        \n");
      out.write("                       <input class=\"signininput\" type=\"Password\" name=\"password\" id=\"Password\" placeholder=\"image\"> <br>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                       <input id=\"signupbutton\" type=\"submit\" name=\"menu\" value=\"Upload Entry\">\n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("\t\t        </div>\n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("          \n");
      out.write("     </footer>\n");
      out.write("    </div>\n");
      out.write("\t</body>\n");
      out.write("\n");
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

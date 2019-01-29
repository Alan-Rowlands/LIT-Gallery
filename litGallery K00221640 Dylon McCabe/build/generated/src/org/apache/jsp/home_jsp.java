package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("        <script src=\"js/nav.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("     \r\n");
      out.write(" </head>\r\n");
      out.write("    \r\n");
      out.write("<body onresize=\"returnmenuFunction()\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">                               \r\n");
      out.write("    <div class=\"nav\" style=\"display: flex\">\r\n");
      out.write("       <div id=\"menu\" style=\"display: flex\"> \r\n");
      out.write("             <a href=\"gallerypage.jsp\">Gallery</a>\r\n");
      out.write("             <a href=\"shows.jsp\">Shows</a>\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("    </div>\r\n");
      out.write("       \r\n");
      out.write(" <a href=\"javascript:void(0);\" class=\"icon\" onclick=\"mymenuFunction()\">\r\n");
      out.write("             <i class=\"fa fa-bars\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write(" <div class=\"homemain\"> \r\n");
      out.write("     \r\n");
      out.write("    <header class=\"header\"> \r\n");
      out.write("    <div id=\"logo\">\r\n");
      out.write("        <a href=\"gallery.jsp\">\r\n");
      out.write("    <img src=\"img/Logo.png\" alt=\"logo\">\r\n");
      out.write("        </a>\r\n");
      out.write("     </div>\r\n");
      out.write("           </header> \r\n");
      out.write("     <div class=\"home\"> \r\n");
      out.write("     <form action=\"search\">\r\n");
      out.write("       <div id=\"search\">      \r\n");
      out.write("    <input id=\"searchbar\" type=\"text\" name=\"search\" placeholder=\"Search..\">\r\n");
      out.write("    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>       \r\n");
      out.write("       </div> \r\n");
      out.write("     </form>\r\n");
      out.write("        <div class=\"homecont\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"signin\">\r\n");
      out.write("\t\t            \r\n");
      out.write("                    \r\n");
      out.write("\t\t         <form action=\"UserController\" method=\"get\" class=\"login-form\" name=\"Login\"> \r\n");
      out.write("                        \r\n");
      out.write("                             <input class=\"signininput\" type=\"email\" name=\"email\" id=\"email\" Placeholder=\"Email\"><br>\r\n");
      out.write("                        \r\n");
      out.write("                       <input class=\"signininput\" type=\"password\" name=\"password\" id=\"password\" placeholder=\"Password\"> <br>\r\n");
      out.write("                        \r\n");
      out.write("                       <input id=\"signinbutton\" type=\"submit\" name=\"menu\" value=\"Sign In\">\r\n");
      out.write("                        \r\n");
      out.write("                      <h1 class=\"0r\">-or-</h1>\r\n");
      out.write("                        \r\n");
      out.write("                       <input id=\"signupbutton\" type=\"submit\" name=\"menu\" value=\"Sign Up\">\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("           </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("          \r\n");
      out.write("     </footer>\r\n");
      out.write("    </div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

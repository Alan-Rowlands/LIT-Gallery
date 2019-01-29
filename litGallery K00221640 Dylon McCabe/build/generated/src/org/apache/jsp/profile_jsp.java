package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;
import model.Entry;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>Profile</title>\r\n");
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
      out.write("       <div id=\"menu\"> \r\n");
      out.write("             <a href=\"profile.jsp\" style=\"background-color: #730109\">Profile</a>\r\n");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write(" <div class=\"main\"> \r\n");
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
      out.write("    <input id=\"searchbar\" type=\"text\" name=\"search\" placeholder=\"Search..\">\r\n");
      out.write("    <button type=\"submit\"><i class=\"fa fa-search\"></i></button>       \r\n");
      out.write("       </div> \r\n");
      out.write("     </form>\r\n");
      out.write("     \r\n");
      out.write("          <div id=\"proftop\"> \r\n");
      out.write("            <div id=\"profoimageside\"> \r\n");
      out.write("                <form action=\"UserController\" method=\"get\" class=\"login-form\" name=\"Login\">\r\n");
      out.write("    <img  src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.profilePic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.profilePic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("                <div id=\"profbuttons\">\r\n");
      out.write("                    \r\n");
      out.write("               <a  href=\"updateprofile.jsp\">\r\n");
      out.write("     \r\n");
      out.write("                   <input id=\"editprof\" type=\"submit\" name=\"menu\" value=\"Edit Profile\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"accountsettings.jsp\">\r\n");
      out.write("     <button  id=\"accountset\" type=\"button\">Account Settings</button> \r\n");
      out.write("                    </a>\r\n");
      out.write("    \r\n");
      out.write("            </div>  \r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("           <div id=\"bio\">\r\n");
      out.write("            <div  id=\"biohead\">  \r\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("               </div>\r\n");
      out.write("              <div id=\"bioinput\"> \r\n");
      out.write("          <p >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.bio}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p> \r\n");
      out.write("               </div> \r\n");
      out.write("              \r\n");
      out.write("          </div>  \r\n");
      out.write("              <form action=\"EntryController\" method=\"get\" class=\"login-form\" name=\"Login\"> \r\n");
      out.write("                    \r\n");
      out.write("                       <input id=\"signupbutton\" type=\"submit\" name=\"menu\" value=\"showEntries\">\r\n");
      out.write("                       <input id=\"signupbutton\" type=\"submit\" name=\"menu\" value=\"Upload new Entry\">\r\n");
      out.write("                        \r\n");
      out.write("                    </form>\r\n");
      out.write("      </div>                \r\n");
      out.write("                \r\n");
      out.write("           <div id=\"profbottom\">\r\n");
      out.write("               <div class=\"responsive\"> \r\n");
      out.write("                 ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("         </div>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("     </div>  \r\n");
      out.write("    </div>       \r\n");
      out.write("</body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("entries");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allEntries}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                  \r\n");
          out.write("\r\n");
          out.write("                          \r\n");
          out.write("                <div class=\"profgallery\">\r\n");
          out.write("                 \r\n");
          out.write("            <a target=\"\" href=\"EntryController?menu=getEntryView&entry_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.entryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                \r\n");
          out.write("      <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"300 px\" height=\"200 px\" value=\"getEntryView\">\r\n");
          out.write("                \r\n");
          out.write("            </a> \r\n");
          out.write("            <div class=\"desc\">\r\n");
          out.write("                <span class=\"fa fa-star checked\"></span>\r\n");
          out.write("                <span class=\"fa fa-star checked\"></span>\r\n");
          out.write("                <span class=\"fa fa-star checked\"></span>\r\n");
          out.write("                <span class=\"fa fa-star checked\"></span>\r\n");
          out.write("                <span class=\"fa fa-star\"></span>\r\n");
          out.write("                <p class=\"descreview\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\r\n");
          out.write("                <p class=\"uploaddesc\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\r\n");
          out.write("                <p class=\"uploaddesc\">Ratings  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.rating}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\r\n");
          out.write("<!--                <p class=\"uploaddesc\" type=\"hidden\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entries.entryId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>-->\r\n");
          out.write("                \r\n");
          out.write("            </div> \r\n");
          out.write("         \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

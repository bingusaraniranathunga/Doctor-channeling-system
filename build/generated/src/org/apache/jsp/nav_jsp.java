package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Health Guard</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/newcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.3/css/fontawesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"page\"></div>\n");
      out.write("        <nav class=\"nav\">\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("  \t<div class=\"container\">\n");
      out.write("  \t \t<div class=\"row\">\n");
      out.write("  \t \t\t<div class=\"footer-col\">\n");
      out.write("  \t \t\t\t<h4>Health Guard</h4>\n");
      out.write("  \t \t\t\t<ul>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">history</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">privacy policy</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">terms and conditions</a></li>\n");
      out.write("                                        <li><a href=\"#\">feedback</a></li>\n");
      out.write("  \t \t\t\t</ul>\n");
      out.write("  \t \t\t</div>\n");
      out.write("  \t \t\t<div class=\"footer-col\">\n");
      out.write("  \t \t\t\t<h4>get help</h4>\n");
      out.write("  \t \t\t\t<ul>\n");
      out.write("                                    <li><a href=\"#\">FAQ</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">payment options</a></li>\n");
      out.write("  \t \t\t\t</ul>\n");
      out.write("  \t \t\t</div>\n");
      out.write("  \t \t\t<div class=\"footer-col\">\n");
      out.write("  \t \t\t\t<h4>about</h4>\n");
      out.write("  \t \t\t\t<ul>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">the company</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">investor relations</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">partners</a></li>\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">careers</a></li>\n");
      out.write("  \t \t\t\t</ul>\n");
      out.write("  \t \t\t</div>\n");
      out.write("  \t \t\t<div class=\"footer-col\">\n");
      out.write("  \t \t\t\t<h4>follow us</h4>\n");
      out.write("  \t \t\t\t<div class=\"social-links\">\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("  \t \t\t\t</div>\n");
      out.write("  \t \t\t</div>\n");
      out.write("  \t \t</div>\n");
      out.write("  \t</div>\n");
      out.write("    </footer>\n");
      out.write("        </nav>\n");
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

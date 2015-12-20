package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body background =\"http://i.imgur.com/Eor57Ae.jpg\">\n");
      out.write("        <form method=\"post\" action=\"registration.jsp\">\n");
      out.write("             <link href='newcss.css' rel='stylesheet' type='text/css'>\n");
      out.write("            <center>\n");
      out.write("                <div class=\"login-block\">\n");
      out.write("                <p> Enter Information Here</p>\n");
      out.write("                    \n");
      out.write("                   <input type=\"text\" name=\"firstname\" value=\"\" placeholder=\"firstname\" id=\"firstname\" />\n");
      out.write("                    \n");
      out.write("                   <br>\n");
      out.write("                    \n");
      out.write("                      <input type=\"text\" name=\"lastname\" value=\"\" placeholder=\"lastname\" id=\"lastname\"/>\n");
      out.write("                    \n");
      out.write("                   <br>\n");
      out.write("                      \n");
      out.write("                        <input type=\"text\" name=\"email\" value=\"\" placeholder=\"abc@example.com\" id=\"email\" />\n");
      out.write("                    <br>\n");
      out.write("                  <input type=\"text\" name=\"username\" value=\"\" placeholder=\"Username\" id=\"username\" />\n");
      out.write("                  <br>\n");
      out.write("    <input type=\"password\"  name=\"password\" value=\"\" placeholder=\"Password\" id=\"password\" />\n");
      out.write("    <br>\n");
      out.write("   <input type=\"submit\" value=\"Login\" /><br>\n");
      out.write("   <input type=\"reset\" value=\"Reset\" /><br>\n");
      out.write("     Already registered!! <a href=\"index.jsp\">Login Here</a>\n");
      out.write("     </div>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
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

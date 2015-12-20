package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" \" />\n");
      out.write("        <title>SV HOTEL</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"C:\\Users\\Varshiniv\\Desktop\\images\\bb.jpg\">\n");
      out.write("<div id=\"container\">\n");
      out.write("  <div id=\"header\"> <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\logo.jpg\" width=\"328\" height=\"71\" alt=\"\" id=\"logo\"/> <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\slogan.jpg\" width=\"310\" height=\"77\" alt=\"\" id=\"slogan\"/>\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("        <li class=\"btn_1\"><a href=\"#\">home page</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_2\"><a href=\"#\">about us</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_3\"><a href=\"#\">services</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_4\"><a href=\"#\">rooms</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_5\"><a href=\"#\">booking</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_6\"><a href=\"#\">gallery</a></li>\n");
      out.write("      <li class=\"line\"></li>\n");
      out.write("      <li class=\"btn_7\"><a href=\"#\">contacts</a></li>\n");
      out.write("    </ul>\n");
      out.write("      </div>\n");
      out.write("  <div id=\"content\">\n");
      out.write("    <div id=\"leftPan\">\n");
      out.write("      <div id=\"room\">\n");
      out.write("        <h2></h2>\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img_has.jpg\" width=\"179\" height=\"81\" alt=\"\" />\n");
      out.write("        <p><span class=\"headline\">the ultimate luxury and comfort that meets your expectation!!!</span><br />\n");
      out.write("          </p>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\">AC </a></li>\n");
      out.write("          <li><a href=\"#\">WATER BED </a></li>\n");
      out.write("          <li><a href=\"#\">SMALL KITCHEN SETUP</a></li>\n");
      out.write("          <li><a href=\"#\">HOME THEATRE</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"rightPan\">\n");
      out.write("      <div id=\"welcome to sv hotel\">\n");
      out.write("        <h2></h2>\n");
      out.write("        <p><span class=\"headline\">ENJOY THE JOURNEY WITH US!!!!!!!!!</span><br /><div class=\"servItem\">\n");
      out.write(" \n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"services\">\n");
      out.write("        <h2></h2>\n");
      out.write("        <div class=\"servItem\"> <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img_services.jpg\" width=\"45\" height=\"40\" alt=\"\" />\n");
      out.write("          <p><span class=\"headline\">STAR NIGHTS</span><br />\n");
      out.write("            </p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"servItem\"> <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img_services-14.jpg\" width=\"45\" height=\"40\" alt=\"\" />\n");
      out.write("          <p><span class=\"headline\">SPECIAL BUFFET</span><br />\n");
      out.write("            </p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"servItem\"> <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img_services-15.jpg\" width=\"45\" height=\"40\" alt=\"\" />\n");
      out.write("          <p><span class=\"headline\">Scuba DIVING</span><br />\n");
      out.write("            </p>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\" id=\"end\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <p><a href=\"#\">HOME PAGE</a> | <a href=\"#\">ABOUT US</a> | <a href=\"#\">SERVICES</a> | <a href=\"#\">ROOMS</a> | <a href=\"#\">BOOKING</a> | <a href=\"#\">GALLERY</a> | <a href=\"#\">NEWS</a> | <a href=\"#\">CONTACTS</a><br/>\n");
      out.write("    </a></p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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

package org.apache.jsp;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("    #tabContainer {\n");
      out.write("  padding: 25px 15px 0 15px;\n");
      out.write("  background: black;\n");
      out.write("}\n");
      out.write("ul#topTab {\n");
      out.write("  list-style-type: none;\n");
      out.write("  width: 100%;\n");
      out.write("  position: relative;\n");
      out.write("  height: 27px;\n");
      out.write("  font-size: 13px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 11px 0 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li {\n");
      out.write("  display: block;\n");
      out.write("  float: left;\n");
      out.write("  margin: 0 0 0 4px;\n");
      out.write("  height: 27px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li.left {\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li a {\n");
      out.write("  display: block;\n");
      out.write("  float: left;\n");
      out.write("  color: #0ff;\n");
      out.write("  background: #4A6867;\n");
      out.write("  line-height: 27px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  padding: 0 17px 0 18px;\n");
      out.write("  height: 27px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li a.right {\n");
      out.write("  padding-right: 19px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li a:hover {\n");
      out.write("  background: #2E4560;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li a.current {\n");
      out.write("  color: #2E4560;\n");
      out.write("  background: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul#topTab li a.current:hover {\n");
      out.write("  color: #2E4560;\n");
      out.write("  background: #fff;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("  <body bgcolor=\"grey\">\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\"/>\n");
      out.write("    <div id=\"tabContainer\">\n");
      out.write("        <marquee><img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\a.jpg\" width=\"1300\" height=\"300\" alt=\"\" /></marquee>\n");
      out.write("        <ul id=\"topTab\">\n");
      out.write("            \n");
      out.write("            <li><a href=\"\" title=\"Home\" class=\"current\">Home</a></li>\n");
      out.write("            <li><a href=\"index.jsp\" title=\"Home\">Login</a></li>\n");
      out.write("            <li><a href=\"abt.jsp\" title=\"Home\">About Us</a></li>\n");
      out.write("            <li><a href=\"booking.jsp\" title=\"Home\">Booking</a></li>\n");
      out.write("            <li><a href=\"gallery.jsp\" title=\"Home\">Gallery</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("\n");
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
      out.write("  \n");
      out.write("      \n");
      out.write(" \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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

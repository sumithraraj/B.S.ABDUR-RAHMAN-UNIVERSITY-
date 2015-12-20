package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class abt_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write(" <style type=\"text/css\">\n");
      out.write("    #tabContainer {\n");
      out.write("  padding: 25px 15px 0 150px;\n");
      out.write("  background: black;\n");
      out.write("}\n");
      out.write("  #tabContainer1 {\n");
      out.write("  padding: 25px 10px 0px 150px;\n");
      out.write("  background: pink;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(" </style>\n");
      out.write("<link href='css.css' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='newcss2.css' rel='stylesheet' type='text/css'>\n");
      out.write("<body>\n");
      out.write("   <div id=\"tabContainer\">\n");
      out.write("       \n");
      out.write("        <marquee><img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\a.jpg\" width=\"1300\" height=\"300\" alt=\"\" /></marquee>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("        <div id=\"tabContainer1\">\n");
      out.write("            <div id=\"content\">  \n");
      out.write("        <h1>ABOUT US</h1>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <font  size=\"4\">\n");
      out.write("        <p> <b>WELCOME TO SV HOTEL</b></p>\n");
      out.write("        <br><br><br>\n");
      out.write("        <font  size=\"4\">\n");
      out.write("        <font  size=\"2\">\n");
      out.write("        <li>Your vacation begins with us!  Relax by the pool, spend a day at the beach or pamper yourself in our luxurious spa.</li> <br>\n");
      out.write("         <li>Whatever you look for in a vacation you will find it here </li>\n");
      out.write("<br>\n");
      out.write("          <li>A unique collection of deluxe indian hotels</li>\n");
      out.write("<br>\n");
      out.write("            <li>SV Hotel is an exclusive collection of deluxe chennai Hotels.</li>\n");
      out.write("<br>\n");
      out.write("<li>Whilst each of these hotels in outer chennai is different with its own unique identity and style, each provides the same high levels of comfort and service to its guests.\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("</li>\n");
      out.write(" </font>\n");
      out.write("</div>\n");
      out.write("            <br><br><br><br>\n");
      out.write("<p><font  size=\"4\">TO KNOW MORE ...CLICK ABOUT US</font> </p>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("        <div id=\"footer\">\n");
      out.write("    \n");
      out.write("    <p><a href=\"http://svhotel.my-free.website/about-us\"><font  size=\"4\">ABOUT US! ||</font></a> <a href=\"http://svhotel.my-free.website/contact-us\"><font  size=\"4\">GOOGLE US!</font></a> \n");
      out.write("</p>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html> ");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>ROOMS</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("  .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 70%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<CENTER><h2><marquee><font face=\"Comic sans MS\"><font size=\"3\" color=\"pink\">------ALL KINDS OF ROOMS AVAILABLE HERE--------</font></marquee></h2></CENTER>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("       <li data-target=\"#myCarousel\" data-slide-to=\"7\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\ippp\\poo.jpg\" alt=\"Chania\" width=\"160\" height=\"145\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\ippp\\s.jpg\" alt=\"Chania\" width=\"160\" height=\"145\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\ippp\\R.jpg\" alt=\"Flower\" width=\"160\" height=\"145\">\n");
      out.write("      </div>\n");
      out.write("          <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\b_header.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img_activities.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img1.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("        <div class=\"item\">\n");
      out.write("        <img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\img2.jpg\" alt=\"Flower\" width=\"460\" height=\"345\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<body background =\"C:\\Users\\Varshiniv\\Desktop\\ippp\\bb.jpg\" style=\"background-repeat:no-repeat; background-position:center; background-size:100% 100%; background-color:pink;\" >\n");
      out.write("<font face=\"Comic sans MS\"> <font size=\"3\" color=\"green\"><marquee>A CLASSY,COSY ROOMS AT YOUR AFFORD</marquee></font>\n");
      out.write("</body>\n");
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

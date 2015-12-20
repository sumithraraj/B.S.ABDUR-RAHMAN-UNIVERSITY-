package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            function book(){\n");
      out.write("                alert(\"BOOKED\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <title></title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("           \n");
      out.write("        <link href=\"newcss2.css\" rel=\"stylesheet\" />\n");
      out.write("        <body>\n");
      out.write("           <form method=\"post\" action=\"book.jsp\" onsubmit=\"book()\">\n");
      out.write("           \n");
      out.write("            <div id=\"tabContainer\">\n");
      out.write("                <marquee><img src=\"C:\\Users\\Varshiniv\\Desktop\\images\\a.jpg\" width=\"1300\" height=\"300\" alt=\"\" /></marquee>\n");
      out.write("                   \n");
      out.write("                \n");
      out.write("               <div class=\"login-block\">\n");
      out.write("                    <h2 class=\"heading\">Booking & contact</h2>\n");
      out.write("                    \n");
      out.write("                         \n");
      out.write("                              \n");
      out.write("                        <label for=\"name\"><font color=\"black\"/>Name</label>\n");
      out.write("                        <input type=\"text\" id=\"name\" class=\"floatLabel\" name=\"name\" placeholder=\"name\" />\n");
      out.write("                        <label for=\"phone\">Phone</label>\n");
      out.write("                        <input type=\"text\" id=\"phone\" class=\"floatLabel\" name=\"phone\" placeholder=\"PHONE NO ex:1234567891\" />\n");
      out.write("                          <label for=\"city\">City</label>\n");
      out.write("                             <input type=\"text\" id=\"city\" class=\"floatLabel\" name=\"city\" placeholder=\"City\" />  \n");
      out.write("                     <label for=\"country\">Country</label>\n");
      out.write("                     <input type=\"text\" id=\"country\" class=\"floatLabel\" name=\"country\" placeholder=\"Country\" />\n");
      out.write("             \n");
      out.write("                       <label for=\"checkin\">Checkin</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"chin\" placeholder=\"dd/mm/yy\" />   \n");
      out.write("                     <label for=\"checkout\">Checkout</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"chout\" placeholder=\"dd/mm/yy\" />\n");
      out.write("                  \n");
      out.write("<label for=\"people\">People</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"nop\" />\n");
      out.write("                  <label for=\"rooms\">Rooms</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"nor\"  />\n");
      out.write("                  <label for=\"Room Type\">RoomType</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"roomt\"  />\n");
      out.write("                   <label for=\"Room amount\">RoomAmount</label>\n");
      out.write("                     <input type=\"text\" id=\"\" class=\"floatLabel\" name=\"ramt\"  />\n");
      out.write("        <button type=\"submit\" value=\"Submit\" class=\"col-1-4\">Submit</button>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("     </div> \n");
      out.write(" \n");
      out.write("                     </div> \n");
      out.write("               \n");
      out.write("           </form>\n");
      out.write("</body>\n");
      out.write("</head>\n");
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

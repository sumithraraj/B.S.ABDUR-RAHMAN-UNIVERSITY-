package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

    String nop  = request.getParameter("nop");    
    String nor= request.getParameter("nor");
   // String ramt = request.getParameter("ramt");
   String roomt = request.getParameter("roomt");
    String name = request.getParameter("name");
     String check1 = request.getParameter("chin");
    String check2 = request.getParameter("chout");
    String pno=request.getParameter("phone");
     String city=request.getParameter("city");
      String country =request.getParameter("country");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/dbb",
            "ad", "aa");
    Statement st = con.createStatement();
    //ResultSet rs;
    //rs=st.executeQuery("select ramt from amt where roomt='" + roomt + "' and nor='" + nor + "' ");
    st.executeUpdate("insert into book(name,chin,chout,phone,city,country,nop,nor,roomt) values ('" + name + "','" + check1+ "','" + check2 + "','" + pno + "','" + city + "','" + country+ "','" + nop+ "','" + nor+ "','" + roomt+ "')");
   /*if (rs.next()) {
        session.setAttribute("ramt", ramt);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
  
        
    }*/
    response.sendRedirect("success.jsp");

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

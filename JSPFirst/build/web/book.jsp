<%@ page import ="java.sql.*" %>
<%
    String nop  = request.getParameter("nop");    
    String nor= request.getParameter("nor");
   //String ramt = request.getParameter("ramt");
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
%>
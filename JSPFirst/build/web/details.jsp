<%-- 
    Document   : details
    Created on : Oct 29, 2015, 10:50:31 AM
    Author     : Varshiniv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">


<style type="text/css">
    #tabContainer {
  padding: 25px 15px 0 15px;
  background: black;
}
ul#topTab {
  list-style-type: none;
  width: 100%;
  position: relative;
  height: 27px;
  font-size: 13px;
  font-weight: bold;
  margin: 0;
  padding: 11px 0 0 0;
}

ul#topTab li {
  display: block;
  float: left;
  margin: 0 0 0 4px;
  height: 27px;
}

ul#topTab li.left {
  margin: 0;
}

ul#topTab li a {
  display: block;
  float: left;
  color: #0ff;
  background: #4A6867;
  line-height: 27px;
  text-decoration: none;
  padding: 0 17px 0 18px;
  height: 27px;
}

ul#topTab li a.right {
  padding-right: 19px;
}

ul#topTab li a:hover {
  background: #2E4560;
}

ul#topTab li a.current {
  color: #2E4560;
  background: #fff;
}

ul#topTab li a.current:hover {
  color: #2E4560;
  background: #fff;
}
</style>
</head>
  <body bgcolor="grey">
<link href="css.css" rel="stylesheet"/>
    <div id="tabContainer">
        <marquee><img src="C:\Users\Varshiniv\Desktop\images\a.jpg" width="1300" height="300" alt="" /></marquee>
        <ul id="topTab">
            
            <li><a href="" title="Home" class="current">Home</a></li>
            <li><a href="index.jsp" title="Home">Login</a></li>
            <li><a href="abt.jsp" title="Home">About Us</a></li>
            <li><a href="booking.jsp" title="Home">Booking</a></li>
            <li><a href="gallery.jsp" title="Home">Gallery</a></li>
            
        </ul>
    </div>

  <div id="content">
    <div id="leftPan">
      <div id="room">
        <h2></h2>
        <img src="C:\Users\Varshiniv\Desktop\images\img_has.jpg" width="179" height="81" alt="" />
        <p><span class="headline">the ultimate luxury and comfort that meets your expectation!!!</span><br />
          </p>
        <ul>
          <li><a href="#">AC </a></li>
          <li><a href="#">WATER BED </a></li>
          <li><a href="#">SMALL KITCHEN SETUP</a></li>
          <li><a href="#">HOME THEATRE</a></li>
        </ul>
      </div>
    </div>
    <div id="rightPan">
      <div id="welcome to sv hotel">
        <h2></h2>
        <p><span class="headline">ENJOY THE JOURNEY WITH US!!!!!!!!!</span><br /><div class="servItem">
 
        <div class="clear"></div>
      </div>
      <div id="services">
        <h2></h2>
        <div class="servItem"> <img src="C:\Users\Varshiniv\Desktop\images\img_services.jpg" width="45" height="40" alt="" />
          <p><span class="headline">STAR NIGHTS</span><br />
            </p>
          <div class="clear"></div>
        </div>
        <div class="servItem"> <img src="C:\Users\Varshiniv\Desktop\images\img_services-14.jpg" width="45" height="40" alt="" />
          <p><span class="headline">SPECIAL BUFFET</span><br />
            </p>
          <div class="clear"></div>
        </div>
        <div class="servItem"> <img src="C:\Users\Varshiniv\Desktop\images\img_services-15.jpg" width="45" height="40" alt="" />
          <p><span class="headline">Scuba DIVING</span><br />
            </p>
          <div class="clear"></div>
        </div>
      </div>
    </div>
    <div class="clear" id="end"></div>
  </div>
  
      
 
    
</div>
  </div>
</div>

</body>
</html>

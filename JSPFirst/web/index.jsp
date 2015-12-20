<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
          <link href="newcss1.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <form method="post" action="login.jsp">
            <center>
<div class="login-block">
    <h1>Login</h1>
    <input type="text" name="username" value="" placeholder="Username" id="username" />
    <input type="password"  name="password" value="" placeholder="Password" id="password" />
    <input type="submit" value="Login"  />
   <input type="reset" value="Reset" />
   Yet Not Registered!! <a href="reg.jsp">Register Here</a>
</div>
            </center>
        </form>
    </body>
</html>

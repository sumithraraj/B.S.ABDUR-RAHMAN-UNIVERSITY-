<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body background ="http://i.imgur.com/Eor57Ae.jpg">
        <form method="post" action="registration.jsp">
             <link href='newcss1.css' rel='stylesheet' type='text/css'>
            <center>
                <div class="login-block">
                <p> Enter Information Here</p>
                    
                   <input type="text" name="firstname" value="" placeholder="firstname" id="firstname" />
                    
                   <br>
                    
                      <input type="text" name="lastname" value="" placeholder="lastname" id="lastname"/>
                    
                   <br>
                      
                        <input type="text" name="email" value="" placeholder="abc@example.com" id="email" />
                    <br>
                  <input type="text" name="username" value="" placeholder="Username" id="username" />
                  <br>
    <input type="password"  name="password" value="" placeholder="Password" id="password" />
    <br>
   <input type="submit" value="Login" /><br>
   <input type="reset" value="Reset" /><br>
     Already registered!! <a href="index.jsp">Login Here</a>
     </div>
            </center>
        </form>
    </body>
</html>

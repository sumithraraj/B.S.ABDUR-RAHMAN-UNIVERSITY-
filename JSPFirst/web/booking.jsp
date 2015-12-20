
<html>
    <head>
         <script type="text/javascript">
            function book(){
                alert("BOOKED");
            }
        </script>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

  
           
        <link href="newcss2.css" rel="stylesheet" />
        <body>
           <form method="post" action="book.jsp" onsubmit="book()">
           
            <div id="tabContainer">
                <marquee><img src="C:\Users\Varshiniv\Desktop\images\a.jpg" width="1300" height="300" alt="" /></marquee>
                   
                
               <div class="login-block">
                    <h2 class="heading">Booking & contact</h2>
                    
                         
                              
                        <label for="name"><font color="black"/>Name</label>
                        <input type="text" id="name" class="floatLabel" name="name" placeholder="name" />
                        <label for="phone">Phone</label>
                        <input type="text" id="phone" class="floatLabel" name="phone" placeholder="PHONE NO ex:1234567891" />
                          <label for="city">City</label>
                             <input type="text" id="city" class="floatLabel" name="city" placeholder="City" />  
                     <label for="country">Country</label>
                     <input type="text" id="country" class="floatLabel" name="country" placeholder="Country" />
             
                       <label for="checkin">Checkin</label>
                     <input type="text" id="" class="floatLabel" name="chin" placeholder="dd/mm/yy" />   
                     <label for="checkout">Checkout</label>
                     <input type="text" id="" class="floatLabel" name="chout" placeholder="dd/mm/yy" />
                  
<label for="people">People</label>
                     <input type="text" id="" class="floatLabel" name="nop" />
                  <label for="rooms">Rooms</label>
                     <input type="text" id="" class="floatLabel" name="nor"  />
                  <label for="Room Type">RoomType</label>
                     <input type="text" id="" class="floatLabel" name="roomt"  />
                   <label for="Room amount">RoomAmount</label>
                     <input type="text" id="" class="floatLabel" name="ramt"  />
        <button type="submit" value="Submit" class="col-1-4">Submit</button>
        
         
     </div> 
 
                     </div> 
               
           </form>
</body>
</head>
</html>

<!DOCTYPE html>
<html>
 <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Home</title>
        <script src="js/nav.js"></script>
        <link rel="stylesheet" href="css/styles.css">
        <meta name="viewport" content="width=device-width,initial-scale=1">
     
 </head>
    
<body onresize="returnmenuFunction()">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">                               
    <div class="nav" style="display: flex">
       <div id="menu" style="display: flex"> 
             <a href="gallerypage.jsp">Gallery</a>
             <a href="shows.jsp">Shows</a>
            
          
    </div>
       
 <a href="javascript:void(0);" class="icon" onclick="mymenuFunction()">
             <i class="fa fa-bars"></i>
    </a>
    </div>
    

 <div class="homemain"> 
     
    <header class="header"> 
    <div id="logo">
        <a href="gallery.jsp">
    <img src="img/Logo.png" alt="logo">
        </a>
     </div>
           </header> 
     <div class="home"> 
     <form action="search">
       <div id="search">      
    <input id="searchbar" type="text" name="search" placeholder="Search..">
    <button type="submit"><i class="fa fa-search"></i></button>       
       </div> 
     </form>
        <div class="homecont">
        
        <div id="signin">
		            
                    
		         <form action="UserController" method="get" class="login-form" name="Login"> 
                        
                             <input class="signininput" type="email" name="email" id="email" Placeholder="Email"><br>
                        
                       <input class="signininput" type="password" name="password" id="password" placeholder="Password"> <br>
                        
                       <input id="signinbutton" type="submit" name="menu" value="Sign In">
                        
                      <h1 class="0r">-or-</h1>
                        
                       <input id="signupbutton" type="submit" name="menu" value="Sign Up">
                        
                    </form>
		        </div>
           </div>
           
        </div>
        <footer>
          
     </footer>
    </div>
	</body>

</html>

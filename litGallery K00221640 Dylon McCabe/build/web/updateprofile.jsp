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
       <div id="menu"> 
             <a href="profile.jsp" style="background-color: #730109"  href="EntryController?menu=showEntries">Profile</a>
             <a href="gallerypage.jsp">Gallery</a>
             <a href="shows.jsp">Shows</a>
             <a href="home.jsp">Logout</a>
          
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
		            
                    
		    <form action="UserController" method="get" class="login-form" name=Login> 
                        <br>
                    <h1 class="0r">First Name</h1>
                    <input class="signininput" type="text" name="firstname" id="firstname" value="${user.firstName}"/>
                    <br>
                    
                    <h1 class="0r">Last Name</h1>
                    <input class="signininput" type="text" name="lastname" id="lastname" value="${user.lastName}"/>
                    <br>
                    <h1 class="0r">Password</h1>
                    <input class="signininput" type="password" name="password" id="password" value="${user.password}"/>
                    <br>
                    <h1 class="0r">profile Pic</h1>
                    <input class="signininput" type="text" name="profilepic" id="profilepic" value="${user.profilePic}"/>
                    <br>
                    
                    <input class="signininput" type="hidden" name="id" id="id" value="${user.userid}"/>
                    <h1 class="0r">Email</h1>
                    <input class="signininput" type="email" name="email" id="email" value="${user.email}"/>
                    <br>
                    <h1 class="0r">Bio</h1>
                    <textarea rows="4" cols="50" class="signininput" type="bio" name="bio" id="bio" />${user.bio}</textarea>
                    <br>
                    <h1 class="0r">Course</h1>
                    <input class="signininput" type="text" name="course" id="course" value="course"/>
                    <br>
                       
                       
                        
                       
                        
                      
                        
                       <input id="signupbutton" type="submit" name="menu" value="Update Profile">
                       <br>
                       <input id="signupbutton" type="submit" name="menu" value="Delete Profile">
                        
                    </form>
		        </div>
           </div>
           
        </div>
        <footer>
          
     </footer>
    </div>
	</body>

</html>
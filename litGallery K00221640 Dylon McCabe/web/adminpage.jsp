<!DOCTYPE html>
<html>
 <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Profile</title>
        <script src="js/nav.js"></script>
        <link rel="stylesheet" href="css/styles.css">
        <meta name="viewport" content="width=device-width,initial-scale=1">
     
 </head>
    
<body onresize="returnmenuFunction()">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">                               
    <div class="nav" style="display: flex">
       <div id="menu"> 
             <a href="profile.jsp">Profile</a>
             <a href="shows.jsp">Gallery</a>
             <a href="gallery.jsp">Shows</a>
             <a href="home.jsp">Logout</a>
          
    </div>
       
 <a href="javascript:void(0);" class="icon" onclick="mymenuFunction()">
             <i class="fa fa-bars"></i>
    </a>
    </div>
    

 <div class="main"> 
     
    <header class="header"> 
    <div id="logo">
        <a href="gallery.jsp">
    <img src="img/Logo.png" alt="logo">
        </a>
     </div>
           </header> 
     <div class="profile"> 
     <form action="search">
       <div id="search">      
    <input id="searchbar" type="text" placeholder="Search..">
    <button type="submit"><i class="fa fa-search"></i></button>       
       </div> 
     </form>
     
          <div id="proftop"> 
            <div id="profoimageside">  
    <img  src="img/profo.png" alt="profile">
                <div id="profbuttons">
                     <a  href="editprofile.html">    
    <button id="editprof" type="button">Add User</button>
                    </a>
               <a  href="editprofile.html">    
    <button id="editprof" type="button">Edit Profile</button>
                    </a>
                    <a href="accountsettings.html">
     <button  id="accountset" type="button">Delete Profile</button> 
                    </a>
                      <a href="accountsettings.html">
     <button  id="accountset" type="button">Edit Post</button> 
                    </a> 
                     <a href="accountsettings.html">
     <button  id="accountset" type="button">Delete Post</button> 
                    </a> 
                     <a href="accountsettings.html">
     <button  id="accountset" type="button">Edit Show</button> 
                    </a> 
                     <a href="accountsettings.html">
     <button  id="accountset" type="button">Delete Show</button> 
                    </a> 
                    
            </div>   
              </div>
           <div id="bio">
            <div  id="biohead">  
        <h1 >Admin Page</h1>
               </div>
              <div id="bioinput"> 
          <p >Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat..</p> 
               </div> 
              
          </div>  
              
      </div>                
         
         <div id="profbottom">
           
  </div>
     </div>  
    </div>       
</body>
    
    
</html>
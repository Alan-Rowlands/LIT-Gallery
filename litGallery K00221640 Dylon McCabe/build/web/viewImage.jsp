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
		            
                    
		    <form action="EntryController" method="get" class="login-form" name=Login> 
                        <br>
                    <img src="${pageContext.request.contextPath}/img/${Entry.image}" alt=${Entry.image} width="300" height="200" value="getEntryView">
                    <input class="signininput" type="text" name="image" id="image" value="${Entry.image}"/>
                    <br>
                    <br>
                    <h1 class="0r" >  Title </h1> 
                    <input class="signininput" type="text" name="title" id="title" value="${Entry.title}"/>
                    <br>
                     <h1 class="0r"> Description </h1>
                    <input class="signininput" type="text" name="description" id="description" value="${Entry.description}"/>
                    <br>
                     <h1 class="0r"> Date Uploaded </h1>
                    <input class="signininput" type="text" name="description" id="description" value="${Entry.date}"/>
                    <br>
                     <h1 class="0r"> Price </h1>
                    <input class="signininput" type="number" min="0.00" step="0.50" name="price" id="price" value="${Entry.price}"/>
                    <br>
                     <h1 class="0r"> Ratings </h1>
                    <input class="signininput" type="text" name="price" id="price" value="${Entry.rating}"/>
                    <br>
                    <input class="signininput" type="hidden" name="entryId" id="entryId" value="${Entry.entryId}"/>
                    <input type="hidden" id="custId" name="entryId" value="${Entry.entryId}">
                    <br>
                     <input id="signupbutton" type="submit" name="menu" value="Add Entry to Show">
                    <br>
                 
                       <input id="signupbutton" type="submit" name="menu" value="Update Entry">
                       <br>
                       <input id="signupbutton" type="submit" name="menu" value="Delete Entry">
                        
                    </form>
		        </div>
           </div>
           
        </div>
        <footer>
          
     </footer>
    </div>
	</body>

</html>
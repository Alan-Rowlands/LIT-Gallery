<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>
<%@page import="model.Entry"%>
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
             <a href="profile.jsp" style="background-color: #730109"  href="EntryController?menu=showEntries">Profile</a>
             <a href="gallerypage.jsp">Gallery</a>
             <a href="shows.jsp">Shows</a>
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
    <input id="searchbar" type="text" name="search" placeholder="Search..">
    <button type="submit"><i class="fa fa-search"></i></button>       
       </div> 
     </form>
     
          <div id="proftop"> 
            <div id="profoimageside"> 
                <form action="UserController" method="get" class="login-form" name="Login">
    <img  src="${pageContext.request.contextPath}/img/${user.profilePic}" alt=${user.profilePic}>
                <div id="profbuttons">
                    
               <a  href="updateprofile.jsp">
     
                   <input id="editprof" type="submit" name="menu" value="Edit Profile">
                    </a>
                    <a href="accountsettings.jsp">
     <button  id="accountset" type="button">Account Settings</button> 
                    </a>
    
            </div>  
                </form>
              </div>
           <div id="bio">
            <div  id="biohead">  
        <h1>${user.firstName} ${user.lastName}</h1>
               </div>
              <div id="bioinput"> 
          <p >${user.bio}</p> 
          <p >${user.course}</p>
               </div> 
              
          </div>  
              <form action="EntryController" method="get" class="login-form" name="Login"> 
                    
                       <input id="signupbutton" type="submit" name="menu" value="showEntries">
                       <input id="signupbutton" type="submit" name="menu" value="Upload new Entry">
                        
                    </form>
      </div>                
                
           <div id="profbottom">
               <div class="responsive"> 
                 <c:forEach var="entries" items="${allEntries}">                  

                          
                <div class="profgallery">
                 
            <a target="" href="EntryController?menu=getEntryView&entry_id=${entries.entryId}">
                
      <img src="${pageContext.request.contextPath}/img/${entries.image}" alt="${entries.image}" width="300 px" height="200 px" value="getEntryView">
                
            </a> 
            <div class="desc">
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star checked"></span>
                <span class="fa fa-star"></span>
                <p class="descreview">${entries.title} </p>
                <p class="uploaddesc">${entries.description} </p>
                <p class="uploaddesc">Price €${entries.price} </p>
                <p class="uploaddesc">Ratings  ${entries.rating} </p>
<!--                <p class="uploaddesc" type="hidden">${entries.entryId} </p>-->
                
            </div> 
         
                    </c:forEach>
         </div>
  

      </div>
    </div>
  </div>
     </div>  
    </div>       
</body>
    
    
</html>
document.getElementById("menu").style.display ="none";

function mymenuFunction(){ 
var x = document.getElementById("menu");
    
if (x.style.display === "flex"){
  x.style.display = "none";   
  }else{
   x.style.display = "flex";   
  }   
}
 
function returnmenuFunction(){
    var x = document.getElementById("menu");
    if (window.matchMedia("(min-width: 1024px)").matches){
       x.style.display = "flex"; 

    }else{
        x.style.display = "none";        
    }
}
        
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author dylon
 */
@WebServlet(name="UserController", urlPatterns={"/UserController"})
public class UserController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            
     throws ServletException, IOException {
        
        System.out.println("user controller");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            session.setAttribute("user", user);
        }

        String menu = request.getParameter("menu");

        switch (menu) {
            case "Sign In":
                boolean validLogin = ProcessLogin(request, session);
                
                if (!validLogin) {
                    String message = "invalid logon details.. try again";
                    session.setAttribute("message", message);
                    gotoPage("/home.jsp", request, response);
                } else {

                    gotoPage("/profile.jsp", request, response);
                }
                break;
            case "Update Profile":
                user.setUserid(Integer.parseInt( request.getParameter("id")));
                ProcessUpdate(request, session,user);
                gotoPage("/profile.jsp", request, response);
                break;
            case "Edit Profile":
                gotoPage("/updateprofile.jsp", request, response);
            case "Create Account":
                ProcessSave(request, session);
                gotoPage("/profile.jsp", request, response);
                break;
            case "Delete Profile":
                System.out.println("delete");
                System.out.println(user.getUserid());
                user.deleteUser(user.getUserid());
                gotoPage("/home.jsp", request, response);
                break;
            case "Sign Up":
                gotoPage("/signup.jsp", request, response);
                break;
            default:
                gotoPage("/invalid.jsp", request, response);
                break;
        }
    }
    private void gotoPage(String url,
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
     private void ProcessSave(HttpServletRequest request, HttpSession session) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String course = request.getParameter("course");
        
        System.out.println(firstName + " " + password);
        User us = new User(firstName, lastName, email, password, course);
        
        us.saveToDatabase();
        us.getUserDetails(us.getUserid());
        session.setAttribute("user", us);
        System.out.println("userid" + us.getUserid());
    }
     private void ProcessUpdate(HttpServletRequest request, HttpSession session,User user) {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String profilepic = request.getParameter("profilepic");
        String bio = request.getParameter("bio");
         System.out.println("FirstName "+firstname+" LastName"+lastname+" userid "+user.getUserid());
      
        User us = new User(user.getUserid(),firstname,lastname,email,password,profilepic,bio);
         us.updateUser();

        session.setAttribute("user", us);
        System.out.println("userid" + us.getUserid());
    }
    private boolean ProcessLogin(HttpServletRequest request, HttpSession session) {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println(email+" "+password);
        User us = new User(email, password);
        us.Login(email, password);
        session.setAttribute("user", us);
       
        if (us.getUserid()!=0) {
            return true;
        } else {
            return false;
        }

    }

}
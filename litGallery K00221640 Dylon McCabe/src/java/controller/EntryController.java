/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import model.Entry;

/**
 *
 * @author k00221640
 */
@WebServlet(name = "EntryController", urlPatterns = {"/EntryController"})
public class EntryController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        System.out.println("entry controller");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = new User();
            session.setAttribute("user", user);
        }
        Entry entry = (Entry) session.getAttribute("entry");
        if (entry == null) {
            entry = new Entry();
            session.setAttribute("entry", entry);
        }
        
        String menu = request.getParameter("menu");
        if (menu == null) {
            menu = "home";
        }
        switch (menu) {
            
           case "getEntryView":

                
                String sentryid = request.getParameter("entry_id");
                System.out.println(sentryid);
                int entryid = Integer.parseInt(sentryid);

                
                Entry e = new Entry();
                e = e.getEntryDetails(entryid);
                System.out.println("entry id is "+e.getEntryId());
                if (e != null) {
                    
                    session.setAttribute("Entry", e);
                    
                    User u = new User();
                    System.out.println("get user details " + e.getUserId());
                    u = u.getUserDetails(e.getUserId());
                    if(u!=null) {
                        System.out.println("entry user" + u.getFirstName());
                        session.setAttribute("entryUser", u);
                    }
                    else{
                        System.out.println("user details null");
                    }
                    
                }
                gotoPage("/viewImage.jsp", request, response);
                break;
            case "Delete Entry":
                int id = Integer.parseInt(request.getParameter("entryId"));
                Entry en = new Entry();
                en.DeleteEntry(id);
                gotoPage("/profile.jsp", request, response);
                break;
            case "showEntries":
                System.out.println("howdy");
                System.out.println(user);
                Entry entries = new Entry();
                ArrayList<Entry> allEntries = new ArrayList<>();
                allEntries = entries.getAllEntries(user.getUserid());
                System.out.println("allEntries" + allEntries.size());
//                System.out.println("entry id is "+entries.getEntryId());
                session.setAttribute("allEntries", allEntries);
                gotoPage("/profile.jsp", request, response);
                break;
            case "Upload new Entry":
                gotoPage("/addentrypage.jsp", request, response);
                break;    
            case "Update Entry":
                ProcessUpdate(request, session,entry);
                gotoPage("/profile.jsp", request, response);
                break;
            case "Upload Entry":
                System.out.println("hey");
                UploadEntry(request, session, user.getUserid());
                gotoPage("/profile.jsp", request, response);
                break;
            case "Add Entry to Show":
                int id2 = Integer.parseInt(request.getParameter("entryId"));
                Entry en2 = new Entry();
                en2.AddEntryToShow(id2);
                gotoPage("/viewImage.jsp", request, response);
                break;
            default:
                System.out.println("howdy");
                Entry entries1 = new Entry();
                allEntries = new ArrayList<>();
                allEntries = entries1.getAllEntries(user.getUserid());
                System.out.println("allEntries" + allEntries.size());
                session.setAttribute("allEntries", allEntries);
                gotoPage("/profile.jsp", request, response);
               
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

        session.setAttribute("user", us);
        System.out.println("userid" + us.getUserid());
    }
     private void ProcessUpdate(HttpServletRequest request, HttpSession session,Entry entry) {
        String title = request.getParameter("title");
        String descritpion = request.getParameter("description");
        String price = request.getParameter("price");
        String image = request.getParameter("image");
        int id = Integer.parseInt(request.getParameter("entryId"));
        
        
        System.out.println("entry ID "+entry.getEntryId());
        Entry en = new Entry(id,title,descritpion,price,image);
         en.updateEntry();

        session.setAttribute("entry", en);
        System.out.println("entryid" + en.getEntryId());
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

    private void UploadEntry(HttpServletRequest request, HttpSession session, int userid) {
        String title = request.getParameter("Title");
        String description = request.getParameter("Description");
        String price =request.getParameter("Price");
        String image = request.getParameter("Image");
        System.out.println(price +price);
        
        Entry en = new Entry(title, description, price, image);
        
        en.saveNewEntry(userid);

        session.setAttribute("entry", en);
        System.out.println("entryid" + en.getEntryId());
    }
    
}
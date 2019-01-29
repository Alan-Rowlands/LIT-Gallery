/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dylon
 */
public class User {
    private int userid;
    private String firstName;
    private String lastName;
    private String email;
    private String profilePic;
    private String password;
    private int dateJoined;
    private boolean accountType;
    private String bio;
    private String course;

    public User(int userid, String firstName, String lastName, String email, String profilePic, String password, int dateJoined, boolean accountType, String bio, String course) {
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.profilePic = profilePic;
        this.password = password;
        this.dateJoined = dateJoined;
        this.accountType = accountType;
        this.bio = bio;
        this.course = course;
    }

    
    public User(String email, String password) {
        this.email=email;
        this.password=password;
    }

    public User() {
        
    }
    
    public User(String firstName, String lastName, String email, String password,String course) {
        System.out.println(email+"email" + "password " + password);
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.course=course;
    }

    public User(int userid, String firstName, String lastName, String email, String password, String profilepic, String bio) {
        this.userid=userid;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.profilePic=profilepic;
        this.bio=bio;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(int dateJoined) {
        this.dateJoined = dateJoined;
    }

    public boolean isAccountType() {
        return accountType;
    }

    public void setAccountType(boolean accountType) {
        this.accountType = accountType;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public User Login(String email, String password) {

        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String query = "Select * from users where email = ? AND password = ?";

        try {

            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            resultSet = ps.executeQuery();
          
            System.out.println(" ps"+ ps.toString());
            while (resultSet.next()) {
                this.userid = resultSet.getInt("user_id");
                this.firstName = resultSet.getString("first_name");
                this.lastName = resultSet.getString("last_name");
                this.email = resultSet.getString("email");
                this.profilePic = resultSet.getString("profile_pic");
                this.password = resultSet.getString("password");
                this.dateJoined = resultSet.getInt("date_joined");
                this.bio = resultSet.getString("bio");
                this.course = resultSet.getString("course");
            }

            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        System.out.println(userid+" userid");
        return this;

    }
    public User updateUser() {

        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "UPDATE users SET first_name = ?,last_name = ?, password = ?, "
                + "email = ?, bio = ?, profile_pic=? WHERE user_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, this.getFirstName());
            ps.setString(2, this.getLastName());
            ps.setString(3, this.getPassword());
            ps.setString(4, this.getEmail());
            ps.setString(5, this.getBio());
            ps.setString(6, this.getProfilePic());
            ps.setInt(7, this.userid);
            System.out.println(ps);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }
     public User saveToDatabase() {

        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO users (first_name,last_name,email,password,profile_pic,course) VALUES (?,?,?,?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            System.out.println(this.email);
            
            ps.setString(1, this.getFirstName());
            ps.setString(2, this.getLastName());
            ps.setString(3, this.getEmail());
            ps.setString(4, this.getPassword());
            ps.setString(5, "profo.png");
            ps.setString(6, this.getCourse());
            ps.executeUpdate();
           
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.userid = rs.getInt(1);
            } 
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }
     public User getUserDetails(int id) {
        User u = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String query = "Select * from users where user_id = ?";

        try {

            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            resultSet = ps.executeQuery();
          
           
            while (resultSet.next()) {
                u = new User();
                u.userid = resultSet.getInt("user_id");
                u.firstName = resultSet.getString("first_name");
                u.lastName = resultSet.getString("last_name");
                u.password = resultSet.getString("password");
                u.email = resultSet.getString("email");
                
                return u;
            }

            connection.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        return u;

    }
     public void deleteUser(int userid1) {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "DELETE FROM users WHERE user_id =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            
            
            ps.setInt(1, userid1);
            System.out.println(ps);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
}

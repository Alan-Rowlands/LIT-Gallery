/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Currency;

/**
 *
 * @author k00221640
 */
public class Entry {
    private int entryId;
    private int userId;
    private Date date;
    private String title;
    private String description;
    private String price;
    private String image;
    private int rating;

    public Entry(String title, String description, String price, String image) {
        this.title =title;
        this.description=description;
        this.price=price;
        this.image=image;
    }

    public Entry() {
        
    }

    public Entry(int entryId, String title, String descritpion, String price, String image) {
        this.entryId=entryId;
        this.title=title;
        this.description=descritpion;
        this.price=price;
        this.image=image;
    }

    /**
     * @return the entryId
     */
    public int getEntryId() {
        return entryId;
    }

    /**
     * @param entryId the entryId to set
     */
    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    public ArrayList<Entry> getAllEntries(int user) {

        ArrayList allEntries = new ArrayList<>();

        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from entries where user_id =?";

        try {

            ps = connection.prepareStatement(query);
            ps.setInt(1, user);
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Entry e = new Entry();
//                n.setDate(resultSet.getDate("Date"));
//                n.setEntryId(resultSet.getInt("image"));
                e.setDescription(resultSet.getString("description"));
                e.setTitle(resultSet.getString("title"));
                
                e.setPrice(resultSet.getString("price"));
                e.setUserId(resultSet.getInt("user_id"));
                e.setEntryId(resultSet.getInt("entry_id"));
                e.setImage(resultSet.getString("image"));
                e.setRating(resultSet.getInt("ratings"));
                 System.out.println("image =" + e.getImage());
                 
                System.out.println(e);
                
                allEntries.add(e);
               
            }

            connection.close();
            

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        

        return allEntries;
    }

    public Entry saveNewEntry(int userid) {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO entries (title,description,price,image,user_id) VALUES (?,?,?,?,?);";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            
            
            ps.setString(1, this.getTitle());
            ps.setString(2, this.getDescription());
            ps.setString(3, this.getPrice());
            ps.setString(4, this.getImage());
            ps.setInt(5, userid);
            
            
            ps.executeUpdate();
           
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.entryId = rs.getInt(1);
            } 
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }
     public Entry getEntryDetails(int id) {
        
        Entry e = null;
        Connection connection = DatabaseUtilityClass.getConnection();
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        String query = "Select * from entries where entry_id = ?";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            
            resultSet = ps.executeQuery();
            while (resultSet.next()) {
                e = new Entry();
                e.setEntryId(resultSet.getInt("entry_id"));
                e.setTitle(resultSet.getString("title"));
                e.setDescription(resultSet.getString("description"));
                e.setPrice(resultSet.getString("price"));
                e.setImage(resultSet.getString("image"));
                e.setDate(resultSet.getDate("date_uploaded"));
                e.setUserId(resultSet.getInt("user_id"));
                e.setRating(resultSet.getInt("ratings"));
                return e;
            }

            connection.close();
            

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
        

        return e;
    }

    public Entry updateEntry() {
        

        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "UPDATE entries SET title = ?,description = ?, image = ?, "
                + "price = ? WHERE entry_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, this.getTitle());
            ps.setString(2, this.getDescription());
            ps.setString(3, this.getImage());
            ps.setString(4, this.getPrice());
            
            ps.setInt(5, this.getEntryId());
            System.out.println(ps);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public Entry DeleteEntry(int entryid) {
       Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "DELETE FROM entries WHERE entry_id =?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            
            
            ps.setInt(1, entryid);
            System.out.println(ps);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    public Entry AddEntryToShow(int id) {
        Connection connection = DatabaseUtilityClass.getConnection();
         
        String sql = "INSERT INTO `entries/shows` ( `Entry_ID`, `Show_ID`) VALUES ( ?, ?)";
        String query = "SELECT LAST_INSERT_ID()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            PreparedStatement ps2 = connection.prepareStatement(query);
            
            int showid =1;
            ps.setInt(1, id);
            ps.setInt(2, showid);
            
            System.out.println("sql1"+ps);
            System.out.println("sql2"+ps2);
            
            
            
            
            
            ps.executeUpdate();
           
            ResultSet rs = ps2.executeQuery();
            while(rs.next()){
                this.entryId = rs.getInt(1);
            } 
               
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return this;
    }

    
    
    
}

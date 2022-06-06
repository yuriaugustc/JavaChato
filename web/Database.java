package web;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 * @author yuri.costa
 */
public class Database {
    private String user = "ighuwokn";
    private String password = "bUWgW_ZnW6Rv5INOd5Km4g6t3d3SdCCS";
    private String url = "jdbc:postgresql://kesavan.db.elephantsql.com:5432/ighuwokn";
    private static Connection conn;
    
    public void setURL(String Url){
        this.url = Url;
    }
    public String getURL(){
        return url;
    }
    
    public void setUser(String User){
        this.user = User;
    }
    public String getUser(){
        return user;
    }
    
    public void setpassword(String pw){
        this.password = pw;
    }
    
    public void createConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
        }      
    }
}

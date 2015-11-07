/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.insea.bibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author habib
 */
public class DataBase {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String HOST = "127.0.0.1";
    static final String PORT = "3306";
    static final String BASE_DONNE = "bibliothequeJAVA";
    static final String DB_URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+BASE_DONNE;

    //  Database credentials
    static final String USER = "habibJAVA";
    static final String PASS = "19940805";
    
    public  static Connection connection = null;
    
    public static void connection() throws ClassNotFoundException, SQLException{
       Class.forName(JDBC_DRIVER); 
       connection = DriverManager.getConnection(DB_URL, USER, PASS);
    }
    
    public static void disconnection() throws SQLException{
        if(connection != null){
            connection.close();
            connection = null;
        }
    }
}

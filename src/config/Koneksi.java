/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kulub Cau
 */
public class Koneksi {
    private static Connection connection;
    public static Connection getConnection(){
        if(connection == null){
         try{
             String url = "jdbc:mysql://localhost:3306/kasir_universal?zeroDateTimeBehavior=CONVERT_TO_NULL";
             String user = "root";
             String pass ="";
             DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
             connection = (Connection) DriverManager.getConnection(url,user,pass);
             
            }catch(SQLException ex){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        return connection;
    }
}

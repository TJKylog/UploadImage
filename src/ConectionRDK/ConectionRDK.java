/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConectionRDK;
import java.sql.*;
import guardar.imagenes.rdk.RDKImage;
/**
 *
 * @author OK
 */
public class ConectionRDK {
    static String driverName = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://domainexample.com:3306/";
    static String dbName = "bd";
    static String userName = "user";
    static String password = "password";
    private static Connection conectionrdk;
    public ConectionRDK(){
        try{
            Class.forName(driverName);
            conectionrdk=DriverManager.getConnection(url+dbName,userName,password);
        }
        catch(ClassNotFoundException | SQLException e){
            
        }
    }
    public Connection getConection(){
        return conectionrdk;
    }

    
}

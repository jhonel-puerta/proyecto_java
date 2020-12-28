package config;

import java.sql.*;

public class Conexion {
    Connection con;
    
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela","root","");
            
        } catch (Exception e) {
        }
    }
    public Connection getConnection(){
        return con;
    }
}

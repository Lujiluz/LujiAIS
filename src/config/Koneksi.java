package config;

import java.sql.*;

public class Koneksi {
    public static Connection getConnection() throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/db_univ?zeroDateBehavior=convertToNull";
            String username = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url,username,pass);
            System.out.println("Connected!");
            return conn;
        } catch (Exception e) {System.out.println(e);}
        return null;
    }
}

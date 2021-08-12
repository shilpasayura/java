package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void connectMySQL() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn=DriverManager.getConnection(
            //"jdbc:mysql://localhost:3306/testDB","Admin","password");
            Connection conn=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/ss_2021","sayura","sayura123");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from uniportal_products where xpid =0");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getInt(2));
            }
            conn.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void connectSQLite() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:F:\\git\\db\\src\\com\\company\\test.db";

            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");

            String sql = "SELECT id, user FROM user;";
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getInt("id") +  " ");
                System.out.println (rs.getString("user"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        connectSQLite();
        connectMySQL();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soluciones.main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

private static final String DB_SERVER = "jdbc:mysql://localhost:3306/soluciones";
private static final int DB_PORT = 3306;
private static final String DB_NAME = "soluciones";
private static final String DB_USER = "campus2023";
private static final String DB_PASS = "campus2023";

private static Connection conn;


public static void main(String[] args) throws Exception {

   try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/soluciones";
        conn = DriverManager.getConnection(url, DB_USER, DB_PASS);
    }catch (Exception e){
        System.out.println("Error Database");
        e.printStackTrace();
    }
    conn.close();
}

}

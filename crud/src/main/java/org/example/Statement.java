package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Statement {
   
    public static void main(String[] args) throws  SQLException {
        Connection con= DriverManager.getConnection("");
        Statement statement= (Statement) con.createStatement();
    }
}

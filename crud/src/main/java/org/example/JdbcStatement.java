package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatement {
   
    public static void main(String[] args) throws  SQLException {
        try(Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/waction?useSSL=false","root","w@ct10n");Statement statement = con.createStatement()) {
            ResultSet rs = statement.executeQuery("SELECT * FROM CHKPOINT");
            while (rs.next()) {
                System.out.println(rs.getString(4));
            }
        }
    }
}

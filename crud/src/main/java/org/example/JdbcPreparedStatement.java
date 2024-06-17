package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement {

    public static void main(String[] args) throws SQLException {
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/waction?useSSL=false","root","w@ct10n"); 
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO test (id,name) values(?,?)"))
        {
            preparedStatement.setString(1,"2");
            preparedStatement.setString(2,"dhoni");
            preparedStatement.execute();
        }
    }
}

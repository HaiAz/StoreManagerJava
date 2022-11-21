package Model;

import java.sql.*;

public class DB {
     public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/quanLycuahang";
        return DriverManager.getConnection(url, "root", "");
    }
}

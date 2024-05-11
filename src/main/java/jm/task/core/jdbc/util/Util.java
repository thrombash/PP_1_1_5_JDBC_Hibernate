package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Fdnjhbpfwbz`1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection is done");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error occurred");
        }
        System.out.println("Connection is closed");
        return connection;
    }


}

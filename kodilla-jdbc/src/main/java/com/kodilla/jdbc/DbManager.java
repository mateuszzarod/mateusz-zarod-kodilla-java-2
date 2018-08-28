package com.kodilla.jdbc;

import java.sql.*;
import java.util.Properties;

public class DbManager {
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {

        //properties of connection
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_use");
        connectionProps.put("password", "pass");
        conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEES");
        while (rs.next()){
            String x = rs.getString("firstname");
        }


    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}

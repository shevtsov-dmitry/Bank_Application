package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectorData{
    private String url = "jdbc:mariadb://localhost:3306/bank_DB";
    private String username = "shado";
    private String password = "123123";
    private Connection connection;

    public void createConnection() throws SQLException {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Подключено " + "✔");
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        if(!connection.isClosed()) {
            System.out.println("Отключено ⛔");
            connection.close();
        }
    }
}

package com;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        var connection = new ConnectorData();
        connection.createConnection();


        connection.closeConnection();
    }
}

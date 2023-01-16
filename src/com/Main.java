package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws SQLException {
        var connection = new ConnectorData();
        connection.createConnection();


        connection.closeConnection();
    }
}

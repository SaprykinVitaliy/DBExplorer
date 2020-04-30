package ru.saprykin.vitaliy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    final private static String DBMSDriver = "org.postgresql.Driver";
    final private static String IP = "localhost";
    final private static String port = "5432";
    final private static String DBname = "test_db";
    final private static String DBMSuser = "postgres";
    final private static String DBMSpassword = "admin";
    private static Connection connection;

    public static Connection connect() throws SQLException {
        try {
            Class.forName(DBMSDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        connection = DriverManager.getConnection(
                "jdbc:postgresql://" + IP + ":" + port + "/" + DBname,
                DBMSuser, DBMSpassword);
        return connection;
    }

    public static Connection connectToDBExploration() throws SQLException {
        try {
            Class.forName(DBMSDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //TODO:YOU CAN NOT PUBLIC THIS!
        connection = DriverManager.getConnection(
                "jdbc:postgresql://dbexploration.postgres.database.azure.com:5432/" +
                        "DBExplorer?user=Kokobox7@dbexploration&password=Ctrhtn12345&sslmode=require");

        return connection;
    }


    public static void close() throws SQLException {
        connection.close();
    }
}

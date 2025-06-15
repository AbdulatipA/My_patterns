package org.example.my_patterns.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnectionProxy("admin", "12345");
        databaseConnection.connect();
        System.out.println("/////////////////////");
        databaseConnection.connect();
    }
}

package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    
    private static final String pass="jdbc:mysql://localhost/student";
    private static final String name="root";
    private static final String password="";
    public static Connection driver;

    
    public static void connect() throws SQLException{
        driver= DriverManager.getConnection(pass, name, password);
    }
}

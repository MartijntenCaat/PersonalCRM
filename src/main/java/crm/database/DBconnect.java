package crm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    private static final String host = "jdbc:mysql://localhost:3306/crm";
    private static final String username = "root";
    private static final String password = "Welkom123!@#";
    private static String tableName = "contact";

    public DBconnect() {
        // nothing
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(host, username, password);
    }
}
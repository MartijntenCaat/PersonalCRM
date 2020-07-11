package crm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {
    private static String username = "root";
    private static String password = "Welkom123!@#";
    private static String tableName = "contact";

    public static void main(String[] args) throws Exception {
        String host = "jdbc:mysql://localhost:3306/crm";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(host, username, password);

        Statement sqlStatement = con.createStatement();
        ResultSet resultSet = sqlStatement.executeQuery("SELECT * FROM " + tableName + ";");

        while (resultSet.next()) {
            System.out.print(resultSet.getInt(1));
            System.out.print(resultSet.getString(2));
            System.out.print(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
        }
    }
}
package crm.application;

import crm.database.DBconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRMApplication {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("add contactname:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("add contactsurname:");
        String surname = new Scanner(System.in).nextLine();

        Contacts contact = new Contacts(surname, name);
        System.out.println("Added one contact: " + contact.getContact());

        DBconnect con = new DBconnect();

        Statement sqlStatement = con.getConnection().createStatement();
        String tableName = "contact";
        ResultSet resultSet = sqlStatement.executeQuery("SELECT * FROM " + tableName + ";");

        while (resultSet.next()) {
            System.out.print(resultSet.getInt(1));
            System.out.print(resultSet.getString(2));
            System.out.print(resultSet.getString(3));
            System.out.println(resultSet.getString(4));
        }

    }
}

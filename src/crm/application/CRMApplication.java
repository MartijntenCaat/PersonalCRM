package crm.application;

import java.util.Scanner;

public class CRMApplication {
    public static void main(String[] args) {
        System.out.printf("Hello world!");

        System.out.println("add contactname:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("add contactsurname:");
        String surname = new Scanner(System.in).nextLine();

        Contacts contact = new Contacts(surname, name);
        System.out.println("Added one contact: " + contact.getContact());

    }
}

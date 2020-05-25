package PersonalCRM;

public class Contacts {
    private int id;
    private String name;
    private String surname;
    private String email;

    Contacts(String surname, String name) {
        if (!surname.equals(" ")) {
            this.name = name;
        } else {
            System.out.println("Is empty!");
        }
        this.surname = surname;
    }

    public String getContact() {
        return name + " " + surname;
    }
}

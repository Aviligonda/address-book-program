import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookClass {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Contacts> contact = new ArrayList<>();
    private static final Contacts addressBook = new Contacts();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System Program");
        addContact();
    }

    public static void addContact() {
        System.out.println("Enter a first name:");
        addressBook.setFirstName(scanner.nextLine());
        System.out.println("Enter a last name:");
        addressBook.setLastName(scanner.nextLine());
        System.out.println("Enter a Address:");
        addressBook.setAddress(scanner.nextLine());
        System.out.println("Enter a City name:");
        addressBook.setCity(scanner.nextLine());
        System.out.println("Enter a state:");
        addressBook.setState(scanner.nextLine());
        System.out.println("Enter a email:");
        addressBook.setEmail(scanner.nextLine());
        System.out.println("Enter a zip code:");
        addressBook.setZip(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter a phone number:");
        addressBook.setPhoneNum(Integer.parseInt(scanner.nextLine()));
        contact.add(addressBook);
        System.out.println(contact);
        System.out.println("Contact added success fully");
    }
}

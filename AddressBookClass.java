import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookClass {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Contacts> contact = new ArrayList<>();
    private static final Contacts addressBook = new Contacts();

    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook System Program");
        while (true) {
            System.out.println("Select the options \n1.Add contact\n2.Edit contact");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContacts();
                    break;
            }
        }
    }

            public static void addContact () {
                System.out.println("create contact ");
                addressBook.setFirstName(scanner.nextLine());
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
            public static void editContacts () {
                System.out.println("Enter first or last name  to edit ");
                String editName = scanner.next();
                for (int i = 0; i < contact.size(); i++) {
                    if (contact.get(i).getFirstName().equals(editName) || contact.get(i).getLastName().equals(editName)) {
                        System.out.println("Select options \n1.first name \n2.last name\n3.address\n4.city\n5.state\n6.email\n7.zipcode\n8.phoneNum ");
                        int edit = scanner.nextInt();
                        switch (edit) {
                            case 1 -> {
                                System.out.println("Enter first name ");
                                String editFirstName = scanner.next();
                                contact.get(i).setFirstName(editFirstName);
                                System.out.println(editFirstName);
                            }
                            case 2 -> {
                                System.out.println("Enter last name ");
                                String editLastName = scanner.next();
                                contact.get(i).setLastName(editLastName);
                                System.out.println(editLastName);
                            }
                            case 3 -> {
                                System.out.println("Enter Address ");
                                String editAddress = scanner.next();
                                contact.get(i).setAddress(editAddress);
                                System.out.println(editAddress);
                            }
                            case 4 -> {
                                System.out.println("Enter city ");
                                String editCity = scanner.next();
                                contact.get(i).setCity(editCity);
                                System.out.println(editCity);
                            }
                            case 5 -> {
                                System.out.println("Enter state ");
                                String editState = scanner.next();
                                contact.get(i).setState(editState);
                                System.out.println(editState);
                            }
                            case 6 -> {
                                System.out.println("Enter email ");
                                String editEmail = scanner.next();
                                contact.get(i).setEmail(editEmail);
                                System.out.println(editEmail);
                            }
                            case 7 -> {
                                System.out.println("Enter zipcode");
                                String editZip = scanner.next();
                                contact.get(i).setZip(Integer.parseInt(editZip));
                                System.out.println(editZip);
                            }
                            case 8 -> {
                                System.out.println("Enter phone number ");
                                String editPhoneNumber = scanner.next();
                                contact.get(i).setPhoneNum(Integer.parseInt(editPhoneNumber));
                                System.out.println(editPhoneNumber);
                            }
                            default -> System.out.println("Exit the loop");
                        }
                        System.out.println("Contact edited successfully");
                        System.out.println(contact);
                    }else {
                        System.out.println("Contact not found ");
                    }
                }
            }
        }

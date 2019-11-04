package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	    while (true) {
	        printInstructions();

	        int choice = scanner.nextInt();

	        scanner.nextLine();

	        if (choice == 0) {
	            addContact();
            } else if (choice == 1) {
	            updateContact();
            } else if (choice == 2) {
                removeContact();
            } else if (choice == 3) {
                findContact();
            } else if (choice == 4) {
                mobilePhone.printContacts();
            } else {
	            break;
            }
        }

	    scanner.close();
    }

    public static void printInstructions() {
        String[] options =  new String[] {"Add Contact", "Update contact", "Remove Contact", "Find contact", "Print Contacts", "Quit"};


        System.out.println("\nOptions:");

        for (int i = 0; i < options.length; i++) {
            System.out.println("\t " + i + ". " + options[i]);
        }
    }

    public static void addContact() {
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the phone: ");
        String phoneNumber = scanner.nextLine();

        mobilePhone.addContact(name, phoneNumber);
    }

    public static void updateContact() {
        System.out.print("Enter current contact name: ");
        String name = scanner.nextLine();

        Contact currentContact = mobilePhone.findContact(name);
        if (currentContact != null) {
            System.out.print("Enter new contact name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new phone: ");
            String newPhoneNumber = scanner.nextLine();

            Contact updatedContact = new Contact(newName, newPhoneNumber);

            mobilePhone.updateContact(currentContact, updatedContact);
        } else {
            System.out.println("We couldn't find the contact: " + name);
        }
    }

    public static void removeContact() {
        System.out.print("Enter contact's name to remove: ");
        String name = scanner.nextLine();

        mobilePhone.removeContact(name);
    }

    public static void findContact() {
        System.out.print("Enter contact's name: ");
        String name = scanner.nextLine();

        Contact contact = mobilePhone.findContact(name);

        if (contact != null) {
            System.out.println("Contact " + contact.getName() + " has the phone: " + contact.getPhone());
        } else {
            System.out.println("We couldn't find the contact: " + name);
        }
    }
}


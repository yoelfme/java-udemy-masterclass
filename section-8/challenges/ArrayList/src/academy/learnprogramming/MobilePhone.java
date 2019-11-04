package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void printContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " - " + contact.getPhone());
        }
    }

    public void addContact(String name, String phone) {
        if (findContact(name) != null) {
            System.out.println("Contact " + name + " already exists!");
        } else {
            Contact contact = new Contact(name, phone);
            this.contacts.add(contact);

            System.out.println("Contact " + name + " added!");
        }
    }

    public void updateContact(String name, Contact newContact) {
        Contact contact = findContact(name);

        if (contact != null) {
            int id = findContact(contact);
            this.contacts.set(id, newContact);
        } else {
            System.out.println("We couldn't find the contact: " + name);
        }
    }

    public void updateContact(Contact currentContact, Contact newContact) {
        int id = findContact(currentContact);

        if (id < 0) {
            System.out.println("We couldn't find the contact: " + currentContact.getName());
        } else if (findContact(newContact.getName()) != null) {
            System.out.println("You have already registered a contact with name " + newContact.getName());
        } else {
            this.contacts.set(id, newContact);
            System.out.println(newContact.getName() + " was updated!");
        }
    }

    public void removeContact(String name) {
        Contact currentContact = findContact(name);
        if (currentContact != null) {
            this.contacts.remove(findContact(currentContact));

            System.out.println("Contact " + currentContact.getName() + " removed!");
        } else {
            System.out.println("We couldn't find the contact: " + name);
        }
    }

    public Contact findContact(String name) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(name)) {
                return this.contacts.get(i);
            }
        }

        return null;
    }

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }

}

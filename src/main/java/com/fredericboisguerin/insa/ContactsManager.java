package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.List;

public class ContactsManager {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException, InvalidEmailException {
        if (name == null || name.isEmpty()) {
            throw new InvalidContactNameException();
        }
        if (email != null && !email.contains("@")) {
            throw new InvalidEmailException();
        }
        Contact contact = new Contact(name, email, phoneNumber);
        contacts.add(contact);
    }

    public void printAllContacts() {
        for (Contact contact : contacts) {
            contact.print();
        }
    }

    public void searchContactByName(String name) {
        for (Contact contact : contacts) {
            // Case insensitive search
            if (contact.getName().toLowerCase().contains(name.toLowerCase())) {
                contact.print();
            }
        }
    }
}

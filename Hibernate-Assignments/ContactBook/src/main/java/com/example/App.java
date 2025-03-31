package com.example;

import com.example.dao.ContactDAO;
import com.example.models.Contact;
import com.example.models.PhoneNumber;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ContactDAO contactDAO = new ContactDAO();

        // Creating contacts
        Contact contact1 = new Contact("Rohit", new PhoneNumber("123-456", "987-654"));
        Contact contact2 = new Contact("Puneet", new PhoneNumber("321-654", "789-123"));

        // Saving contacts
        contactDAO.saveContact(contact1);
        contactDAO.saveContact(contact2);

        // Fetching all contacts
        List<Contact> contacts = contactDAO.getAllContacts();
        System.out.println("All Contacts:");
        contacts.forEach(System.out::println);

        // Fetching a single contact
        Contact fetchedContact = contactDAO.getContact(1);
        System.out.println("Fetched Contact: " + fetchedContact);

        // Deleting a contact
        contactDAO.deleteContact(2);
        System.out.println("Contact with ID 2 deleted.");

        // Fetching all contacts after deletion
        System.out.println("Contacts after deletion:");
        contactDAO.getAllContacts().forEach(System.out::println);
    }
}
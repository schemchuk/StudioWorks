package de.telran.stanislavsPacage.lesson12.contacts;

public class ContactsApp {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Tomas", "+4443544444");
        Contact contact2 = new Contact("Jonn", "+49574444455");
        Contact contact3 = new Contact("Ruslan", "+3716544444466");
        Contact contact4 = new Contact("Viktor", "+3806744444477");
        Contact contact5 = new Contact("Viktor", "+3634644444477");

        ContactManager contactManager = new ContactManager();

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.addContact(contact5);

        contactManager.getAllContacts();

        String serchName = "Viktor";
        String serchPhone = "+4443544444";

        System.out.println("Contakt with name: " + serchName + " is " + contactManager.getContactByName(serchName));

        System.out.println("Contakt with pfone: " + serchPhone + " is " + contactManager.getContactByPhone(serchPhone));

        contactManager.deleteContact(contact3);
        contactManager.getAllContacts();

    }
}

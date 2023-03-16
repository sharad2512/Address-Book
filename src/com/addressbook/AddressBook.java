package com.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contact[] contactList = new Contact[1];
    static int i = 0;

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Add new contact please provide below information");
        System.out.println("Enter Your First Name");
        String firstName = scanner.next();
        contact.setFirstname(firstName);
        System.out.println("Enter Your Last Name");
        String lastName = scanner.next();
        contact.setLastname(lastName);
        System.out.println("Enter your Address");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.println("Enter Your City");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter Your State");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter Your Zip Code");
        int zip = scanner.nextInt();
        contact.setZipCode(zip);
        System.out.println("Enter Your Phone Number");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNo(phoneNumber);
        System.out.println("Enter Your Email Address");
        String email = scanner.next();
        contact.setEmail(email);
        contactList[i] = contact;
    }

    public void printContacts() {
        for (int j = 0; j < contactList.length; j++) {
            System.out.println(contactList[0]);
        }
    }
}

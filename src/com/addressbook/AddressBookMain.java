package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("---------- Welcome To Address Book Program!! ----------");

        AddressBookDirectory addressBookDirectory = new AddressBookDirectory();
        addressBookDirectory.operationDirectory();
        AddressBook addressBook = new AddressBook();
        addressBook.operation();
    }

}
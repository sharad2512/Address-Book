package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookDirectory implements AddressBookDirectoryIF{
    public AddressBook addressBook;
    Scanner scannerObject = new Scanner(System.in);
    Map<String,AddressBook> addressBookDirectory = new HashMap<String,AddressBook>();

    public void operationDirectory() {
        boolean moreChanges = true;
        do {
            System.out.println("\nChoose the operation on the Directory you want to perform");
            System.out.println("1.Add an Address Book\n2.Edit Existing Address Book\n3.Display Address book Directory\n4.Exit Address book System");
            switch (scannerObject.nextInt()) {
                case 1:
                    addAddressBook();
                    AddressBook addressBook =new AddressBook();
                    addressBook.addContact();
                    break;
                case 2:
                    editAddressBook();
                    AddressBook addressBook1 =new AddressBook();
                    addressBook1.editPerson();
                    break;
                case 3:
                    displayDirectoryContents();
                    AddressBook addressBook2 =new AddressBook();
                    addressBook2.displayContents();

                    break;
                case 4:
                    moreChanges = false;
                    System.out.println("Exiting Address Book Directory !");
            }
        } while (moreChanges);
    }
    public void addAddressBook() {
        System.out.println("Enter the name of the Address Book you want to add");
        String bookNameToAdd = scannerObject.next();

        if(addressBookDirectory.containsKey(bookNameToAdd)) {
            System.out.println("Book Name Already Exists");
            return;
        }
        AddressBook addressBook = new AddressBook();
        addressBook.setAddressBookName(bookNameToAdd);
        addressBookDirectory.put(bookNameToAdd, addressBook);
        AddressBook addressBooks =new AddressBook();
        addressBooks.operation();
    }
    public void editAddressBook() {
        System.out.println("Enter the Name of the Address Book which you want to edit:");
        String addressBookToEdit = scannerObject.next();

        if(addressBookDirectory.containsKey(addressBookToEdit)) {
            addressBook = addressBookDirectory.get(addressBookToEdit);
            addressBook.operation();
        }
        else {
            System.out.println("Book Does Not Exist");
        }
    }
    public void displayDirectoryContents() {
        System.out.println("----- Contents of the Address Book Directory-----");
        for (String eachBookName : addressBookDirectory.keySet()) {

            System.out.println(eachBookName);
        }
        System.out.println("-----------------------------------------");
    }

}

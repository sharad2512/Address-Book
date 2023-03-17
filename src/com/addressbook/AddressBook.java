package com.addressbook;
import java.util.Scanner;
public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contact[] contactList = new Contact[10];
     static int i = 0;
     static int j = 0;

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
        i++;
    }
    void editContact() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the person name whose detail you want to edit");
        String uname = sc2.next();
        int result = getUserDate(uname);
        if (result == 1) {
            System.out.println("Choose\n1:Last Name\n2:Phone Number\n3:city");
            int editChoice = sc2.nextInt();
            switch (editChoice) {
                case 1:
                    System.out.println(contactList[i]);
                    System.out.println("Enter the new lastname");
                    String newLastName = sc2.next();
                    contactList[i].setLastname(newLastName);
                    break;

                case 2:
                    System.out.println("Enter the new phone Number");
                    long newPhoneNumber = sc2.nextLong();
                    contactList[i].setPhoneNo(newPhoneNumber);
                    break;
                case 3:
                    System.out.println("Enter the new city");
                    String newCity = sc2.next();
                    contactList[i].setCity(newCity);
                    break;
                default:
                    System.out.println("Wrong Choice of Edit");

            }
        }

    }

    private int getUserDate(String uname) {
        for (i = 0; i < contactList.length; i++) {
            if (contactList[i].getFirstname().equals(uname)) {
                return 1;
            }
        }
        return 0;
    }
    private int getUserData(String dname) {
        for (j = 0; j < contactList.length; j++) {
            if (contactList[j].getFirstname().equals(dname)) {
                return 1;
            }
        }
        return 0;
    }


    void deleteContact()
    {
        System.out.println("Enter the person name whose name you want to delete");
        String dName = scanner.next();
        int result1 = getUserData(dName);

        if(result1 == 1)
        {
            contactList[j] = null;
        }
    }
    public void printContacts() {
        for (int j = 0; j < contactList.length; j++) {
            if (contactList[j] == null)
                break;
            System.out.println(contactList[j]);
        }
    }

}

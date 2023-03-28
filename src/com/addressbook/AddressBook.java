package com.addressbook;
import java.util.Scanner;
public class AddressBook {
    private final int NUM_OF_PEOPLE = 5;//declare operation
    Scanner scannerObject = new Scanner(System.in);//input
    ContactPerson[]contactList = new ContactPerson[NUM_OF_PEOPLE];//arry to no of1 person datail
    public static int numberOfEntries = 0;//intilizing

    public void operation() {

        boolean moreChanges = true;
        do{

            System.out.println("\nChoose the operation you want to perform");
            System.out.println("1.Add To Address Book\n2.Edit Existing Entry\n3.Display Address book\n4.Delete Contact\n5.Exit Address book System");

            switch (scannerObject.nextInt()) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editPerson();
                    break;
                case 3:
                    displayContents();
                    break;
                case 4:
                    deletePerson();
                    break;
                case 5:
                    moreChanges = false;
                    System.out.println("BYE !");


            }

        }while(moreChanges);
    }

    public void addContact() {
        System.out.println("Enter number of people you want to add to Addres book");
        int numberOfPeople = scannerObject.nextInt();
        int endIterator = numberOfPeople+numberOfEntries;

        if(endIterator > NUM_OF_PEOPLE) {
            System.out.println("Address Book is FULL !");
            System.out.println("You can add: "+(NUM_OF_PEOPLE-numberOfEntries));
            return;
        }
        else {

            for(int index=numberOfEntries; index < endIterator ; index++) {

                ContactPerson person = new ContactPerson();
                Address address = new Address();
                System.out.println("Enter the details of Person "+(index+1));

                System.out.println("Enter First Name: ");
                String firstName = scannerObject.next();

                System.out.println("Enter Last Name: ");
                String lastName = scannerObject.next();

                System.out.println("Enter Phone Number: ");
                long phoneNumber = scannerObject.nextLong();

                System.out.println("Enter Email: ");
                String email = scannerObject.next();

                System.out.println("Enter City: ");
                String city = scannerObject.next();

                System.out.println("Enter State: ");
                String state = scannerObject.next();

                System.out.println("Enter Zip Code: ");
                long zipCode = scannerObject.nextLong();


                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setPhoneNumber(phoneNumber);
                person.setEmail(email);
                address.setCity(city);
                address.setState(state);
                address.setZip(zipCode);
                person.setAddress(address);
                contactList[index] = person;
                numberOfEntries++;

            }
        }


    }

    public void editPerson() {

        System.out.println("Enter the first name:");
        String firstName = scannerObject.next();

        for(int index = 0; index <numberOfEntries; index++) {

            ContactPerson person = contactList[index];

            if(firstName.equals(person.getFirstName())) {

                Address address = person.getAddress();
                System.out.println("\nChoose the attribute you want to change:");
                System.out.println("1.First Name\n2.Last Name\n3.Phone Number\n4.Email\n5.City\n6.State\n7.ZipCode");
                int choice = scannerObject.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("Enter the correct Last Name :");
                        String lastName = scannerObject.next();
                        person.setLastName(lastName);
                        break;
                    case 2:
                        System.out.println("Enter the correct Phone Number :");
                        long phoneNumber = scannerObject.nextLong();
                        person.setPhoneNumber(phoneNumber);
                        break;
                    case 3:
                        System.out.println("Enter the correct Email Address :");
                        String email = scannerObject.next();
                        person.setEmail(email);
                        break;
                    case 4:
                        System.out.println("Enter the correct City :");
                        String city = scannerObject.next();
                        address.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter the correct State :");
                        String state = scannerObject.next();
                        address.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter the correct ZipCode :");
                        long zip = scannerObject.nextLong();
                        address.setZip(zip);
                        break;
                }

            }

        }
    }

    public void deletePerson() {

        System.out.println("Enter the first name of the person to be deleted");
        String firstName = scannerObject.next();

        for(int index = 0; index <numberOfEntries; index++) {

            ContactPerson person = contactList[index];

            if(firstName.equals(person.getFirstName())) {

                for(int nextIndex = index; nextIndex<contactList.length-1; nextIndex++) {
                    contactList[nextIndex] = contactList[nextIndex+1];

                }
                numberOfEntries--;
                return;
            }

        }
    }

    public void displayContents() {
        System.out.println("----- Contents of the Address Book -----");
        for(int index=0; index < numberOfEntries ; index++) {
            System.out.println(contactList[index]);

        }
        System.out.println("-----------------------------------------");

    }

}

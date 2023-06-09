package com.addressbook;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface AddressBookIF {
    public void operation();

    public void createContactPerson(Scanner scannerObject);

    public void addContact(String firstName, ContactPerson person);

    public void displayContents();

    public void editPerson();

    public void deletePerson();

    public void addPersonToCity(ContactPerson contact);

    public void addPersonToState(ContactPerson contact);

    public void printSortedList(List<ContactPerson> sortedContactList);

    public void sortAddressBook(int sortingChoice);

    public void writeToAddressBookFile(AddressBook.IOService ioService);

    public List<String> readDataFromFile(AddressBook.IOService fileIo);

    public void writeDataToCSV() throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException;

    public <CsvValidationException extends Throwable> void readDataFromCSV() throws IOException, CsvValidationException, com.opencsv.exceptions.CsvValidationException;
}

package com.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface AddressBookDirectoryIF {
    public  void addAddressBook();
    public void operationDirectory();
    public void displayDirectoryContents();
    public void editAddressBook();
    public void searchByCity();
    public void searchByState();
    public void displayPeopleByRegion(HashMap<String, ArrayList<ContactPerson>> listToDisplay);
    public void countPeopleByRegion(HashMap<String, ArrayList<ContactPerson>> listToDisplay);

}

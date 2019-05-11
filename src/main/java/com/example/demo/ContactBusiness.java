package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();

        listContact.add(new Contact("Eduardo Olivas", "eduardo@gmail.com", "USA"));
        listContact.add(new Contact("Antonio", "antonio@outlook.com", "England"));
        listContact.add(new Contact("Ander", "ander@yahoo.com", "Australia"));
        listContact.add(new Contact("Siva Krishna", "sivakrishna@gmail.com", "India"));

        return listContact;
    }
}

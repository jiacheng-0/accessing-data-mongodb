package com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

    public ArrayList<Hobby> hobbyList = new ArrayList<>();

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, Hobby hobby) {
        this.firstName = firstName;
        this.lastName = lastName;
        hobbyList.add(hobby);
    }

    public void addHobby(Hobby hobby){
        hobbyList.add(hobby);
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

}
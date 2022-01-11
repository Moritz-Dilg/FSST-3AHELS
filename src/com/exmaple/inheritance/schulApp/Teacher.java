package com.exmaple.inheritance.schulApp;

public class Teacher extends Person{
    private String id;

    Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        this.id = lastName.substring(0, 3) + firstName.substring(0, 1);
    }

    String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id " + id + ": " + super.toString();
    }
}

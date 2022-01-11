package com.exmaple.inheritance.schulApp;

public class SchulApp {
    public static void schulApp() {
        Person person = new Person("Felix", "Hofinger");
        System.out.println(person.getLastName() + ", " + person.getFirstName());
        person.setFirstName("Justin");
        person.setLastName("Gascho");
        System.out.println(person.toString());

        Student student = new Student(1, "Constantin", "Barth");
        student.setNumber(5);
        System.out.println(student.toString());

        Teacher teacher = new Teacher("Matthias", "Grimmer");
        System.out.println("ID Teacher: " + teacher.getId());
        System.out.println(teacher.toString());
    }
}

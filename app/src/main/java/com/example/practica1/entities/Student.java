package com.example.practica1.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final String lastName;
    private final String id;

    public Student(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }




    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public String getId() {
        return id;
    }


    public static List<Student> getStudents() {
        ArrayList<Student> users = new ArrayList<>();
        users.add(new Student("Freddy", "Peña", "102-256"));
        users.add(new Student("Genesis", "Peña", "236-985"));
        users.add(new Student("Samara", "Peña", "256-895"));
        users.add(new Student("Freddy", "Peña", "102-256"));
        users.add(new Student("Genesis", "Peña", "236-985"));
        users.add(new Student("Samara", "Peña", "256-895"));
        users.add(new Student("Freddy", "Peña", "102-256"));
        users.add(new Student("Genesis", "Peña", "236-985"));
        users.add(new Student("Samara", "Peña", "256-895"));
        users.add(new Student("Freddy", "Peña", "102-256"));
        users.add(new Student("Genesis", "Peña", "236-985"));
        users.add(new Student("Samara", "Peña", "256-895"));

        return users;
    }
}

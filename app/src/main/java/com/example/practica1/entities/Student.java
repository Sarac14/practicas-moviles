package com.example.practica1.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final String lastName;
    private final String id;
//    private final String fotourl;
    private final String email;



    public Student(String name, String lastName, String id, String email) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
//        this.fotourl = fotourl;
        this.email = email;
    }

//    public String getFotourl() {
//        return fotourl;
//    }

    public String getEmail() {
        return email;
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


   /* public static List<Student> getStudents() {
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
    }*/
}

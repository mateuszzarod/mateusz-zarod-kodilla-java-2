package com.kodilla.collections.map;

public class Student {
    private String name;
    private String surname;
    private String peselId;

    public Student(String name, String surname, String peselId) {
        this.surname = surname;
        this.name = name;
        this.peselId = peselId;
    }

    public boolean equals(Object o) {
        final Student s = (Student) o;
        return this.name.equals(s.name) && this.surname.equals(s.surname) &&
                this.peselId.equals(s.peselId);
    }

    public String toString() {
        return name + " " + surname + " " + peselId;
    }
}

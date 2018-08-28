package com.kodilla.collections.map;

import java.util.Objects;

public class Employee {
    String firstName;
    String lastName;
    String peselId;

    public Employee(String firstName, String lastName, String peselID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselID;
    }

    @Override
    public boolean equals(Object o) {
        final Employee e = (Employee) o;         return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) &&
                this.peselId.equals(e.peselId);
    }


    @Override
    public int hashCode() {
        return Integer.parseInt(peselId.substring(0,5));
    }


    public String toString(){
        return firstName + " " + lastName + " (" + peselId + ")";
    }
}
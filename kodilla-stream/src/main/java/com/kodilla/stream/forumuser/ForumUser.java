package com.kodilla.stream.forumuser;

/*
Stwórz w katalogu src/main/java pakiet com.kodilla.stream.forumuser, a w nim klasę ForumUser
        Klasa ForumUser powinna mieć następujące pola (użyj odpowiednich nazw angielskich):
        unikalny identyfikator użytkownika (typu int)
        nazwa użytkownika (typu String)
        płeć (typu char), z wartościami ‘M’/’F’
        data urodzenia (typu LocalDate)
        ilość opublikowanych postów (typu int)
        W tym samym pakiecie napisz klasę Forum, która będzie zawierała listę użytkowników, czyli listę obiektów ForumUser.
        Klasa Forum powinna udostępniać metodę getUserList(), która będzie zwracała kolekcję z użytkownika forum
*/

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int userID, String userName, char gender, LocalDate dateOfBirth, int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}

package com.kodilla.kodillapatterns22.adapter.bookclasifier.librarya;

public class BookA {
    private final String author;
    private final String title;
    private final String signature;
    public final int publicationYear;

    public BookA(String author, String title, String signature, int publicationYear) {
        this.author = author;
        this.title = title;
        this.signature = signature;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getSignature() {
        return signature;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

package com.kodilla.testing.library;


import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return  bookList;
        bookList = resultList;
        return bookList;
        }

        public  List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<Book>();
        return bookList;
        }
/*
    Zaimplementuj kolejną metodę klasy BookLibrary - listBooksInHandsOf(LibraryUser libraryUser). Przetestuj tę metodę w różnych scenariuszach:
    gdy użytkownik nie ma wypożyczonych żadnych książek,
    gdy ma wypożyczoną jedną książkę,
    gdy ma wypożyczone 5 książek.
*/

}


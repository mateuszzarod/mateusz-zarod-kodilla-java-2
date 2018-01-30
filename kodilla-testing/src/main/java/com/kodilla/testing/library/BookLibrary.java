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

        //Kamil zrobiłem to trochę na czuja, bo ściągnąłem z poprzedniej metody ;) ale działa
        // w każdym razie muszę cię zapytać, dlaczego tutaj akurat się interfejs "wstrzykuje" jako pole klasy
        // a nie implementuje

        public  List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return bookList;
        }
/*
    Zaimplementuj kolejną metodę klasy BookLibrary - listBooksInHandsOf(LibraryUser libraryUser). Przetestuj tę metodę w różnych scenariuszach:
    gdy użytkownik nie ma wypożyczonych żadnych książek,
    gdy ma wypożyczoną jedną książkę,
    gdy ma wypożyczone 5 książek.
*/

}


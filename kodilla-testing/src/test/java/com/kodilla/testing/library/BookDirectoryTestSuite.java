package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;


/*
testListBooksWithConditionReturnList - ten test sprawdzi czy lista książek spełniających warunek wyszukiwania jest poprawnie zwracana
testListBooksWithConditionMoreThan20 - ten test posłuży do sprawdzenia czy metoda listBooksWithCondition(String titleFragment)
zachowuje się poprawnie gdy ilość tytułów pasujących do wzorca jest większa niż 20 - w tej sytuacji zwracana powinna być pusta lista.
testListBooksWithConditionFragmentShorterThan3 - ten test z kolei ma za zadanie sprawdzenie czy zwracana lista książek jest pusta,
w sytuacji gdy wyszukiwany fragment tytułu jest krótszy niż trzy znaki.
*/

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfFiveBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book("Gwiezdne Wojny", "John Lucas", 2001);
        Book book2 = new Book("Gwiezdne Wojny2", "John Lucas", 2002);
        Book book3 = new Book("Gwiezdne Wojny3", "John Lucas", 2003);
        Book book4 = new Book("Gwiezdne Wojny4", "John Lucas", 2004);
        Book book5 = new Book("Gwiezdne Wojny5", "John Lucas", 2004);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);


        LibraryUser user = new LibraryUser("Mateusz", "Zarod", "83082510111");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> checkBook = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(5, checkBook.size()); //test nie wychodzi, przypisuje mi 0 książek, nie wiem czy to wina metody listBooksInHandsOf
    }
    @Test
    public void testListBooksInHandsOfOneBook(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("Mission Impossible", "Stanley Kubrick", 2000);
        bookList.add(book);
        LibraryUser user = new LibraryUser("Stefan", "Czerski", "324234234234");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> checkBook = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(1, checkBook.size()); //test nie wychodzi, przypisuje mi 0 książek, nie wiem czy to wina metody listBooksInHandsOf
        }


    @Test
    public void testListBooksInHandsOfZeroBooks(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> bookList = new ArrayList<>();
        LibraryUser user = new LibraryUser("Jan", "Tucznik", "2332323232");
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(bookList);

        //When
        List<Book> checkBook = bookLibrary.listBooksInHandsOf(user);

        //Then
        assertEquals(0, checkBook.size());
        }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

}

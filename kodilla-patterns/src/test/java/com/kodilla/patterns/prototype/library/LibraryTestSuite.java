package com.kodilla.patterns.prototype.library;

/*W teście stwórz obiekt biblioteki oraz kilka obiektów książek i dodaj je do księgozbioru.
        Zmodyfikuj klasę Library tak, aby była zgodna ze wzorcem Prototype
        Zmodyfikuj test testGetBooks() w taki sposób, aby prezentował działanie shallowCopy() oraz deepCopy().
        Utworzony kod prześlij do repozytorium Github.*/

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
            public void testGetBooks(){
        //Given
        //create the Books to Library
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Mamoko", "Mizielinski Adam", LocalDate.of(2000,12,20));
        Book book2 = new Book("1984", "Mizielinski Krzyś", LocalDate.of(2040,12,30));
        Book book3 = new Book("Mission Impossible", "Sienkiewicz Adam", LocalDate.of(2018,9,20));
        Book book4 = new Book("Władca Pierścieni", "Mickiewicz Adam", LocalDate.of(2017,6,20));
        Book book5 = new Book("Incepcja", "Stefan Zieliński", LocalDate.of(2009,12,20));
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        Library library = new Library("Biblioteka im. Mateusza");
        library.books = books;

        //making shallowcopy
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Biblioteka im. Oli");

        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making deepcopy
        Library cloneDeepLibrary = null;
        try {
            cloneDeepLibrary = library.deepCopy();
            cloneDeepLibrary.setName("Biblioteka im. Ani");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(cloneDeepLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, cloneDeepLibrary.getBooks().size());

    }
}

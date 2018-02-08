package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

/*        zainicjuje strumień Stream przy pomocy metody stream() kolekcji
        odfiltruje tylko tych użytkowników, którzy są mężczyznami
        odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
        odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
        przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika
        wyświetli otrzymaną mapę wynikową
        Napisany program prześlij do repozytorium GitHub.*/

        Forum forum = new Forum();
        forum.addUser(1999, "Mateusz", 'M', LocalDate.of(1999, 12, 5), 77);
        forum.addUser(2323, "Grzegorz", 'M', LocalDate.of(1899, 12, 7), 34);
        forum.addUser(3424, "Lukas", 'M', LocalDate.of(2000, 3, 20), 0);
        forum.addUser(4345, "Jan", 'M', LocalDate.of(1988, 4, 21), 200);
        forum.addUser(5677, "Anonim", 'M', LocalDate.of(1977, 3, 22), 100);
        forum.addUser(6453, "Hela", 'F', LocalDate.of(2007, 6, 12), 38);
        forum.addUser(7354, "Nina", 'F', LocalDate.of(1997, 7, 30), 0);
        forum.addUser(8678, "Ling", 'F', LocalDate.of(1991, 8, 13), 55);
        forum.addUser(9233, "Ula", 'F', LocalDate.of(1923, 10, 4), 1);
        forum.addUser(1011, "Olga", 'F', LocalDate.of(1900, 12, 1), 322);

        Map<Integer, ForumUser> theResultMapofUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getGender() != 'F')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1998)// nie jestem tylko z tego zadowolony, ale pocztyam dokuemtację i to przerobię
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("# elements" + theResultMapofUsers.size());
        theResultMapofUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);





    /* BookDirectory
      BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/
    }
}


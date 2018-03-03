package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser(String username) {
        username = "John Smith";
    }

    public String getUsername() {
        return username;
    }


}

/*    Celem zadania jest stworzenie w Kontenerze Beana klasy ForumUser i jego sprawdzenie w teście. Aby zrealizować zadanie:

        W katalogu src/main/java utwórz pakiet com.kodilla.spring.forum
        Napisz klasę ForumUser w pakiecie com.kodilla.spring.forum. Klasa powinna mieć pole String username inicjowane w konstruktorze wartością "John Smith" (nie przekazuj tego jako parametr - wpisz to w konstruktorze "na sztywno"). Oznacz klasę jako @Component.
        W katalogu src/test/java stwórz pakiet com.kodilla.spring.forum, a w nim zestaw testów ForumUserTestSuite.
        Napisz test testGetUsername() pobierający z kontekstu aplikacji uchwyt do Beana klasy ForumUser. Test powinien pobierać username i sprawdzać przy pomocy asercji czy zwróconą wartością jest "John Smith".
        Gotowy kod prześlij do repozytorium Github.*/


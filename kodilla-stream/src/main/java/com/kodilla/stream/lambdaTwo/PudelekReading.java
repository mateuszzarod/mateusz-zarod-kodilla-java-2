package com.kodilla.stream.lambdaTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PudelekReading {
    public static void main(String[] args) {
        List<Celebrity> celebrities = new ArrayList<>();
        celebrities.add(new Celebrity("Justin Bieber", true, false, true));
        celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
        celebrities.add(new Celebrity("Joanna Krupa", true, true, false));

        print(celebrities, c -> c.canSing());
        print(celebrities, c -> c.canDance());
        print(celebrities, c-> c.canAct());

        celebrities.forEach(celebrity -> System.out.println(celebrity.toString() + "\n"));
        celebrities.forEach(System.out::println);



    }

    private static void print(List<Celebrity> celebrities, Predicate<Celebrity> checkTalent) {
        for (Celebrity celebrity : celebrities) {
            if (checkTalent.test(celebrity)) {
                System.out.println(celebrity + " ");
            }
        }
    }
}

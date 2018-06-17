package com.kodilla.kodillapatterns2.facade;
import java.util.stream.Stream;

class Binary {
    static int solution(int N) {
        return Stream.of(

                Integer.toBinaryString(N)
                        // trim 0(s) at the end
                        .replaceAll("0+$", "")
                        // split string with 1(s)
                        .split("1+"))
                // lambda expressions: use filter to keep not null elements
                .filter(a -> a != null)
                // method references: convert string to integer by using the
                // length of string
                .map(String::length)
                // method references: find the largest number in the stream by
                // using integer comparator
                .max(Integer::compare)
                // return 0 if nothing matches after the process
                .orElse(0);
    }

}
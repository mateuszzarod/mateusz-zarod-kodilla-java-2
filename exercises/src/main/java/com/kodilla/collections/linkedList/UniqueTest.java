package com.kodilla.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class UniqueTest {
    public static void main(String[] args) {
        LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();
        Random theGenerator = new Random();
        //filling the list with random values
        for (int i = 0; i < 100; i++) {
            listOfNumbers.add(new MyObject(theGenerator.nextInt()));
        }

        Iterator<MyObject> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            MyObject examinedObject = iterator.next();
            for (int k = 0; k < listOfNumbers.size(); k++) {
                if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {
                    if (listOfNumbers.get(k).equals(examinedObject)) {
                        System.out.println("duplicated: " + examinedObject.getValue());
                        System.out.println(System.currentTimeMillis());
                    }
                }
            }
        }

    }
}

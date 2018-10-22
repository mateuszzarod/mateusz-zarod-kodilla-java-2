package com.kodilla.stringHow;

import java.util.HashSet;

public class StringExercise2 {

    public String toString(){
        System.out.println("Test toString called");
        return "";
    }

    public static void main(String args[]){


        System.out.println(new StringExercise2().toString());

        String s1 = null;
        System.out.println(s1); //line 2
        //System.out.println(s1.toString()); //line 3

        String t1 = "abc";
        String t2 = new String("abc");

        t2.intern();
        System.out.println(t1==t2);

        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);

    }
}

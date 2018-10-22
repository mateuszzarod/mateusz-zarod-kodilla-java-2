package com.kodilla.stringHow;

import java.util.Scanner;

class tertiaryOp {

    private static boolean invertBoolean(boolean b) {
        return b ? false : true;
    }

    private static int getAbsoluteValue(int i) {
        return i < 0 ? -i : i;
    }

    private static int getMinValue(int i, int j) {
        return (i < j) ? i : j;
    }

}

public class StringPalindrome {

    public static void main(String[] args) {


        //write a method palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give mi word");
        String str = scanner.nextLine();


        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            System.out.println("PALINDROME");
        } else System.out.println("NOTNOTNOT");


        //write a method that will remove chr form a String
        String s = "mamamia";
        System.out.println(s.replaceAll(Character.toString('a'), Character.toString('X')));

        String data = s.contains("a") ? "WOW it contains A" : "No i doesen't contains A";

        //Write a tertiary argument method

        int i = 6;
        switch (i) {
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("i is not equal to 5 or 10");
        }

        System.out.println((i==5)?"i=5":((i==10))? "i=10": "i is not equal to 5 or 10");
    }

}

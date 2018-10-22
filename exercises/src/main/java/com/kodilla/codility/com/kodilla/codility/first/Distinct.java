package com.kodilla.codility.com.kodilla.codility.first;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        Distinct distinct = new Distinct();
        int[] A = {2, 3, 4};
        System.out.println("result is: " + distinct.solution(A));
    }

    public int solution(int[] A) {

        Arrays.sort(A);

        int max = Arrays.stream(A).max().getAsInt();
        int moves = 0;

        for (int i = 0; i < A.length - 1; i++) {
            System.out.println("max is: " + max);
            System.out.println("iteration number" + i);

            if ((A[i] + max) == 7) {
                System.out.println("adding 2 for: " + " " + A[i]);
                moves = moves + 2;
            } else if (A[i] == max) {
                System.out.println("Added 1 for" + A[i]);
                moves = moves + 0;
            } else moves = moves + 1;
        }
        System.out.println("");
        return moves;
    }
}




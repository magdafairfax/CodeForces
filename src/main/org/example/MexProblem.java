package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MexProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] play = new int[n];

            for (int j = 0; j < n; j++) {
                play[j]= sc.nextInt();
            }

            System.out.println(Math.min(findMexWithSort(play), k-1));
        }
        sc.close();
    }

    public static int findMexWithSort(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        int mex = 0; // The potential smallest missing non-negative integer
        for (int value : arr) {
            // Only consider non-negative values, and handle duplicates implicitly
            if (value == mex) {
                mex++; // If the current 'mex' is found, increment to the next potential missing number
            } else if (value > mex) {
                // If the current value is greater than mex, it means mex is the first missing number
                break;
            }
        }
        return mex;
    }
}

package org.example;

import java.util.Scanner;

public class Suspension {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(findMaximumSuspensions(n, y, r));
        }

        sc.close();
    }

    public static int findMaximumSuspensions(int n, int  y , int r) {
        int s = y/2 + r;

        if(s < n)
            return s;
        else
            return n;
    }
}

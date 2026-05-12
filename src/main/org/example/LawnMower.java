package org.example;

import java.util.Scanner;

public class LawnMower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int w = sc.nextInt();

            System.out.println(((n/w) * (w-1) + n%w));
        }

        sc.close();
    }
}

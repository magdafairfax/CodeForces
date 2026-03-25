package org.example;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int k = sc.nextInt();
            int x = sc.nextInt();

            System.out.println(k*x+1);
        }

        sc.close();
    }
}

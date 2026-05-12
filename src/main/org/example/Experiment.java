package org.example;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int persons = sc.nextInt();
            if (persons <= 3)
                System.out.println(persons);
            else
                System.out.println(persons%2);
        }
        sc.close();
    }
}

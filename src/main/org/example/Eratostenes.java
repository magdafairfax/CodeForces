package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Eratostenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        Integer sixtySeven = 67;

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }


            if (list.contains(sixtySeven))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}

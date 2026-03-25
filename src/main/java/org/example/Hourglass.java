package org.example;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int s = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            if (s<=k) {
                System.out.println(Math.max(0, s-m%k));
            } else {
               if(m%(2*k)<k) {
                    System.out.println(s-m%k);
               } else {
                   System.out.println(k-m%k);
               }
            }
        }
        sc.close();
    }
}

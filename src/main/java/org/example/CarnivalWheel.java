package org.example;

import java.util.Scanner;

public class CarnivalWheel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(findMaxPrize(l,a,b));
        }

        sc.close();
    }

    public static int findMaxPrize(int l, int a, int b) {
        int max =0;
        for (int i = 0; i <= l; i++) {
            max = Math.max(max,(a+i*b)%l);
        }
        return max;
    }
}

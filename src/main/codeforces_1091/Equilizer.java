package codeforces_1091;

import java.util.Arrays;
import java.util.Scanner;

public class Equilizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] list = new int[n];

            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            int sum = Arrays.stream(list).sum();

            if (sum%2 == 0) {
                if ((sum +k*n) %2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
            System.out.println();
        }
        sc.close();
    }
}

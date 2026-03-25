package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TableWithNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }

            if (isOK(arr1, s, x))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }

    public static boolean isOK(ArrayList<Integer> arr1, int s, int x) {

        int sum = arr1.stream().reduce(0, Integer::sum);

        if (sum > s) {
            return false;
        } else {
            if (sum == s) {
                return true;
            } else {
                if ((s-sum) % x == 0)
                    return true;
                else
                    return false;
            }
        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendlyNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            System.out.println(countFriends(n));
        }

        sc.close();
    }

    public static int countFriends(int n) {
        int count = 0;


        for (int y  = n; y < n+100 ;  y++) {
            String sy = Integer.toString((y));
            List<Integer> list = new ArrayList<>();
            for (Character c : sy.toCharArray()) {
                list.add(c - '0');
            }
            if (y - list.stream().mapToInt(Integer::intValue).sum() == n) {
                count++;
            }

        }

        return count;
    }
}

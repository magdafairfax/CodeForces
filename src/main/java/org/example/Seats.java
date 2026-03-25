package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Seats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            String row = sc.next();
            ArrayList<Integer> list = new ArrayList<>();

            for (char c : row.toCharArray()) {
                if (c == '0') list.add(0);
                else list.add(1);
            }

            System.out.println(findMinStudents(list));
        }

        sc.close();
    }

    public static int findMinStudents(ArrayList<Integer> list) {

        if (list.size() == 0) return 0;
        if (list.size() <= 2) return 1;

        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i) == 0 && list.get(i-1) == 0  && list.get(i+1) == 0) {
                list.set(i, 1);
            }
        }

        return list.stream().reduce(0, (a,b) -> a + b);

    }
}

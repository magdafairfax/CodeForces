package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            System.out.println(nrOps(list));
        }
        sc.close();
    }


    public static int nrOps(ArrayList<Integer> list) {
        int count= 0;

        for (int i = 0; i < list.size()-1; i++) {
           if (list.get(i) == 7-list.get(i+1) || list.get(i) == list.get(i+1)) {
               count ++;
               i++;
           }
        }
        return count;
    }
}

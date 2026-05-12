package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }

            System.out.println(findNoOfOps(arr1));
        }

        sc.close();
    }

    public static int findNoOfOps(ArrayList<Integer> arr1) {
        int count = 0;

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = i + 1; j < arr1.size(); j++) {
                if(arr1.get(j) < arr1.get(i)) {
                    arr1.remove(j);
                    count ++;
                    i=0; j=0;
                }
                //System.out.println("i = " + i + " j = " + j);
            }
        }
        //System.out.println(arr1.toString());
        return count;
    }
}

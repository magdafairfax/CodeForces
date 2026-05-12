package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Showering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }

            System.out.println(findMinSum(arr1));
        }

        sc.close();
    }

    public static int findMinSum(ArrayList<Integer> arr) {

        int ans = 0;
        int index = 0;
        int sum = 0;

        for (int i = 0; i < arr.size()-1; i++) {
            sum +=Math.abs(arr.get(i) - arr.get(i + 1));
        };
        ans = Math.min(Math.abs(sum - Math.abs(arr.get(0)- arr.get(1))), Math.abs(sum - Math.abs(arr.get(arr.size()-1)- arr.get(arr.size()-2))));

        for (int i = 1; i < arr.size()-1; i++) {
            ans = Math.min(ans, sum - Math.abs(arr.get(i+1)-arr.get(i))
                    - Math.abs(arr.get(i)-arr.get(i-1))
                    + Math.abs(arr.get(i+1)-arr.get(i-1)));
        }


        return ans;
    }
}

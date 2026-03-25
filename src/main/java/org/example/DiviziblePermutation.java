package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class DiviziblePermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

           String result = Arrays.toString(findDiviziblePerm(n));
            System.out.println(result.substring(1, result.length()-1).replace(",", ""));
        }

        sc.close();
    }

    public static int[] findDiviziblePerm(int n){
       int[] arr = new int[n];
        if (n%2 == 0) {
            for (int i=0; i < n/2; i ++ ) {
                arr[n-2*i-1] = n-i;
                arr[n-2*i-2] = i+1;
            }
        }
        else {
            for (int i=0; i < n/2; i ++ ) {
                arr[n-2*i-1] = i+1;
                arr[n-2*i-2] = n-i;
            }
            arr[0]=n/2+1;
        }
        return arr;
    }

}

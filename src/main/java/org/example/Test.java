package org.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            System.out.println(findMaximumCost(n));
        }

        sc.close();
    }

    public static int findMaximumCost(int n) {
        int cost1 = n*(n-1)-1 + 3*n*n-3 ;
        int cost2 = n*(n-2)-1 + n*(n-1)-2 +n*(n-1)-1+n*(n-1) + n*n -1;

        if (n==1) return 1;
        if (n==2) return 9;
        if(cost1>cost2  )
            return cost1;
        else return cost2;
    }
}
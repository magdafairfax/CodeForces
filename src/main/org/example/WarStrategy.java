package org.example;

import java.util.Scanner;

public class WarStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int bases = sc.nextInt();
            int days = sc.nextInt();
            int home = sc.nextInt();

            int a = 0;
            int b = 0;;

            if (home-1 < bases-home)
                home = bases+1-home;
            while(true) {
                if(b < bases-home && a + (b+1) + Math.max(a,b+1)-1 <= days) ++b;
                if(a < home-1 && (a+1)+b+Math.max(a+1,b)-1<=days)++a;
                else break;
            }

            System.out.println(a+b+1);

        }
        sc.close();
    }
}

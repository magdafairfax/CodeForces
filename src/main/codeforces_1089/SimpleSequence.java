package codeforces_1089;

import java.util.Scanner;

public class SimpleSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();


        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            for (int j = n; j>=1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }

}

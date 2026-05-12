package codeforces_1089;

import java.util.Scanner;

public class ChairGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int [] chairs = new int[n+1];

            for (int j = 1; j <= n; j++) {
                chairs[j] = sc.nextInt();
            }

            System.out.println(maxNumberOfChairs(chairs));
        }

        sc.close();
    }

    public static int maxNumberOfChairs(int[] chairs) {
        int count = 0;

        for (int i = 1; i < chairs.length; i++) {
            if (chairs[i] <= i) count++;
        }
        return count;
    }
}

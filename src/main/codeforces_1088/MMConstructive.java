package codeforces_1088;

import java.util.Arrays;
import java.util.Scanner;

public class MMConstructive {
    static final long MOD = 676767677;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();


        for (int i = 0; i < noOfTest; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] result = new int[x+y];

            for (int j = 0; j < result.length; j++) {
                if (j <x) result[j] =1;
                else result[j] = -1;
            }
            System.out.println(findMinFunc(x, y) % MOD);

            Arrays.stream(result).forEach(el -> System.out.print(el + " "));
            System.out.println();
        }

        sc.close();
    }


    public static long findMinFunc(int x, int y) {
        int dif = Math.abs(x-y);

        if ( dif ==0)
           return 1;
        else
            return countDivisors(dif);
    }

    static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * (long)i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) count++;
                else count += 2;
            }
        }
        return count;
    }
}

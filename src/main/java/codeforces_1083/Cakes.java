package codeforces_1083;

import java.util.Scanner;

public class Cakes
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            long n = sc.nextLong();

            System.out.println(findMinK(n));


        }
        sc.close();
    }

    public static long findMinK(long n) {
        if (n == 1) return 1;
        long k = 1;
        long tempN = n;
        for (long i = 2; i * i <= tempN; i++) {
            if (tempN % i == 0) {
                k *= i;
                while (tempN % i == 0) {
                    tempN /= i;
                }
            }
        }
        if (tempN > 1) {
            k *= tempN;
        }
        return k;
    }
}

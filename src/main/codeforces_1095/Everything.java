package codeforces_1095;

import java.util.Scanner;

public class Everything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            int[] list = new int[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            System.out.println(findNoGoodSubarrays(list, n));
        }
        sc.close();
    }

    public static int findNoGoodSubarrays(int[] list, int n) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int min = list[i];
            int max = list[i];
            int commonGcd = list[i];
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, list[j]);
                max = Math.max(max, list[j]);
                commonGcd = gcd(commonGcd, list[j]);

                if (max - min ==  commonGcd) {
                    count++;
                }
                if (commonGcd < (max - min)) {
                    break;
                }
            }
        }
        return count;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}

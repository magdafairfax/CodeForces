package codeforces_1095;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DisturbingDistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            Integer[] list = new Integer[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            System.out.println(calculateCost(list, n));
        }
        sc.close();
    }

    public static long calculateCostDynamic(int[] list, int n) {
        final int MOD = 676767677;
        long[] cost = new long[n + 1];
        Arrays.fill(cost, Integer.MAX_VALUE);

        cost[0] = 0;

        for (int i = 1; i <= n; i++) {
            long product = 1;
            long last = Long.MAX_VALUE;

            for (int j = i; j >= 1; j--) {
                if (list[j - 1] > last) break;

                last = list[j - 1];
                product = (product * list[j - 1]) % MOD;
                System.out.println("i: " + i + ", j: " + j + ", product: " + product);

                cost[i] = Math.min(cost[i],
                        (cost[j - 1] + product) % MOD);

                System.out.println("cost [" +i +"]= "+ cost[i]);
                System.out.println("cost [" +j +"]= "+ cost[j]);
            }
        }

        return cost[n];
    }

    public static long calculateCost(Integer[] list, int n) {
        int ans  = 0;
        Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i < n; i++) if(list[i] > 1) ans += list[i];
        if(list[n-1] == 1) ans++;

        return ans;

    }

}

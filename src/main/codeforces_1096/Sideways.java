package codeforces_1096;

import java.util.Scanner;

public class Sideways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            int[] list = new int[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            System.out.println(findMaxMovement(list, n));
        }
        sc.close();
    }

    public static long findMaxNoOfCubes(int[] list, int n) {
        long sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += list[i];
        }

        long[] suf_list = new long[n];
        suf_list[n - 1] = list[n - 1];
        sum -= suf_list[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suf_list[i] = Math.min(suf_list[i + 1], list[i]);
            sum -= suf_list[i];
        }

        long mx = -1;
        long cur = 1;

        for (int i = 1; i < n; i++) {
            if (suf_list[i] == suf_list[i - 1]) {
                cur++;
            } else {
                mx = Math.max(mx, cur);
                cur = 1;
            }
        }

        mx = Math.max(mx, cur);

        return sum +mx-1;
    }

    public static Long findMaxMovement( int [] array, int n) {

        long[] cnt = new long[n +1];
        for (int i = 1; i <= n; i++) {

            cnt[(int) array[i-1]]++;
        }

        long[] have = new long[n + 1];

        have[n] = cnt[n];

        for (int i = n - 1; i >= 1; i--) {
            have[i] = have[i + 1] + cnt[i];
        }

        long init = 0;
        long aft = 0;

        for (int i = 1; i <= n; i++) {
            init += (long) i * array[i-1];
            aft += have[i] * (2L * n - have[i] + 1) / 2;
        }

        long cur = aft - init;
        long mx = 0;

        for (int i = 1; i <= n; i++) {
            mx = Math.max(mx, i - n + have[(int)array[i-1]] - 1);
        }


        return cur+mx;



    }
}

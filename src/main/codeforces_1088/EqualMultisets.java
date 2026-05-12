package codeforces_1088;

import java.util.*;

public class EqualMultisets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }

            if (isPossible(a,b,n,k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    static boolean isPossible(int[] a, int[] b, int n, int k) {

        if (containsDuplicate(b))
            return false;
        if (2 * k <= n) {
            for (int i = 0; i < n; i++) {
                if (b[i] != -1 && b[i] != a[i]) return false;
            }
            return true;
        }


        boolean[] used = new boolean[n + 1];

        // prefix [0 ... n-k-1] must match
        for (int i = 0; i < n - k; i++) {
            if (b[i] != -1 && b[i] != a[i]) return false;
        }

        // suffix [k ... n-1] must match
        for (int i = k; i < n; i++) {
            if (b[i] != -1 && b[i] != a[i]) return false;
        }

        // Mark already used values
        for (int i = 0; i < n; i++) {
            if (b[i] != -1) {
                if (used[b[i]]) return false; // duplicate
                used[b[i]] = true;
            }
        }

        // Count missing numbers
        int missing = 0;
        for (int i = 1; i <= n; i++) {
            if (!used[i]) missing++;
        }

        // Count empty slots
        int empty = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == -1) empty++;
        }

        return missing == empty;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num != -1) {
                if (set.contains(num)) return true;
                set.add(num);
            }
        }
        return false;
    }
}

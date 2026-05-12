package codeforces_1085;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Animatronics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            System.out.println(findMinTime(list, m, l));

        }
        sc.close();
    }

    public static int findMinTime(List<Integer> list, int m, int l) {
       int n = list.size();
        int[] lvls = new int[m];
        int curr = n;
        for (int i = 0; i < l; i++) {
            int idx = Math.min(m, curr + 1) - 1;
            lvls[idx]++;

            Arrays.sort(lvls);
            reverse(lvls);

            if (curr > 0 && list.get(n - curr) - 1 == i) {
                lvls[0] = 0;
                Arrays.sort(lvls);
                reverse(lvls);
                curr--;
            }
        }

        return lvls[0];
    }

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

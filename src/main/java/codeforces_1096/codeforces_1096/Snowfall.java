package codeforces_1096.codeforces_1096;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snowfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            int[] list = new int[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }
            System.out.println(MinimizeSubarraysDivBy6(list, n).toString().replaceAll("[\\[\\],]", ""));

        }
        sc.close();
    }

    public static List<Integer> MinimizeSubarraysDivBy6(int[] list, int n) {
        List<Integer> div6 = new ArrayList<>();
        List<Integer> div3 = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> other = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int el : list) {
            if (el % 6 == 0) {
                div6.add(el);
            } else if (el % 2 == 0) {
                even.add(el);
            } else if (el % 3 == 0) {
                div3.add(el);
            } else {
                other.add(el);
            }
        }



        result.addAll(div6);
        result.addAll(even);
        result.addAll(other);
        result.addAll(div3);
        return result;
    }
}

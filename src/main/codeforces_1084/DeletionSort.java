package codeforces_1084;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeletionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            List<Integer> result = list.stream().sorted().toList();

            if (result.equals(list)) {
                System.out.println(n);
            } else {
                System.out.println(1);
            }
        }
        sc.close();
    }
}

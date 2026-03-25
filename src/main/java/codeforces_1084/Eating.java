package codeforces_1084;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Eating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            int max = list.stream().max(Integer::compare).orElse(0);
            int count = 0;

            for (Integer num : list) {
                if (num == max) {
                    count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}

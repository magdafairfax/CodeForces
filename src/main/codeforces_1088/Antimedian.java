package codeforces_1088;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Antimedian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            int[] result  =  new int[list.size()];

            if (list.size() == 1) {
                result[0] = 1;
            } else {
                for (int j=0; j< list.size(); j++) {
                    result[j] = 2;
                }
            }

            Arrays.stream(result).forEach(el -> System.out.print(el + " "));
            System.out.println();
        }

        sc.close();
    }
}

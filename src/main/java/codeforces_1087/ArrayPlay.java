package codeforces_1087;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayPlay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            int[] result  =  findMaxNumber(list);

            Arrays.stream(result).forEach(el -> System.out.print(el + " "));
            System.out.println();
        }

        sc.close();
    }

    public static int[] findMaxNumber(List<Integer> list) {
        int[] f1 = new int[list.size()];
        int[] f2 = new int[list.size()];

        for (int i = list.size() - 1; i >= 0; i--) {
            f1[i] = 0;
            f2[i] = 0;
            for(int j = i+1; j < list.size(); j++) {
                if(list.get(i)>list.get(j)) {
                    f1[i] ++;
                }
                if(list.get(i)<list.get(j)){
                    f2[i] ++;
                }

            }
            f1[i] = Math.max(f1[i], f2[i]);
        }

        return f1;
    }
}

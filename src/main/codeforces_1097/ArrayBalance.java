package codeforces_1097;

import java.util.Scanner;

public class ArrayBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            Long[] list = new Long[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextLong();
            }

            System.out.println(findNoOfPositiveInteger(list));
        }
        sc.close();
    }

    public static int findNoOfPositiveInteger(Long[] list) {
        int count = 0;

        for (int i = list.length - 2; i >=0; i--) {
            if(list[i + 1] > 0) {
                list[i] = list[i] + list[i + 1];
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                count ++;
            }
        }

        return count;
    }
}

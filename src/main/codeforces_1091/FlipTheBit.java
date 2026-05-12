package codeforces_1091;

import java.util.Arrays;
import java.util.Scanner;

public class FlipTheBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] list = new int[n+1];
            list[0]=1;

            for (int j = 1; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            int index = sc.nextInt();

            System.out.println(findNoOfMinOp(list, index));
        }
        sc.close();
    }

    public static int findNoOfMinOp(int[] list, int index) {
        int count = 0;

        while (Arrays.stream(list).sum() < list.length) {
            count++;
            int l = findLeft(list, index);
            int r = findRight(list, index);

            System.out.println("l: " + l + " r: " + r + " count = " + count);
            System.out.println(Arrays.toString(list).replace("[", "").replace("]", ""));

            for (int i = l; i <=r; i++) {
                if (list[i] == 0)
                    list[i] = 1;
                else
                    list[i] = 0;
            }

        }

        if (list[index] == 0)
            count++;
        System.out.println(Arrays.toString(list).replace("[", "").replace("]", ""));

        return count;
    }

    static int findLeft(int[] list, int index) {
        int left = index;
        for (int i = index-1; i >=0; i--) {
            if (list[i] == 0)
                left = i;
        }
        return left;
    }

    static int findRight(int[] list, int index) {
        int right = index;
        for (int i = index+1; i < list.length; i++) {
            if (list[i] == 0)
                right = i;
        }
        return right;
    }
}

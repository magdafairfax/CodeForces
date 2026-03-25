package codeforces_1086;

import java.util.*;

public class Cyclists {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();
            int m = sc.nextInt();
            int winCondition = 0;
            Queue<Integer> queue = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                queue.add(sc.nextInt());
                if (j==p-1) {
                    winCondition = queue.peek();
                }

            }

            System.out.println(getMaxWins(queue, k, winCondition, m));
        }

        sc.close();
    }

    public static int getMaxWins(Queue<Integer> queue, int k, int winCond, int m) {
        int count = 0;

        while (m > 0) {
            int value =0;

            for(int i = 0; i < k; i++) {
                value = queue.peek();
                if (value == winCond) {
                    count++;

                };
                queue.remove();
                queue.add(value);



            }
            m -= value;

        }
        return count;
    }
}

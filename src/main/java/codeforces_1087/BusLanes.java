package codeforces_1087;

import java.util.*;

public class BusLanes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lanes = sc.nextInt();

        int[] road = new int[n];
        int[] diff = new int[n+2];

        diff[0] = 0;
        for (int j = 0; j < n; j++) {
            road[j] = sc.nextInt();
            diff[j+1] = 0;
        }

        for (int j = 0; j < lanes; j++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            diff[start]++;
            diff[end+1] --;
        }

        for (int i=1; i<=n; i++) {
            diff[i] = diff[i-1] + diff[i];
        }

        for (int i = 0; i < road.length; i++) {
            System.out.print(road[i] +diff[i+1]+ " ");
        }

        sc.close();
    }

}


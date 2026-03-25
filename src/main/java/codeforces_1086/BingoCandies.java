package codeforces_1086;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class BingoCandies  {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int j =0; j < n*n; j++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            boolean found = true;

            int max = n*n-n;

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    found = false;
                    break;
                }
            }
            if(found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

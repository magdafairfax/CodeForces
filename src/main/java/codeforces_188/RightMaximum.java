package codeforces_188;

import java.util.ArrayList;
import java.util.List;

public class RightMaximum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            System.out.println(noOfOps(list));
        }
        sc.close();
    }

    static public int noOfOps(List<Integer> list) {
        int count = 0;
        int mx = 0;

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i) >= mx) count++;
            mx = Math.max(mx, list.get(i));
        }
        return count;
    }
}
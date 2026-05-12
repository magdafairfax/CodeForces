package codeforces_1096;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Palindromex {
    static int n;
    static ArrayList<Integer> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            n = sc.nextInt();
            list = new ArrayList<>();

            for (int j = 0; j < 2 * n; j++) {
                list.add(sc.nextInt());
            }

            int x = list.indexOf(0);
            int y = list.lastIndexOf(0);

            // System.out.println("X = " + x + "Y = " +y);
            int ans = Math.max(
                    Math.max(optimalPalindromeMex(x, x), optimalPalindromeMex(y, y)),
                    optimalPalindromeMex((x + y) / 2, (x + y + 1) / 2)
            );

            System.out.println(ans);
        }
        sc.close();
    }

    public static int optimalPalindromeMex( int l, int r) {
        TreeSet<Integer> s = new TreeSet<>();

        for (int i = 0; i <= n; i++) {
            s.add(i);
        }


        while (l >= 0 && r < 2 * n && list.get(l).equals(list.get(r))) {
            s.remove(list.get(l));
            l--;
            r++;
        }
        //System.out.println(s);
        return s.first();
    }
}

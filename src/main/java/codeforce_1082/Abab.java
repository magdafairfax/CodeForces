package codeforce_1082;

import java.util.Scanner;

public class Abab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int length = sc.nextInt();
            String s = sc.next();

            if (isValid(s, length)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static boolean isValid(String s, int n) {
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(i % 2)) {
                return false;
            }
        }
        return true;
    }
}

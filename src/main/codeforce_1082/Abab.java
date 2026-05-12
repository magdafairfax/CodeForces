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
        int l = 1, r = n;
        boolean valid = true;

        for (int i = 0; i < n; i++) {
            char leftChar = (l % 2 == 1) ? 'a' : 'b';
            char rightChar = (r % 2 == 1) ? 'a' : 'b';

            if (s.charAt(i) == '?') {
                l++;
            } else {
                if (s.charAt(i) == leftChar) {
                    l++;
                } else if (s.charAt(i) == rightChar) {
                    r--;
                } else {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }
}

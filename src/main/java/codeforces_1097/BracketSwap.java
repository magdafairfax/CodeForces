package codeforces_1097;

import java.util.Scanner;

public class BracketSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            if(canBeBalanced(a, b)){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }
        sc.close();
    }

    public static boolean canBeBalanced(String a, String b) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        boolean ok = true;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sb1.append(a.charAt(i));
                sb2.append(b.charAt(i));
            } else {
                if (ok) {
                    sb1.append('(');
                    sb2.append(')');
                } else {
                    sb1.append(')');
                    sb2.append('(');
                }
                ok = !ok;
            }
        }

        int t1 = 0, t2 = 0;
        ok = true;

        for (int i = 0; i < a.length(); i++) {
            if (sb1.charAt(i) == '(') t1++;
            else t1--;

            if (sb2.charAt(i) == '(') t2++;
            else t2--;

            if (t1 < 0 || t2 < 0) {
                ok = false;
            }
        }
        if (t1 != 0 || t2 != 0) {
            ok = false;
        }

        return ok;
    }

}

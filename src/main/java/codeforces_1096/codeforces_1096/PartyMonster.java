package codeforces_1096.codeforces_1096;

import java.util.Scanner;

public class PartyMonster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n%2 == 1) {
                System.out.println("NO");
            } else {
                int open = 0;
                int close = 0;
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) == '(') {
                        open++;
                    } else {
                        close++;
                    }
                }
                if(open == close){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}

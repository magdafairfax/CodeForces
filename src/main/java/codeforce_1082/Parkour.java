package codeforce_1082;

import java.util.Scanner;

public class Parkour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (isCoursePossible(0, 0, x, y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isCoursePossible(int x, int y, int xtarget, int ytarget) {
        if (x == xtarget && y == ytarget) {
            return true;
        }
        if (xtarget == ytarget * 2) {
            return true;
        }

        if ((xtarget + ytarget)%3 == 0 && ytarget >= (-1* xtarget/4) && (ytarget<=xtarget/2)) {
            return true;
        }
        else return false;

    }
}

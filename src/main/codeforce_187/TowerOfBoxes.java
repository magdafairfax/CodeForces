package codeforce_187;

import java.util.Scanner;

public class TowerOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int height = d/m +1;
            int noOfTowers = (n+height-1)/height ;

            if (d < m)
                System.out.println(n);
            else if (height >n)
                System.out.println(1);
            else
                System.out.println(noOfTowers);

        }
        sc.close();
    }
}

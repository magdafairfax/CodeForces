package spectral;

import java.util.*;

public class Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            int[] list = new int[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            if((isContestWonderful(list)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }


    public static boolean isContestWonderful(int[] list) {
        for (int x : list) {
            if (x == 100) return true;
        }
        return false;
    }
}

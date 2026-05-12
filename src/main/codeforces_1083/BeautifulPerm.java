package codeforces_1083;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulPerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int length = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();

            for(int j=0; j<length; j++) {
                list.add(sc.nextInt());
            }

            List<Integer> result = findOptionalPerm(list);

            for (Integer num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static List<Integer> findOptionalPerm(List<Integer> list) {
        int n = list.size();
        int index = 0;

        for (int i =0 ; i < n; i++) {
            if (list.get(i) == n) {
                int temp = list.get(i);
                list.set(i, list.get(0));
                list.set(0, temp);
            }
        }

        return list;
    }
}


package codeforces_1087;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FlipFlops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            Long c = sc.nextLong();
            Long k = sc.nextLong();

            List<Long> list = new ArrayList<Long>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextLong());
            }

            System.out.println(findMaxPower(c, k, list));
        }

        sc.close();
    }

    public static Long findMaxPower(Long c, Long k, List<Long> list) {
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= c) {
                long dif = Math.min(k, c-list.get(i));
                k -= dif;
                c += list.get(i) + dif;

            }
        }

        return c;
    }
}

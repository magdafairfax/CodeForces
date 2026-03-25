package codeforce_187;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BeautifulNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            String n = sc.next();
            System.out.println(noOfOperations(n));
        }
        sc.close();
    }

    public static int noOfOperations(String n) {
        int count = 0;
        int sumDigits = 0;
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n.length(); i++) {
            int x = n.charAt(i) - '0';
            sumDigits += x;
            a.add(x - (i == 0 ? 1 : 0));
        }

        Collections.sort(a);
        //System.out.println(a);

        while (sumDigits > 9) {
            int last = a.remove(a.size() - 1);
            //System.out.println(a);
            sumDigits -= last;
            count++;
        }

        return count;

    }
}

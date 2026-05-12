package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Asmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int length = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            String s ="";

            for (int j = 0; j < length; j++) {
                list.add(sc.next());
            }

            for (String word : list) {
               if (s.concat(word).compareTo(word.concat(s)) < 0)
                   s = s.concat(word);
               else
                   s = word.concat(s);
            }

            System.out.println(s);
        }
        sc.close();
    }
}

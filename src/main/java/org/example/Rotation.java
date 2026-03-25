package org.example;

import java.util.Scanner;

public class Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(findMaxBloks(s));

        }

        sc.close();
    }

    public static int findMaxBloks(String s) {
        int countBlocks = 1;


        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                countBlocks++;
            }
        }

        if (countBlocks == s.length()) return countBlocks;
        if (s.charAt(0) != s.charAt(s.length() - 1 )) {
            //System.out.println("DEBUG: " + s.charAt(0) + " " + s.charAt(s.length() - 1) + " " + countBlocks);
            return countBlocks+1;
        }


        return countBlocks;
    }

}

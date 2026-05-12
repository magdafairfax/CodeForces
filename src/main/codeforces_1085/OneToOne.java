package codeforces_1085;

import java.util.Scanner;

public class OneToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(calculateMinNumberOfOnes(s, n) + " " + calculateMaxNumberOfOnes(s));
        }
        sc.close();
    }

    public static int calculateMinNumberOfOnes(String s, int n) {

        for(int i=1; i < s.length()-1 ; i++) {
            if(s.charAt(i-1) == '1' && s.charAt(i+1) == '1') {
                s = s.substring(0, i) + "1" + s.substring(i+1);
            }
        }
        for(int i=1; i < s.length()-1 ; i++) {
            if(s.charAt(i-1) == '1' && s.charAt(i+1) == '1') {
                s = s.substring(0, i) + "0" + s.substring(i+1);
            }
        }

        return s.chars().map(Character::getNumericValue).sum();
    }

    public static int calculateMaxNumberOfOnes(String s) {
        for(int i=1; i < s.length()-1 ; i++) {
            if(s.charAt(i-1) == '1' && s.charAt(i) == '0' && s.charAt(i+1) == '1') {
                s = s.substring(0, i) + "1" + s.substring(i+1);
            }
        }

        return s.chars().map(Character::getNumericValue).sum();
    }
}

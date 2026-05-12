package codeforces_1084;

import java.util.Scanner;
import java.util.Stack;

public class SpecialityString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n= sc.nextInt();
            String s = sc.next();

            if (isSpecialityString(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        sc.close();
    }

    public static boolean isSpecialityString(String s) {
       Stack<Character> stack = new Stack<>();

         for (int i = 0; i < s.length(); i++) {
              char ch = s.charAt(i);

              if (stack.isEmpty()) {
                stack.push(ch);
              }
              else if (stack.peek() == ch) {
                stack.pop();
              }
              else {
                stack.push(ch);
              }
         }
         if (stack.isEmpty()) {
             return true;
         }
         else {
             return false;
         }
    }
}

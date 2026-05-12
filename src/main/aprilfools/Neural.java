package aprilfools;

import java.util.Scanner;

public class Neural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1 -> System.out.println("Walk");
            case 2 -> System.out.println("NO");
            case 3 -> System.out.println("NO");
            case 4 -> System.out.println("YES");
            case 5 -> System.out.println("YES");
            case 6 -> System.out.println("Yes");
            case 7 -> System.out.println("sdrawkcab");
            case 8 -> System.out.println("7");

            default -> System.out.println("Invalid input");
        }

        sc.close();
    }
}

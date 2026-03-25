package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int length = sc.nextInt();
            ArrayList<Integer> play = new ArrayList<>();

            for (int j = 0; j < length; j++) {
                play.add(sc.nextInt());
            }

            System.out.println(winner(play));
        }
        sc.close();
    }

    static String winner(ArrayList<Integer> play) {

        if (play.stream().reduce(0, Integer::sum) == 0) return "Bob";
        if (play.stream().reduce(0, Integer::sum) == play.size()) return "Alice";
        if (play.get(0) == 0 && play.get(play.size() - 1) == 0 ) return "Bob";
        else return "Alice";
    }
}

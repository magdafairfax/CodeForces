package codeforces_1087;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ghous {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            int count = 0;
            for (int j =0; j < list.size(); j++){
                if ( list.get(j) != j+1) {
                    count++;
                }
            }

            System.out.println(count);


        }
        sc.close();
    }
}

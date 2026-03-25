package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Offshores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }

            System.out.println(transfer(arr1, x, y));
        }
        sc.close();
    }

    public static int transfer(ArrayList<Integer> arr, int x, int y) {
        int deposit = 0;
        List<Integer> result =  new ArrayList<>();

        int sum = arr.stream().mapToInt(el -> el/x).sum();

        //System.out.println("Sum " + sum);

        for (int i = 0; i < arr.size(); i++) {
            result.add(sum - arr.get(i)/x);
        }
        int max =  Collections.max(result);


        int index = result.indexOf(max);
        //System.out.println(result);


        deposit +=  arr.get(index);
        for ( int i=0; i < arr.size(); i++)
        {
            if (i != index) {
                deposit += arr.get(i)/x *y;
            }
        }


        return deposit;

    }
}

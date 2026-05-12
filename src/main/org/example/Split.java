package org.example;

import java.util.*;

public class Split {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
                arr1.add(sc.nextInt());
            }

            Collections.sort(arr1);
            System.out.println(findMaximum(arr1, n));
        }

        sc.close();
    }

    public static int findMaximum(ArrayList<Integer> arr1, int n) {

        //System.out.println(arr1.toString());
        int x =0, y=0, z= 0;
        int result =0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.size(); i++) {
            int val = arr1.get(i);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for ( Integer value : map.values()) {
           if (value%2 == 1) x++;
           else {
               if (value % 4 != 0) y++;
               else z++;
           }

        }

        result = x+2*y+2*z;
        if (z ==1 && x==0)  result -=2;
        return result;
    }
}

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int noOfTest = sc.nextInt();
        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr1.add(sc.nextInt());
            }

            System.out.println();
            ArrayList<Integer> arr2 = reverse(arr1);
            for (int j = 0; j < arr2.size(); j++) {
                System.out.print(arr2.get(j) + " ");
            }
        }

        sc.close();
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr1) {
        int ind = 0;
        int n =  arr1.size();
        ArrayList<Integer> ans = new ArrayList<>();

        while( ind < n &&  arr1.get(ind) == n - ind)
            ind ++;
        int id = -1;

        for( int i = ind; i < n; i ++ )
        {
            if( arr1.get(i)== n - ind ) id = i;
        }

        for( int i = 0; i < ind; i ++ )  ans.add(arr1.get(i));

        if( id != -1 )
        {
            for( int i = id; i >= ind; i -- ) ans.add(arr1.get(i));;
            for( int i = id+1 ; i < n; i ++ ) ans.add(arr1.get(i));;
        }

        return ans;
    }
}

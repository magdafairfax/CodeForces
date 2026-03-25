package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Heapify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }

            if (canBeHeapified(list))
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }

    public static boolean canBeHeapified(ArrayList<Integer> list) {
        int pivot =list.size()/2+1;

        if (list.size() <= 2) {
            return true;
        }

        List<Integer> heap = new ArrayList<>();
        heap.add(0);

        for (int i = 0; i < list.size(); i++) {
            heap.add(list.get(i));
        }

        List<Integer> sorted= heap.stream().sorted().collect(Collectors.toList());


        for (int i = 1 ; i < heap.size(); i++) {
            for(int j=1; j <heap.size(); j*=2) {
                for(int k=i*2; k < heap.size(); k*=2) {

                    if(heap.get(k/2) > heap.get(k) ){
                        int temp = heap.get(k);
                        heap.set(k, heap.get(k / 2));
                        heap.set(k / 2, temp);
                    }
                }


            }
        }

        //System.out.println("List" + list);
        //System.out.println("Sorted: " + sorted);

        return (heap.equals(sorted));

    }
}

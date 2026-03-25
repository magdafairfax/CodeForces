package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Flipping {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int noOfTest = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < noOfTest; i++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());;
            String s = bufferedReader.readLine().trim();
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') {
                    list.add(1);
                }
                else list.add(0);
            }

            List<Integer> result = findFlips(list);

            if (result == null ) {
                System.out.println(-1);
            } else if (result.size() == 0) {
                System.out.println(0);
            } else {
                System.out.println(result.size());
                for (Integer integer : result) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }

        }
    }

    public static List<Integer>  findFlips(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        if(list.stream().allMatch(i -> i == 0)) {
            return result;
        }

        int index = 0;

        if (Collections.frequency(list, 1) % 2 == 1 && list.size() % 2 ==1) {
            return null;
        }

        if  (Collections.frequency(list, 0) % 2 == 1 ) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {
                    result.add(i + 1);
                }
            }
        } else if (Collections.frequency(list, 1) % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 1) {
                    result.add(i + 1);
                }
            }
        }

        return result;
    }
}

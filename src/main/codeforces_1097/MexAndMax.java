package codeforces_1097;

import java.util.*;

public class MexAndMax {
    static Map<Integer, Integer> mp = new HashMap<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

            int[] list = new int[n];
            for (int j = 0; j < list.length; j++) {
                list[j] = sc.nextInt();
            }

            System.out.println(findOptimalMexMax(list,n));
        }
        sc.close();
    }



    public static Long findOptimalMexMax(int[] a, int n) {
        Arrays.sort(a, 0, n );

        // swap(a[1], a[n])
        int temp = a[0];
        a[0] = a[n-1];
        a[n-1] = temp;

        Arrays.sort(a, 1, n );

        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();


        for (int i = 1; i < n; i++) {
            if (!v1.isEmpty() && v1.get(v1.size() - 1) == a[i]) {
                v2.add(a[i]);
            } else {
                v1.add(a[i]);
            }
        }

        int t = 0;

        for (int x : v1) {
            a[++t] = x;
        }

        for (int x : v2) {
            a[++t] = x;
        }

        long ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        int nw = 0;
        int mx = 0;

        for (int i = 0; i < n; i++) {
            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);

            mx = Math.max(mx, a[i]);

            while (mp.getOrDefault(nw, 0) > 0) {
                nw++;
            }

            ans += (long) mx + nw;
        }

        return ans;

    }

}

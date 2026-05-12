package spectral;

import java.util.*;

public class MedianPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();

           int[] list = new int[n];
            for (int j = 0; j < n; j++) {
                list[j] = sc.nextInt();
            }

            System.out.println(findMaxMedianPartitions(list, n));

        }
        sc.close();
    }

    public static int findMaxMedianPartitions(int[] list, int n) {

        // Step 1: find median of whole array
        int[] sortedList = list.clone();
        Arrays.sort(sortedList);
        int m = sortedList[n / 2];

        // Step 2: transform array
        int[] pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int val = (list[i] > m ? 1 : (list[i] < m ? -1 : 0));
            pref[i + 1] = pref[i] + val;
        }

        // Step 3: greedy splitting
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int res = 0;
        int lastCut = 0;

        for (int i = 1; i <= n; i++) {
            int len = i - lastCut;
            // only consider odd length
            if (len % 2 == 1) {
                if (count.getOrDefault(pref[i], 0) > 0) {
                    res++;
                    count.clear();
                    count.put(0, 1);
                    lastCut = i;
                    continue;
                }
            }

            count.put(pref[i], count.getOrDefault(pref[i], 0) + 1);
        }

        return res;
    }
}

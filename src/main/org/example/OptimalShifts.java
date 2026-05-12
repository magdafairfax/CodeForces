package org.example;

    import java.util.Scanner;

    public class OptimalShifts {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int noOfTest = sc.nextInt();
            for (int i = 0; i < noOfTest; i++) {
                int n = sc.nextInt();
                String s = sc.next();

                System.out.println(findMaximumZeros(s+s));
            }

            sc.close();
        }

    public static int findMaximumZeros(String s) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '1'){
                curr = 0;
            }
            else curr++;
           max = Math.max(max, curr);
        }

        return max;
    }

    public static int findPrice(String s, int count) {

        String shiftString = shift(s, s.indexOf("1")+1);
        String resultString = "";
        if (!s.contains("0"))
            return count;
        count += s.indexOf("1")+1;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '1'){
                resultString += '1';
            }
            else resultString += shiftString.charAt(i);

        }
        System.out.println(resultString);
        if (resultString.contains("0")) {
            return findPrice(resultString, count);
        }
        else
            return count;

    }

    public static String shift(String s, int index) {
        if (index == s.length()) return s.substring(s.length()-2, s.length()-1)+s.substring(0,s.length()-1);
        return s.substring(index, s.length()) + s.substring(0,index);
    }
}

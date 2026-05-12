package codeforces_188;

public class Ball {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(s.indexOf("L")+1);

        }
        sc.close();
    }
}

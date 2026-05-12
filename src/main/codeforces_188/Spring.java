package codeforces_188;

public class Spring {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int noOfTest = sc.nextInt();

        for (int i = 0; i < noOfTest; i++) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long m = sc.nextLong();

            int[] list = findWater(a,b,c,m);

            System.out.println(list[0] + " " + list[1] + " " + list[2]);


        }
        sc.close();
    }

    public static int [] findWater(long a,long b,long c,long m){
        int[] array = new int[3];

        long prod_abc = a*b*c;
        long prod_ab = a*b;
        long prod_bc = b*c;
        long prod_ac = a*c;

        int count_abc = (int) (m/prod_abc);
        int count_ab = (int)(m/prod_ab);
        int  count_ac =(int) (m/prod_ac);
        int count_bc = (int)(m/prod_bc);

        array[0] = count_abc*2 + (count_ab-count_abc-count_ac)*3 +(count_ac-count_abc-count_ab)*3 + ((int)(m/a) -count_abc - count_ab -count_ac)*6;
        array[1] = count_abc*2 + count_bc*3 + ((int)(m/a) -count_abc - count_bc -count_ab)*6;

        array[2] = count_abc*2 + (count_ac)*3 + ((int)(m/a) -count_abc - count_ac -count_bc)*6;




//        int min =array[0];
//        if (array[1]<min)
//            min = array[1];
//        if (array[2]<min)
//            min = array[2];
//        for (int i = min; i <= m; i++) {
//            if (i%a ==0 && i%b ==0 & i%c ==0 &&
//            i/a >=1 && i/b>=1 & i/c >=1) {
//                array[0] += 2;
//                array[1] += 2;
//                array[2] += 2;
//            } else  if (i%a ==0 && i%b ==0  && i/a >=1 && i/b>=1 ) {
//                array[0] += 3;
//                array[1] += 3;
//
//            }else  if (i%a ==0 && i%c ==0 && i/a >=1 && i/c>=1 ) {
//                array[0] += 3;
//                array[2] += 3;
//
//            }else  if (i%b ==0 && i%c ==0 ) {
//                array[1] += 3;
//                array[2] += 3;
//
//            } else if(i%a ==0 && i/a >=1) {
//                array[0] += 6;
//
//            }else if(i%b ==0 && i/b >=1) {
//                array[1] += 6;
//
//            }else if(i%c == 0 && i/c >=1) {
//                array[2] += 6;
//
//            }
//        }

        return array;
    }
}

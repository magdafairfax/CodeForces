package org.example;

    import java.util.*;;

    public class PermutationTransform {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int noOfTest = sc.nextInt();
            for (int i = 0; i < noOfTest; i++) {
                int n = sc.nextInt();

                ArrayList<Integer> arr1 = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    arr1.add(sc.nextInt());
                }
                ArrayList<Integer> arr2 = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    arr2.add(sc.nextInt());
                }
                if(generatePermutation(arr1,arr2)){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
            sc.close();
        }


        public static boolean generatePermutation(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
            if(arr2.size() == 0){
                return false;
            }

            List<Integer> distinct = new ArrayList<>();
            distinct.add(arr2.get(0));
            int prev = 0;
            for(int i = 1; i < arr2.size(); i++){
                if(arr2.get(i-1) != arr2.get(i)){
                    distinct.add(arr2.get(i));
                }
            }

            if (distinct.isEmpty() )
                return false;

            for ( int el : distinct ) {
                int index = arr1.indexOf(el);
                if (index < prev)
                    return false;
                prev = index;
            }
            return true;
        }
    }

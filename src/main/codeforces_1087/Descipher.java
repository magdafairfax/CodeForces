package codeforces_1087;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Descipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;

        Pattern patternV = Pattern.compile("[bcdfghjklmnpqrstvwxz]+[aeiouy]+[bcdfghjklmnpqrstvwxz]+");
        Matcher matcherV = patternV.matcher(s);

        Pattern patternC = Pattern.compile("[bcdfghjklmnpqrstvwxz]+");
        Matcher matcherC = patternC.matcher(s);

       //System.out.println("Vowel groups found:");
        while (matcherV.find()) {
            count ++;
            //System.out.println(matcherV.group()); // Prints consecutive vowels
        }

//        System.out.println("Consonants groups found:");
//        while (matcherC.find()) {
//            System.out.println(matcherC.group()); // Prints consecutive vowels
//        }

        System.out.println(count);
    }

}

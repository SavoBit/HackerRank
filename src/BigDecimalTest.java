/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.hackerrank;
import java.math.BigDecimal;
import java.util.*;
/**
 *
 * @author lee
 */

class BigDecimalTest {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (Float.valueOf(s[i]) < Float.valueOf(s[i + 1])) {
                    String temp = "";
                    temp = s[i + 1];
                    s[i + 1] = s[i];
                    s[i] = temp;

                    swapped = true;
                } else if (Objects.equals(Float.valueOf(s[i]), Float.valueOf(s[i + 1]))) {

                }
            }
        } while (swapped);

        // or 
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                BigDecimal bd1 = new BigDecimal(str1);
                BigDecimal bd2 = new BigDecimal(str2);
                return bd1.compareTo(bd2);
            }
        }));
//        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
//            @Override
//            public int compare(String a1, String a2) {
//                //convert to big decimal inside comparator
//                //so permanent string values are never changed
//                //aka you only use the BigDecimalTest values to 
//                //compare the strings!
//                BigDecimal a = new BigDecimal(a1);
//                BigDecimal b = new BigDecimal(a2);
//                return a.compareTo(b);
//            }
//        }));
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}

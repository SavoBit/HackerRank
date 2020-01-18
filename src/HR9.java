/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lee
 */
public class HR9 {
    
     public static String getSmallestAndLargest2(String s, int k) {
        String smallest = "";
        String largest = "";
        int m = k-1;
        String[] strArr = new String[s.length()-m];
        
        for(int i=0; i<s.length()-m;i++) {
            strArr[i] = s.substring(i, k);
            k++;
        }
        //System.out.println(Arrays.toString(strArr));
        //Arrays.sort(strArr);
        //System.out.println(Arrays.toString(strArr));
        smallest = strArr[0];
        largest = strArr[s.length()-k];
        
        return smallest + "\n" + largest;
    }
     
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int m = k-1;
        String[] strArr = new String[s.length()-m];
        
        //build the array
        for(int i=0; i<s.length()-m;i++) {
        
            strArr[i] = s.substring(i,k);
            //System.out.println(s.substring(i,k));
            k++;
        }
        
        smallest = strArr[0];
        for (int i=1; i<s.length()-m;i++) {
            if (strArr[i].compareTo(smallest) < 0) {
                smallest = strArr[i];
            }
        }
        
        largest = strArr[0];
        for (int i=1; i<s.length()-m;i++) {
            if (strArr[i].compareTo(largest) > 0) {
                largest = strArr[i];
            }
        }
        
        
        return smallest + "\n" + largest;
    } 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        System.out.println(getSmallestAndLargest(s,k));
    }
    
}

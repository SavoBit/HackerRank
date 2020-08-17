/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author lee
 */
public class subArray {
    
    private static int sumArray(int[] arr) {
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] array = new int[len];
        for(int i = 0; i < len; i++) {
            array[i] = scan.nextInt();
        }

        for(int i = 0; i < len; i++) {
            for(int j = i+1; j <= len; j++){
                int[] copy = Arrays.copyOfRange(array, i, j);
                if(sumArray(copy) < 0 ) {
                    count++;
                }
                
            }
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
}

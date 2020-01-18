/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author lee
 */
public class TwoDArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        //int len = scanner.nextInt()
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
        
        System.out.println(sumHourGlass(arr));

    }

    private static int sumHourGlass(int[][] arr) {
        int total = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = 0; j < arr.length-2; j++) {
                int row1 = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int row2 = arr[i+1][j+1];
                int row3 = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
            
                total = row1 + row2 + row3;
                if(total > max) {
                    max = total;
                }
            }
        }
        return max;
    }

}

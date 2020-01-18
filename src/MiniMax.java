/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lee
 */
public class MiniMax {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        long sum = 0;

        for (int idx = 0; idx < arr.length; idx++) {
            
            for (int i = idx+1; i < arr.length; i++) {
                sum = sum + arr[i];
            }

            for (int j = idx-1; j >= 0; j--) {
                sum = sum + arr[j];
            }
            
            if (sum > max & sum < min) {
                max = sum;
                min = sum;
                sum = 0;
            }
            else if (sum > max & sum > min) {
                max = sum;
                sum = 0;
            }
            else if(sum < max & sum < min) {
                min = sum;
                sum = 0;
            }
            else {
                sum = 0;
            }
            
        }
        
        System.out.println(min + " " + max);
        

        //int[] newArr = Arrays.copyOf(arr, arr.length);
        //int newArr2[] = new int[arr.length];
        //System.arraycopy(arr, 0, newArr2, 0, arr.length);
        //System.out.println(Arrays.toString(newArr2));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}

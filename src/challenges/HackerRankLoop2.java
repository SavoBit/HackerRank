/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

/**
 *
 * @author Lee
 */
import java.util.*;
import java.io.*;
import java.lang.Math;

public class HackerRankLoop2{
    public static void main(String []argh){
        //Scanner in = new Scanner(System.in);
        int t=2;//in.nextInt();
        for(int i=0;i<t;i++){
            int a = 0;//in.nextInt();
            int b = 2;//in.nextInt();
            int n = 10;//in.nextInt();
        
        int res = a;
        for(int j=0; j<n-1;j++) {
            res = res + (int)Math.pow(2,j)*b;
            System.out.print(res + " ");
        }
        System.out.println();

        }
        //in.close();
    }
}
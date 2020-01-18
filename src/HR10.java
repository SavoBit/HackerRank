/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Lee
 */
public class HR10 {
    
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    /* Enter your code here. Print output to STDOUT. */
    
    String[] tokens = s.trim().split("[ .,?!'@_]+");
    
    if (tokens == null  || tokens.length == 0){
            //|| ( tokens[0].length() == 0 && tokens.length == 1)) {
        System.out.println("0");
    }
    else if(tokens.length>400000) {
        return;
    }
    else {
        System.out.println(tokens.length);
    }
    for(String str: tokens) {
        System.out.println(str);
    }
    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
/**
 *
 * @author ljephson
 */
public class Hr2 {
 
    static int B,H;
        static boolean flag = false;

        static {
            Scanner readin = new Scanner(System.in);
            B = readin.nextInt();
            readin.nextLine();
            H = readin.nextInt();
            
            if (B<=0 || H<=0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else
                flag = true;
        }


    public static void main(String[] args) {
    
        if(flag) {
            int area=B*H;
            System.out.print(area);
        }
            
            
    }
}
    


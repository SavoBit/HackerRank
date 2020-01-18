/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lee
 */
public class HR8 {
    
    public static void main(String[] args) {
        
        try {
            HR8 myhr8 = new HR8();
            Scanner sin = new Scanner(System.in);
            int x = sin.nextInt();
            int y = sin.nextInt();
        
            if(y==0) {
                throw new ArithmeticException("/ by zero");
            }
            System.out.println(myhr8.myCalc(x, y));
        
        } catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch(Exception e) {
            System.out.println(e);
        }
       
    }

     public int myCalc(int a, int b) {
            return a/b;
        }
}
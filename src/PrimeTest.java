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
public class PrimeTest {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static String prime(String str) {
        String ans = "";
        BigInteger bigInt = new BigInteger(str);
        
        if(bigInt.isProbablePrime(1)) {
            ans = "Prime";
        }
        else ans = "Not Prime";
        
      return ans;
    }
    
    
    public static void main(String[] args) {
        String n = scanner.nextLine();
        
        if(n.length() < 101) {
            System.out.println(prime(n));
            
        }
        else 
            System.out.println("too long!");
        scanner.close();
    }
    
}

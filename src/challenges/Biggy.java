package challenges;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lee
 */
public class Biggy {
            
// Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        BigInteger biggy = BigInteger.valueOf(1);
        for(int i = n; i > 0; i--) {
            biggy = biggy.multiply(BigInteger.valueOf(i));
        }
        System.out.println(biggy);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
    
}

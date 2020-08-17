/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.Scanner;

/**
 *
 * @author Lee
 */

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalc implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
        int j = 0;
        for(int i=n;i>0;i--) {
            if((n%i) == 0) {
                j += i;
            }
            else
                i=i;
              
        }
    return j;
    }
    
}

public class Hr4 {
    
    public static void main(String []args){
        MyCalc my_calculator = new MyCalc();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
    
}

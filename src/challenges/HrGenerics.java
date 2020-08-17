/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;
import java.io.*;
import java.lang.reflect.Method;
/**
 *
 * @author Lee
 */
public class HrGenerics {
    
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!"); 
    }
}
 class Printer {
        
        public <E> void printArray(E[] inputArray) {
            
            for (E element : inputArray) {
                System.out.printf("%s", element);
                System.out.println();
            }
            
        }
    }

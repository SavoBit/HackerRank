/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.*;

/**
 *
 * @author Lee
 */
public class HrMap {
    
    public static void main(String[] args) {
        
        Map<String, Integer> phoneBook = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0; i<n;i++) {
            String name = in.nextLine().trim();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s = in.nextLine().trim();
            
            if(!phoneBook.containsKey(s)) {
                System.out.println("Not found");
                
            }
            else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            
        }
        //System.out.println(phoneBook.toString());
    }
    
}

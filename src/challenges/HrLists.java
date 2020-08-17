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
public class HrLists {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<Integer> l = new ArrayList<Integer>(size);
        
        for (int i = 0; i < size; i++) {
            l.add(scanner.nextInt());
        }
        
        int queries = scanner.nextInt();
        
        for (int j = 0; j < queries; j++) {
            String cmd = scanner.next();
            if(cmd.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
             
                l.add(x, y);
            }
            else {
                l.remove(scanner.nextInt());
            }
        }
        System.out.println(l.toString().replaceAll("[\\[\\],]", ""));
        
        
    }
    
}

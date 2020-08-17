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
public class HrHashset {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet hs = new HashSet();
        int lines = t;
        
        for (int i = 0; i < lines; i++) {
            String str = pair_left[i] + " " + pair_right[i];
            if(!str.equals("")) {
                hs.add(str);
                System.out.println(hs.size());
            }
            
        }
        
        //System.out.println(hs.toString());
    }
    
}

package challenges;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author Lee
 */
public class HrArrayList {
    
   ArrayList<ArrayList> mighty = new ArrayList<ArrayList>();
   ArrayList<ArrayList> smally = new ArrayList<ArrayList>();
    
    public static void main(String[] args) {
        
        HrArrayList t = new HrArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input: ");
        
        // read in number of lines
        int numLines = in.nextInt();
        
        // for every line read in line to arraylist
        for (int i = 0; i < numLines; i++) {
            // read in number to get number of elements in array
            int numElem = in.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>(numElem);
            
            for (int j = 0; j < numElem; j++) {
                al.add(in.nextInt());
            }
            t.mighty.add(al);
        }
        //System.out.println(t.mighty.toString());
        
        // read in number of queries
        int queries = in.nextInt();
         for (int k = 0; k < queries; k++) {
             
             ArrayList<Integer> alt = new ArrayList<Integer>();
             alt.add(in.nextInt());
             alt.add(in.nextInt());             
             t.smally.add(alt);
        }
        for (ArrayList<Integer> r : t.smally) {

            int x = r.get(0);
            int y = r.get(1);
            
            try {
                for(int i = 0; i < t.mighty.size(); i++) {
                if (x-1 == i) {
                    System.out.println(t.mighty.get(i).get(y-1));  
                }
            }
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

//            System.out.println(r.get(0));
//            System.out.println(r);
   
        } 
 
    }
}

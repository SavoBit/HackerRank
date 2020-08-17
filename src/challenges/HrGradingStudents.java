/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.*;
import java.math.*;

/**
 *
 * @author Lee
 */

class Res {
        
        public static List<Integer> gradingStudents(List<Integer> grades) {
            for(Integer g : grades) {
                if (g > 37) {
                    // find next multiple of 5
                    int i = (int) (Math.ceil(g/5.0) * 5);
                    
                    if (i - g < 3) {
                        int k = grades.indexOf(g);

                        grades.set(k, i);
                    }
                }
            }
         return grades;
        }
    }

public class HrGradingStudents {

    public static void main(String[] args) {
       

        List<Integer> grades = new ArrayList<Integer>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);        

        List<Integer> result = Res.gradingStudents(grades);
        System.out.println(result.toString());

       
    }

}

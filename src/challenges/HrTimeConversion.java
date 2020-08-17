/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author Lee
 */
public class HrTimeConversion {
    
    static String timeConversion(String s) {
        
        String p = s.substring(s.length() - 2, s.length());
        if(p.equals("PM") & s.substring(0, 2).equals("12")) {
            // drop the PM
            return s.substring(0,s.length()-2);
        }
        else if(p.equals("PM") & !s.substring(0,2).equals("12")) {
            // add 12 to hours
            int i = Integer.parseInt(s.substring(0, 2));
            int j = i + 12;
            String str = s.substring(0, 2);
                        
            str = Integer.toString(j);
            // System.out.println(str + s.substring(2, s.length()-2));
            return str + s.substring(2, s.length()-2);
        }
        //s.indexOf(s,s.length() - 2);
        else if(p.equals("AM") & s.substring(0, 2).equals("12")) {
            String str = s.substring(0,2);
            str = "00";
            return str + s.substring(2, s.length()-2);
            
        }
        return s.substring(0, s.length()-2);
    }
   
    
    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        String s = "12:45:54PM";
        String result = timeConversion(s);
        System.out.println(result);
        
        DateFormat in = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat out = new SimpleDateFormat("HH:mm:ss");
        
        Date date = null;
        try{
            date = in.parse(s);
        } catch (ParseException e) {
            System.out.println("msg: " + e);
        }
        
        if(date != null) {
            String myDate = out.format(date);
            System.out.println(myDate);
        }
        
    }
    
}

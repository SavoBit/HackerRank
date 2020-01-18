/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Lee
 */

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        Calendar myCal = new GregorianCalendar();
        myCal.set(year, month-1, day);
        String dow = "";
        
        switch(myCal.get(Calendar.DAY_OF_WEEK)) {
            case 1 :
                dow = "Sunday";
                break;
            case 2 :
                dow = "Monday";
                break;
            case 3 :
                dow = "Tuesday";
                break;
            case 4 :
                dow = "Wednesday";
                break;
            case 5 :
                dow = "Thursday";
                break;
            case 6 :
                dow = "Friday";
                break;
            case 7 :
                dow = "Saturday";
                break;    
        }
                
        return dow.toUpperCase();
               
    }

}

public class HR6 {
    public static void main(String[] args) throws IOException {
        

        int month = 8;

        int day = 5;

        int year = 2015;

        String res = Result.findDay(month, day, year);
        
        System.out.println(res);

        
    }
    
}

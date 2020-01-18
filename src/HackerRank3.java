/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;


import java.util.*;

/**
 *
 * @author Lee
 */
abstract class Book {
        
        String title;
        
        abstract void setTitle(String s);
        
        String getTitle() {
            return title;
        }
    }

class MyBook extends Book {
        String title;
        void setTitle(String s) {
            this.title = s;
        }
        
        String getTitle() {
            return "This is the title: " + title;
        }
        
    }

public class HackerRank3 {
    
    public static void main(String[] args) {
        MyBook mb = new MyBook();
        mb.setTitle("captain planet");
        
        System.out.println(mb.getTitle());
    }
    
}

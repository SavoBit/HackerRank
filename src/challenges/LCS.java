/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenges;

import java.util.Arrays;

/**
 *
 * @author Lee
 */
public class LCS {
    
    static void lcsLengthInt(int[] a, int[] b) {
        
        int newArr1[] = new int[a.length+1];
        newArr1[0] = '\u01d0';
        for(int i=1; i<a.length+1;i++) {
            newArr1[i] = a[i-1];
        }
        
        int newArr2[] = new int[b.length+1];
        newArr2[0] = '\u01d0';
        for(int i=1; i<b.length+1;i++) {
            newArr2[i] = b[i-1];
        }
       
        //rows
        int m = newArr1.length;
        //cols
        int n = newArr2.length;
        
        char matrix1[][] = new char[m][n];
        int  matrix2[][] = new int[m][n];
    
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                
                if(newArr1[i] == newArr2[j]) {
                    //System.out.println(newArr2[j]);
                    matrix2[i][j] = matrix2[i-1][j-1] + 1;
                    // diagonal arrow
                    matrix1[i][j] = '\u2196'; 
                }
                else if(matrix2[i-1][j]>=matrix2[i][j-1]){
                    matrix2[i][j] = matrix2[i-1][j];
                    // up arrow
                    matrix1[i][j] = '\u2191';
                }
                else {
                    matrix2[i][j] = matrix2[i][j-1];
                    //left arrow
                    matrix1[i][j] = '\u2190';
                }
            }
        }
         
        printLCSInt(matrix1,newArr1,m-1,n-1);
    }
    
    static void printLCSInt(char[][] b, int[] a, int i, int j) {
        
        int str = 0;
        
        if (i==0 | j ==0) {
            return;
        }
        
        else if(b[i][j] == '\u2196') {
            printLCSInt(b, a, i-1, j-1);
            System.out.print(a[i]+" ");
        }
        else if(b[i][j] == '\u2191' ) {
            printLCSInt(b,a,i-1,j);
        }
        else {
            printLCSInt(b,a,i,j-1);
        }
    }
    
    public static void main(String[] args) {
        
//             
        int arri1[] = {1,2,3,4,1};
        int arri2[] = {3,4,1,2,1,3};
        
        lcsLengthInt(arri1, arri2);
        System.out.println();

    }
    
}

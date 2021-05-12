/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray5;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Inue
 */
public class LatihanArray5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A[] =
        {"Hafizh@indo.id",
         "Atta@yahoo.com",
         "Ayana@hotmail.com"};
        
        //sort array (ascending)
        Arrays.sort(A);
        System.out.printf("Modified arrays[]    : \n%s\n\n",
                Arrays.toString(A));
        
        //sort array (descending)
        Arrays.sort(A, Collections.reverseOrder()); // Pengurutan Alfabet,angka,dll
        
        System.out.printf("Modified arr[]  : \n%s\n\n",
                Arrays.toString(A));
    }
    
}

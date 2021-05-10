/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray4;

import java.util.Arrays;

/**
 *
 * @author Inue
 */
public class LatihanArray4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] A = {19, 20, 22, 15, 2, 17, 6};
        
        Arrays.sort(A);
        System.out.printf("Modified Arrays[]   : %s", Arrays.toString(A));
    }
    
}

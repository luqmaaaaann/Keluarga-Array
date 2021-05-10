/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray7a;

import java.util.Arrays;

/**
 *
 * @author Inue
 */
public class LatihanArray7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a1[] = {1, 2, 3};
        int a2[] = {1, 2, 3};
        if (Arrays.equals(a1, a2))
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray7c;
import java.util.Arrays;
/**
 *
 * @author Inue
 */
public class LatihanArray7c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inarr1 and inarr2 have same values
        int inarr1[] = {1, 2, 3};
        int inarr2[] = {1, 2, 3};
        Object[] arr1 = {inarr1}; //arr1 contains only one element
        Object[] arr2 = {inarr1}; //arr2 also contains only one element
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
    
}

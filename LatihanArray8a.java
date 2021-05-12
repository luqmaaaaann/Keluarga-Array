/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray8a;

/**
 *
 * @author Inue
 */
public class LatihanArray8a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {3, 34, 5, 91, 100}; //an Array not containing dplicate //penyimpanan array 5
        int target = 91; //the element to be searced
        for (int i = 0; i < a.length; i++){ // harus kurang dari krn array mulai dari 0. a.length berfungsi sebagai total penyimpanan array.
            if (a [i] == target){ // i mewakili index
                System.out.println("Element found at index " + i); 
                break; //break should be omitted if the array contains duplicates // perlu dibreak agar tidak terjadi looping lagi.
            }
        }
    }
    
}

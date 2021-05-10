/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray8b;

/**
 *
 * @author Inue
 */
public class LatihanArray8b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {3, 7, 10, 15, 91, 110, 150};
        int target = 91; //element to be searced
        int left = 0;
        int middle;
        int right = a.length - 1;
        while (left <= right){
            middle = (left + right)/2;
            if (a [middle] == target){
                System.out.println("Element found at index " + middle);
                break;
            }
            else if (a [middle] < target){
                left = middle + 1;
            }
            else if (a [middle] > target){
                right = middle - 1;
            }
        }
    }
    
}

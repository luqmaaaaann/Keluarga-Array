/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray6a;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Inue
 */
public class LatihanArray6a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Sebagai Penggerak utama 
        Student [] arr = {new Student(111, "bbbb", "london"), // array yg menyimpan object. fungsi array object menyimpan data 
        new Student(131, "aaaa", "nyc"),
        new Student(121, "cccc", "jaipur")};
        
        System.out.println("Unsorted");
        for (int i=0; i<arr.length; i++)
                System.out.println(arr[i]);
        
        Arrays.sort(arr, new Sortbyroll());// untuk manggil sortbyroll
        
        System.out.println("\nSorted by rollno");//mengunci angka untuk pengurutan. 
        for (int i=0; i<arr.length; i++)
                System.out.println(arr[i]);
        }
    }
    


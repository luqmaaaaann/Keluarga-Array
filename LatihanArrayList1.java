/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarraylist1;
import java.util.ArrayList;
/**
 *
 * @author Inue
 */
public class LatihanArrayList1 {//Fungsi Array list untuk menghemat penyimpanan array. Array biasa 0-99. ArrayList inputnya sesuai kebutuhan penyimpanan.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ArrayList<Integer> memori = new ArrayList<Integer>();
        System.out.println("Ukuran Sebelum ArrayList : " + memori.size());
        System.out.println("==================");
        System.out.println("Mengisi ArrayList");
        System.out.println("==================");
        for (int i = 0; i < 10; i++){
            memori.add(i);
        }
        System.out.println("=================="); 
        System.out.println("Menampilkan ArrayList");
        System.out.println("==================");
        for (int nilai : memori) {
            System.out.println(nilai);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarraylist2;
import java.util.ArrayList;
/**
 *
 * @author Inue
 */
public class LatihanArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList<Integer> deret = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++){
        deret.add(i*10);
    }
    System.out.println("\nPanjang deret setelah ditambahkan element: "+deret.size());
    System.out.println("\nMemeriksa apakah array list kosong: ");
    System.out.println("\nPanjang deret setelah ditambahkan element: "+deret.size());
    System.out.println(deret.isEmpty());
    System.out.println("\nMencari indeks dari suatu nilai di dalam array list: ");
    System.out.println(deret.indexOf(60));
    System.out.println(deret.indexOf(70));
    System.out.println(deret.indexOf(80));
    System.out.println("\nUpdate suatu nilai di dalam array list: ");
    deret.set(6, 600);
    deret.set(7, 700);
    deret.set(8, 800);
    System.out.println(deret.get(6));
    System.out.println(deret.get(7));
    System.out.println(deret.get(8));
    System.out.println("\nMenghapus suatu nilai di dalam array list: ");
    deret.remove(6);
    System.out.println("\nPanjang deret setelah menghapusbeberapa element: "+deret.size());
    for(int nilai: deret){
        System.out.println(nilai);
    }
    
    }   
}

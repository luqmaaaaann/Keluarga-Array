/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray2;

import java.io.*;

/**
 *
 * @author Inue
 */
public class LatihanArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
       
            System.out.println("Jumlah baris    :");
            int m = Integer.parseInt(br.readLine());
            System.out.println("Jumlah kolom    :");
            int n = Integer.parseInt(br.readLine());
            
            int A [][]= new int [m][n]; //untuk membuat Array 2D 
            
            //memasukkan array 2D
            for(int i = 0; i<m; i++) 
            {
                for(int j = 0; j<n; j++) 
                {
                    System.out.println("Masukkan Elemen :");
                    A[i][j] = Integer.parseInt(br.readLine());
                }
            }
            //cetak array 2D
            
            System.out.println("Array 2D    :");
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<n; j++)
                {
                    System.out.println(A[i][j] + "\t");
                }
                System.out.println();
            }
            //sort 2D array. minusnya klo uda urut tetap ngelooping
            
            int t= 0; //mengunci angka, cari terkecil, baru dituker
            for(int x=0; x<m; x++) { // untuk baris mengunci contoh 
                for(int y=0; y<n; y++) { // untuk kolom mengunci
                    for(int i=0; i<m; i++) { // untuk baris looping perbandingan
                        for(int j=0; j<n; j++) { // untuk kolom looping perbandingan 
                            if(A[i][j]>A[x][y]) { // menanyakan looping perbandingan jika iya maka angka terkecil didepan
                                t = A[x][y];
                                A[x][y]=A[i][j];
                                A[i][j]=t;
                            }
                        }
                    }
                }
            }
            //print sort 2D
            System.out.println("Sort Array      :");
            for(int i=0; i<m; i++)
            {
                for(int j = 0; j<n; j++)
                {
                    System.out.println(A[i][j]+"\t");
                }
                System.out.println();
            }
    }
    
}

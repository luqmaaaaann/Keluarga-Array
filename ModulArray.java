/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularray;
import java.io.*;
/**
 *
 * @author Inue
 */
public class ModulArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
       
            System.out.println("Jumlah baris    :");
            int m = Integer.parseInt(br.readLine());
            System.out.println("Jumlah kolom    :");
            int n = Integer.parseInt(br.readLine());
            
            int A [][]= new int [m][n]; //untuk membuat Array 2D 
            
            //memasukkan array 2D membuat baris dan kolom misalnya baris 2 collom 3
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
            
            //untuk menyimpan 2D ke 1D
            int B[]= new int[m*n]; //untuk membuat size
            int x=0; //untuk mengupdate lemari baru
            for (int i = 0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    B[x]= A[i][j];
                    x++;
                }
            }
            
            //sorting mengurutkan angka terkecil walaupun diacak.
            int t;
            for(int i=0; i<(m*n)-1; i++)
            {
                for(int j= i+1; j<(m*n); j++)
                {
                    if(B[i]> B[j])
                    {
                        t=B[i];
                        B[i]=B[j];
                        B[j]=t;
                    }
                }
            }
            //menyipan sortingan 1D ke 2D
            x = 0;
            for (int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    A[i][j] = B[x];
                    x++;
                }
            }
            //cetak sort dari array 2D
            System.out.println("The Sorted Array    :");
            for (int i=0; i<m; i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.println(A[i][j]+"/t");
                }
                System.out.println();
                }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray2;

/**
 *
 * @author Inue
 */
public class LatihanArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            //sort 2D array
            
            int t= 0;
            for(int x=0; x<m; x++) {
                for(int y=0; y<n; y++) {
                    for(int i=0; i<m; i++) {
                        for(int j=0; j<n; j++) {
                            if(A[i][j]>A[x][y]) {
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

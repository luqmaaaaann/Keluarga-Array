/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray3;

import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
/**
 *
 * @author Inue
 */
public class LatihanArray3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Double[][] doubles = new Double[][] {
                {5.0, 4.0},
                {1.0, 1.0},
                {4.0, 6.0}};
        final Comparator<Double[]> arrayComparator = new Comparator<Double[]>()
        {
            @Override
            public int compare(Double[] o1,Double[] o2){
                return o1[0].compareTo(o2[0]);
            }
            };
        Arrays.sort(doubles, arrayComparator);
        for (final Double[] arr : doubles){
            System.out.println(Arrays.toString(arr));
        }
    }
    
}

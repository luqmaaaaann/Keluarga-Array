/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray6a;
import java.util.Comparator;
/**
 *
 * @author Inue
 */
public class Sortbyroll implements Comparator<Student>
{
    // Used For sorting in ascending order of
    // roll number
    @Override
    public int compare(Student a, Student b){
        
            return a.rollno - b.rollno;
    }
}

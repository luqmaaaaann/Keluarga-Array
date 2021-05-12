/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanarray6a;

/**
 *
 * @author Inue
 */
public class Student { // menyimpan data
  int rollno;
            String name, address;
            
            // Constructor. 
            public Student(int rollno, String name, String address){ // ketika kelas dipanggil maka constructor wajib jalan
                    
                    this.rollno = rollno; //this untuk membedakan rollno agar mudah dibedakan dan diakses data dlm kelas
                    this.name = name;
                    this.address = address;
            }
            
            //used to print student details in main()
    @Override
            public String toString()      
            {
                return this.rollno + " " + this.name + " " + this.address;
                
            }
                    
    }


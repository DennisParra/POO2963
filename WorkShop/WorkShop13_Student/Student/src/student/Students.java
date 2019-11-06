/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author STALIN RIVERA Y JORGE RAMOS
 */



import java.util.Scanner;
import java.io.*;

public class Students {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("Estudiante.csv");
    
    String name, last_name;
    int CI;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Type a name: ");
            name = enter.next();
            System.out.println("Type a last name: ");
            last_name = enter.next();           
            System.out.print("Enter phone of father : ");
            CI = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("number: " + CI);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Type a name: ");
            name = enter.next();
            System.out.print("Type a last name: ");
            last_name = enter.next();            
            System.out.print("Enter phone of father: ");
            CI = enter.nextInt();
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                mostrar.println("number: "+ CI);
               
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
    
}
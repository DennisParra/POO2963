/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.util.Scanner;
import java.io.*;

public class Estudiante {

    
    public static void main(String[] args) {
        
    Scanner enter= new Scanner(System.in);
    
    File estudiante = new File ("C:\\Users\\HP\\Desktop\\Archivo\\Estudiante.csv");
    
    String name, last_name;
    int day_birth, month_birth, year_birth, CI;
        
    if(!estudiante.exists()){
        try {
            estudiante.createNewFile();
            System.out.println("Please, write your name: ");
            name = enter.next();
            System.out.println("Write your last name: ");
            last_name = enter.next();
            System.out.println("Type the day of your birth (number): ");
            day_birth = enter.nextInt();            
            System.out.println("Type the month of your birth (number): ");
            month_birth = enter.nextInt();
            System.out.println("Type the year of your birth (number): ");
            year_birth = enter.nextInt();            
            System.out.println("Enter your ID number: ");
            CI = enter.nextInt();
                            
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
            mostrar = new PrintWriter(escribir);
                mostrar.println("Name: " + name );
                mostrar.println("Last name: " + last_name );
                mostrar.println("Date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: " + CI);
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
               
    }
    else{
        try {
                //arch.createNewFile();
            System.out.print("Please, write your name: ");
            name = enter.next();
            System.out.print("Write your last name: ");
            last_name = enter.next();
            System.out.print("Type the day of your birth (number): ");
            day_birth = enter.nextInt();            
            System.out.print("Type the month of your birth (number): ");
            month_birth = enter.nextInt();
            System.out.print("Type the year of your birth (number): ");
            year_birth = enter.nextInt();            
            System.out.print("Enter your ID number: ");
            CI = enter.nextInt();
           
                
            PrintWriter mostrar;
            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                mostrar = new PrintWriter(escribir);
                mostrar.println("Nombre: "+ name);
                mostrar.println("Last name: "+ last_name);
                 mostrar.println("date of birth: " + day_birth + " / " + month_birth + " / " + year_birth );
                mostrar.println("CI: "+ CI);
               
                mostrar.println("");
            }
            mostrar.close();
        } catch (IOException ex) {
        }
    }
    }
    
}

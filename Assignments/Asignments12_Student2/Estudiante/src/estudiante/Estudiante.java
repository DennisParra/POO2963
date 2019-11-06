/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiante;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author STALIN RIVERA y DENNIS PARRA
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = null, last_name = null;
        int number = 0;
        int suma = 0;
        int prom = 0;
        int nota = 0;
        Scanner read = new Scanner(System.in);
        int opcion;
        Scanner entrada = new Scanner(System.in);
        int notas;

        File estudiante = new File("Estudiante.csv");
        do {

            System.out.println("*********Menu de opciones*******");
            System.out.println("1.- Ingresar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Salir");

            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos");
                    if (!estudiante.exists()) {
                        try {
                            estudiante.createNewFile();
                            System.out.println("Escriba su nombre: ");
                            name = entrada.next();
                            System.out.println("Escriba su apellido: ");
                            last_name = entrada.next();
                            System.out.print("Enter the grade:");
                            notas = entrada.nextInt();

                            for (int i = 1; i <= notas; i++) {
                                System.out.println("ingrese nota" + " " + i + " " + "de" + " " + notas + ":");
                                nota = entrada.nextInt();
                                suma = suma + nota;
                            }
                            prom = suma / notas;
                            System.out.print("Enter number of phone: ");
                            number = entrada.nextInt();

                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + name);
                                mostrar.println("Apellido: " + last_name);
                                mostrar.println("Numero celular: " + number);
                                mostrar.println("Promedio: " + prom);
                                System.out.println("Promedio de las notas:" + prom);
                                mostrar.println("");
                            }
                            mostrar.close();
                        } catch (IOException ex) {
                        }

                    } else {
                        try {
                            //arch.createNewFile();
                            System.out.print("Escriba su nombre: ");
                            name = entrada.next();
                            System.out.print("Escriba su apellido:  ");
                            last_name = entrada.next();
                            System.out.print("Ingrese el numero celular de su representante: ");
                            number = entrada.nextInt();
                            System.out.print("Ingrese nota 1: ");
                            notas = entrada.nextInt();
                            System.out.print("Ingrese nota 2: ");
                            notas = entrada.nextInt();
                            System.out.print("Ingrese nota 3: ");
                            notas = entrada.nextInt();

                            PrintWriter mostrar;
                            try (FileWriter escribir = new FileWriter(estudiante, true)) {
                                mostrar = new PrintWriter(escribir);
                                mostrar.println("Nombre: " + name);
                                mostrar.println("Apellido: " + last_name);
                                mostrar.println("Numero celular: " + number);
                                mostrar.println("Promedio:" + prom);
                                mostrar.println("");
                            }
                            mostrar.close();
                        } catch (IOException ex) {
                        }
                    }

                    break;

                case 2:
                    System.out.println("Muestra de los datos");
                    System.out.println("");
                    System.out.println("Nombre: " + name);
                    System.out.println("Apellido: " + last_name);
                    System.out.println("Numero de celular del representante: " + number);
                    System.out.println("Promedio: " + prom);
                    
                    break;

                default:
                    System.out.println("Gracias por utilizar este programa, hasta pronto!");
                    break;
            }

        } while (opcion != 3);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulator.model;

/**
 *
 * @author HP
 */
public class AntEater {
    String eater = ("hormigas e insectos");
    private Cell position;
    private int antEatenCounter;
    private int runCounter;
    private enum state{
        
    }
    
    public void run(){
        System.out.println("El depredador de la hormiga puede comer: " + eater);
    }
    
}

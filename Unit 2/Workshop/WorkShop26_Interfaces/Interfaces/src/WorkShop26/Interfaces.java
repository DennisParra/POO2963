/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop26;

import ec.edu.espe.controller.Animal;
import ec.edu.espe.controller.Monkey;

/**
 *
 * @author HP
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        
        animal = new Monkey();
        
        System.out.println(animal);
    }
    
}

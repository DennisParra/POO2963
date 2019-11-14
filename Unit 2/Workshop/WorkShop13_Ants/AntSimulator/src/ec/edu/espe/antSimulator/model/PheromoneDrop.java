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
public class PheromoneDrop {

    String pheromone = ("Trabajar, Comer, Construir");
    private int currentLevel;

    public void run() {
        System.out.println("Siguiendo las feromonas, las hormigas pueden "+ pheromone);
    }

}

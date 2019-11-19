/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulator.model;

import java.util.List;

/**
 *
 * @author HP
 */
public class Cell {

    int num = 20;
    private int row;
    private int col;

    /**
     *
     * @param Pheromone
     */
    public void ReceivePheromone(int Pheromone) {
        // TODO - implement Cell.ReceivePheromone
        throw new UnsupportedOperationException();
    }

    public List<Ant> GetAnts() {
        // TODO - implement Cell.GetAnts

        System.out.println("En una celda el numero de hormigas es: " + num);
        return null;
    }
}

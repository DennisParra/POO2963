/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.antSimulator.view;

import ec.edu.espe.antSimulator.model.AntEater;
import ec.edu.espe.antSimulator.model.Cell;
import ec.edu.espe.antSimulator.model.Colony;
import ec.edu.espe.antSimulator.model.PheromoneDrop;

/**
 *
 * @author HP
 */
public class AntSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cell a = new Cell();
        Colony b = new Colony();
        PheromoneDrop c = new PheromoneDrop();
        AntEater d = new AntEater();
        a.GetAnts();
        b.Run();
        c.run();
        d.run();

    }

}

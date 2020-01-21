/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view.singleton;

import ec.edu.espe.model.singleton.Singleton;

/**
 *
 * @author Usuario
 */
public class SystemSingleton {

    Singleton s = new Singleton;

    public static void main(String[] args) {
        // TODO code application logic here
        Singleton single = Singleton.getSingletonIntance("Dennis");

        System.out.println(single.getName());
    }

}

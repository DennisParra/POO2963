/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracFactory.view;

import ec.edu.espe.abstractFactory.controller.AbstractFactory;
import ec.edu.espe.abstractFactory.controller.ConcreteFactory1;
import ec.edu.espe.abstractFactory.controller.ConcreteFactory2;

/**
 *
 * @author Labs-DCCO
 */
public class Customers {

    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.CreateProductA();
        factory1.CreateProductB();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.CreateProductA();
        factory2.CreateProductB();
        
        
    }
}

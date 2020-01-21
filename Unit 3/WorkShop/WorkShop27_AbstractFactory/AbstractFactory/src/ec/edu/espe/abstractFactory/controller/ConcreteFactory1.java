/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstracFactory.model.ProductA1;
import ec.edu.espe.abstracFactory.model.ProductB1;

/**
 *
 * @author Labs-DCCO
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public void CreateProductA() {
        ProductA1 producta1 = new ProductA1();
        producta1.toString();
    }

    @Override
    public void CreateProductB() {
        ProductB1 productb1 = new ProductB1();
        productb1.toString();
    }

}
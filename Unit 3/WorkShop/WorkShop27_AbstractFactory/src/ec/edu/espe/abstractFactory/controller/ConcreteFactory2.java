/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstracFactory.model.ProductA2;
import ec.edu.espe.abstracFactory.model.ProductB2;

/**
 *
 * @author Labs-DCCO
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public void CreateProductA() {
       ProductA2 producta2 = new ProductA2();
       producta2.toString();
    }

    @Override
    public void CreateProductB() {
       ProductB2 productb2 = new ProductB2();
       productb2.toString();
    }

   

}

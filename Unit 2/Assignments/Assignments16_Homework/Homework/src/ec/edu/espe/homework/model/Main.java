/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.homework.model;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Int, Float, Double
        int catetoOp = 7;
        float catetoAd = 9.1516f;
        double hipotenusa = 15.123456;
        double leyCoseno;
        double resultadoLeyCoseno;
        double radianCoseno;

        leyCoseno = ((Math.pow(catetoOp, 2)) + (Math.pow(catetoAd, 2)) - (Math.pow(hipotenusa, 2))) / (2 * (catetoOp) * (catetoAd));
        radianCoseno = Math.acos(leyCoseno);
        resultadoLeyCoseno = Math.toDegrees(radianCoseno);

        System.out.println("Se tiene un triangulo y se desea encontrar uno de sus angulos mediante la Ley de Cosenos");
        System.out.println("El resultado para encontrar el Cos B es = " + leyCoseno);
        System.out.println("El resultado final del angulo es " + "\nB = " + resultadoLeyCoseno + "°");

        //String y Char
        char caracter = 'e';
        String cadena = "brevemente";

        System.out.println("\n\nLa palabra es " + cadena + " y la unica letra que tiene esa palabra es la " + caracter);

        //Boolean
        boolean decision = false;
        System.out.println("\n\n¿La Gran Muralla China es la única obra construida por el hombre visible a simple vista desde el espacio?");
        System.out.println("R: "+decision);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ReferencedParameters;

/**
 *
 * @author HP
 */
public class ReferencedParameters {
    
    static int p=5;
    static int q=5;
    
    public static void main(String[] args) {
        System.out.println("Before calling method");
        System.out.println("p ---> " + p);
        System.out.println("q ---> " + q);
        
        int r = 0;
        r = sum(p,q);
        
        System.out.println("After calling method");
        System.out.println("p ---> " + p);
        System.out.println("q ---> " + q);
        System.out.println("result ---> " + r);
        
        Person person = new Person (1, "Dennis");
        System.out.println("Before calling the method --> "+person);
        viewName(person);
        System.out.println("After calling the method --> "+person);
        
    }
    
    public static int sum(int a, int b){
        a=20;
        b=10;
        int c;
        c = a+b;
        return c;
    }
    
    public static void viewName(Person p){
        System.out.println(" Person at first line of method "+p);
        p.setId(10);
        p.setName("Esteban");
        System.out.println(" Person at last line of method "+p);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.singleton;

import static java.util.Collections.singleton;

/**
 *
 * @author Usuario
 */
public class Singleton {

    public static Singleton getSingletonIntance(String dennis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String name;
    private static Singleton singleton;
    
    public Singleton(){
        this.name=name;
        System.out.println("The Group in pair");
        
    }
    public static Singleton getSingletonIntance(){
        if(singleton == null){
            singleton = new Singleton();
            
        }else{
            System.out.println("Not can created object because yes exits");
        }
        return singleton;      
    }

//    public static void Singleton(){
//        
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

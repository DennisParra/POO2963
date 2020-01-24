/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Matitisxd
 */
public class SoyUnico {

    private String nombre;
    private static SoyUnico soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static SoyUnico getSingletonInstance(String nombre) {
        if (getSoyUnico() == null){
            setSoyUnico(new SoyUnico(nombre));
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return getSoyUnico();
    }
    @Override
    public SoyUnico clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase SoyUnico");
        }
        return null; 
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the soyUnico
     */
    public static SoyUnico getSoyUnico() {
        return soyUnico;
    }

    /**
     * @param aSoyUnico the soyUnico to set
     */
    public static void setSoyUnico(SoyUnico aSoyUnico) {
        soyUnico = aSoyUnico;
    }
    
    

}

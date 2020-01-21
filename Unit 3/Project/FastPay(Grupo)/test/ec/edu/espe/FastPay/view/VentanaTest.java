/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.view;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class VentanaTest {
    
    public VentanaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cargar_txt method, of class Ventana.
     */
    @Test
    public void testCargar_txt() {
        System.out.println("cargar_txt");
        Ventana instance = new Ventana();
        instance.cargar_txt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of grabar_txt method, of class Ventana.
     */
    @Test
    public void testGrabar_txt() {
        System.out.println("grabar_txt");
        Ventana instance = new Ventana();
        instance.grabar_txt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarRegistro method, of class Ventana.
     */
    @Test
    public void testIngresarRegistro() {
        System.out.println("ingresarRegistro");
        File ruta = null;
        Ventana instance = new Ventana();
        instance.ingresarRegistro(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarRegistro method, of class Ventana.
     */
    @Test
    public void testModificarRegistro() {
        System.out.println("modificarRegistro");
        File ruta = null;
        Ventana instance = new Ventana();
        instance.modificarRegistro(ruta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarRegistro method, of class Ventana.
     */
    @Test
    public void testEliminarRegistro() {
        System.out.println("eliminarRegistro");
        Ventana instance = new Ventana();
        instance.eliminarRegistro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarRegistro method, of class Ventana.
     */
    @Test
    public void testListarRegistro() {
        System.out.println("listarRegistro");
        Ventana instance = new Ventana();
        instance.listarRegistro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerCodigo method, of class Ventana.
     */
    @Test
    public void testLeerCodigo() {
        System.out.println("leerCodigo");
        Ventana instance = new Ventana();
        int expResult = 0;
        int result = instance.leerCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerNombre method, of class Ventana.
     */
    @Test
    public void testLeerNombre() {
        System.out.println("leerNombre");
        Ventana instance = new Ventana();
        String expResult = "";
        String result = instance.leerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerPrecio method, of class Ventana.
     */
    @Test
    public void testLeerPrecio() {
        System.out.println("leerPrecio");
        Ventana instance = new Ventana();
        double expResult = 0.0;
        double result = instance.leerPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerDescripcion method, of class Ventana.
     */
    @Test
    public void testLeerDescripcion() {
        System.out.println("leerDescripcion");
        Ventana instance = new Ventana();
        Object expResult = null;
        Object result = instance.leerDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leerFoto method, of class Ventana.
     */
    @Test
    public void testLeerFoto() {
        System.out.println("leerFoto");
        File ruta = null;
        Ventana instance = new Ventana();
        byte[] expResult = null;
        byte[] result = instance.leerFoto(ruta);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mensaje method, of class Ventana.
     */
    @Test
    public void testMensaje() {
        System.out.println("mensaje");
        String texto = "";
        Ventana instance = new Ventana();
        instance.mensaje(texto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Ventana.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ventana.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

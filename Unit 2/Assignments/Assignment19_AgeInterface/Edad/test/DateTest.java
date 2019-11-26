/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class DateTest {
    
    public DateTest() {
    }
    
     @Test
    public void testSomeMethod() {
        int day = 15;
        int month = 5;
        int year = 2018;
        int fecha = day + month + year;
        assertEquals(fecha,10);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
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
        System.out.println("");
        String fecha = ("17-12-1970");
        int expResult = 48;
        int result=(int) Date.parse(fecha);
        assertEquals(expResult,result);
    }
    
    
}

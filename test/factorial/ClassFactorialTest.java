/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b6
 */
public class ClassFactorialTest {
    
    public ClassFactorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
    }

    /**
     * Test of factorial method, of class ClassFactorial.
     */
    @Test
    public void testFactorial() {
        assertEquals(1, ClassFactorial.factorial(0));
        assertTrue(1 == ClassFactorial.factorial(1));
        assertEquals(24, ClassFactorial.factorial(4));
        assertEquals(120, ClassFactorial.factorial(6));
        boolean excepcionLanzada = false;
        try{
            ClassFactorial.factorial(-1);
        }catch (IllegalArgumentException e){
            excepcionLanzada = true;
        }
        assertTrue(excepcionLanzada);
    }
    
}

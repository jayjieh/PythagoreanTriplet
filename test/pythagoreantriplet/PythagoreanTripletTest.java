/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantriplet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owori Juma
 */
public class PythagoreanTripletTest {
    
    public PythagoreanTripletTest() {
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
     * Test of isTriplet method, of class PythagoreanTriplet.
     */
    @Test
    public void testIsArrayTriplet() {
        System.out.println("isArrayTriplet");
        int[] arr = {3, 1, 4, 6, 5};
        int n = arr.length;
        boolean expResult = true;
        boolean result = PythagoreanTriplet.isArrayTriplet(arr, n);
        assertEquals(expResult, result);
    }
    
}

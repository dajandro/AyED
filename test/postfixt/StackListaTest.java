/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package postfixt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class StackListaTest {
    
    public StackListaTest() {
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
     * Test of pop method, of class StackLista.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackLista instance = new StackLista(0, null);
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class StackLista.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Integer dato = 5;
        StackLista instance = new StackLista(0, null);
        instance.push(dato);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class StackLista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        StackLista instance = new StackLista(0, null);
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

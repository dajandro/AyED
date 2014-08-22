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
public class ListaDobleTest {
    
    public ListaDobleTest() {
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
     * Test of getTamaño method, of class ListaDoble.
     */
    @Test
    public void testGetTamaño() {
        System.out.println("getTama\u00f1o");
        ListaDoble instance = new ListaDoble();
        int expResult = 0;
        int result = instance.getTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarFinal method, of class ListaDoble.
     */
    @Test
    public void testAgregarFinal() {
        System.out.println("AgregarFinal");
        Object valor = null;
        ListaDoble instance = new ListaDoble();
        instance.AgregarFinal(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPrincipio method, of class ListaDoble.
     */
    @Test
    public void testAgregarPrincipio() {
        System.out.println("AgregarPrincipio");
        Object valor = null;
        ListaDoble instance = new ListaDoble();
        instance.AgregarPrincipio(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverUltimo method, of class ListaDoble.
     */
    @Test
    public void testRemoverUltimo() {
        System.out.println("RemoverUltimo");
        ListaDoble instance = new ListaDoble();
        int expResult = 5;
        instance.AgregarFinal(5);
        Object result = instance.RemoverUltimo();
        assertEquals(expResult, result);       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ListaDoble.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        Object valor = null;
        ListaDoble instance = new ListaDoble();
        Object expResult = null;
        Object result = instance.Remover(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class ListaDoble.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Object valor = null;
        int posicion = 0;
        ListaDoble instance = new ListaDoble();
        instance.Agregar(valor, posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class ListaDoble.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Integer valor = 5;
        int posicion = 1;
        ListaDoble instance = new ListaDoble();
        instance.AgregarPrincipio(valor);
        //instance.set(valor, posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ListaDoble.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int pos = 0;
        ListaDoble instance = new ListaDoble();
        int expResult = 0;
        instance.AgregarPrincipio(pos);
        Object result = instance.get(pos);        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ListaDoble.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        ListaDoble instance = new ListaDoble();
        Comparable[] expResult = null;
        Comparable[] result = null;
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaDoble.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaDoble instance = new ListaDoble();
        String expResult = "[ null]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

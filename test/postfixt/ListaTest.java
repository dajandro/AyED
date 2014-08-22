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
public class ListaTest {
    
    public ListaTest() {
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
     * Test of AgregarFinal method, of class Lista.
     */
    @Test
    public void testAgregarFinal() {
        System.out.println("AgregarFinal");
        Object valor = null;
        Lista instance = new Lista();
        instance.AgregarFinal(valor);
        // TODO review the generated test code and remove the default call to fail.
        //
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTamaño method, of class Lista.
     */
    @Test
    public void testGetTamaño() {
        System.out.println("getTama\u00f1o");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.getTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contieneValor method, of class Lista.
     */
    @Test
    public void testContieneValor() {
        System.out.println("contieneValor");
        Object valor = null;
        Lista instance = new Lista();
        boolean expResult = false;
        boolean result = instance.contieneValor(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Cabeza method, of class Lista.
     */
    @Test
    public void testCabeza() {
        System.out.println("Cabeza");
        Lista instance = new Lista();
        Object expResult = null;
        Object result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPrincipio method, of class Lista.
     */
    @Test
    public void testAgregarPrincipio() {
        System.out.println("AgregarPrincipio");
        Object valor = null;
        Lista instance = new Lista();
        instance.AgregarPrincipio(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class Lista.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Object valor = null;
        int posicion = 0;
        Lista instance = new Lista();
        instance.Agregar(valor, posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class Lista.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int valor = 5;
        int posicion = 0;        
        Lista instance = new Lista();
        instance.AgregarPrincipio(valor);
        instance.set(valor, posicion);       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverPrimero method, of class Lista.
     */
    @Test
    public void testRemoverPrimero() {
        System.out.println("RemoverPrimero");
        Lista instance = new Lista();
        int num = 5;
        instance.AgregarPrincipio(num);
        int expResult = 5;
        Object result = instance.RemoverPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverUltimo method, of class Lista.
     */
    @Test
    public void testRemoverUltimo() {
        System.out.println("RemoverUltimo");
        Lista instance = new Lista();
        int num = 5;
        instance.AgregarFinal(num);
        int expResult = 5;
        Object result = instance.RemoverUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class Lista.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        Object valor = null;
        Lista instance = new Lista();
        Object expResult = null;
        Object result = instance.Remover(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Lista.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int pos = 0;
        Lista instance = new Lista();
        instance.AgregarPrincipio(pos);
        int expResult = 0;
        Object result = instance.get(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class Lista.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object inputData = null;
        Lista instance = new Lista();
        int expResult = -1;
        int result = instance.indexOf(inputData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class Lista.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        Lista instance = new Lista();
        Comparable[] expResult = null;
        Comparable[] result = null;
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lista.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lista instance = new Lista();
        String expResult = "[ null]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

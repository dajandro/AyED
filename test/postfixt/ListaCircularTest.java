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
public class ListaCircularTest {
    
    public ListaCircularTest() {
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
     * Test of getTamaño method, of class ListaCircular.
     */
    @Test
    public void testGetTamaño() {
        System.out.println("getTama\u00f1o");
        ListaCircular instance = new ListaCircular();
        int expResult = 0;
        int result = instance.getTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class ListaCircular.
     */
    @Test
    public void testAgregar_GenericType() {
        System.out.println("Agregar");
        Object valor = null;
        ListaCircular instance = new ListaCircular();
        instance.Agregar(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarFinal method, of class ListaCircular.
     */
    @Test
    public void testAgregarFinal() {
        System.out.println("AgregarFinal");
        Object valor = null;
        ListaCircular instance = new ListaCircular();
        instance.AgregarFinal(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPrincipio method, of class ListaCircular.
     */
    @Test
    public void testAgregarPrincipio() {
        System.out.println("AgregarPrincipio");
        Object valor = null;
        ListaCircular instance = new ListaCircular();
        instance.AgregarPrincipio(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverUltimo method, of class ListaCircular.
     */
    @Test
    public void testRemoverUltimo() {
        System.out.println("RemoverUltimo");
        ListaCircular instance = new ListaCircular();
        int expResult = 5;
        instance.AgregarPrincipio(5);
        Object result = instance.RemoverUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ListaCircular.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int pos = 1;
        ListaCircular instance = new ListaCircular();
        instance.AgregarPrincipio(pos);
        int expResult = 1;
        Object result = instance.get(pos);        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class ListaCircular.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Integer valor = 5;
        int posicion = 1;
        ListaCircular instance = new ListaCircular();
        instance.AgregarPrincipio(valor);
        instance.set(valor, posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class ListaCircular.
     */
    @Test
    public void testAgregar_GenericType_int() {
        System.out.println("Agregar");
        Object valor = null;
        int posicion = 0;
        ListaCircular instance = new ListaCircular();
        instance.Agregar(valor, posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ListaCircular.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        ListaCircular instance = new ListaCircular();
        Comparable[] expResult = null;
        Comparable[] result = null;
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaCircular.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaCircular instance = new ListaCircular();        
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class ListaCircular.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        int valor = 5;
        ListaCircular instance = new ListaCircular();
        Object expResult = 5;
        instance.AgregarPrincipio(valor);
        Object result = instance.Remover(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

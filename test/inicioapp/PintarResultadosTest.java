/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Denis Marian Manta
 */
public class PintarResultadosTest {
    
    public PintarResultadosTest() {
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
     * Test of textoCaracteresTotal method, of class PintarResultados.
     */
    @Test
    public void testTextoCaracteresTotal() {
        System.out.println("textoCaracteresTotal");
        int total = 0;
        String expResult = "";
        String result = PintarResultados.textoCaracteresTotal(total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of textoNumeroPalabras method, of class PintarResultados.
     */
    @Test
    public void testTextoNumeroPalabras() {
        System.out.println("textoNumeroPalabras");
        int total = 0;
        String expResult = "";
        String result = PintarResultados.textoNumeroPalabras(total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of textoTodosCaracteres method, of class PintarResultados.
     */
    @Test
    public void testTextoTodosCaracteres() {
        System.out.println("textoTodosCaracteres");
        int[] contador = null;
        String expResult = "";
        String result = PintarResultados.textoTodosCaracteres(contador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

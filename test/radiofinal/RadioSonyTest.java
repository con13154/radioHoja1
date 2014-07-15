/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radiofinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author E. de Mata
 */
public class RadioSonyTest {
    
    public RadioSonyTest() {
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
     * Test of setEstacion method, of class RadioSony.
     */
    @Test
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 9.0;
        RadioSony instance = new RadioSony();
        instance.setEstacion(estacion);
        //assertEquals(estacion,instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of guardarEstacion method, of class RadioSony.
     */
    @Test
    public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        double estacion = 97.0;
        int boton = 0;
        RadioSony instance = new RadioSony();
        instance.guardarEstacion(estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstacion method, of class RadioSony.
     */
    @Test
    public void testCambiarEstacion() {
        System.out.println("cambiarEstacion");
        boolean masMenos = false;
        RadioSony instance = new RadioSony();
        instance.cambiarEstacion(masMenos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of encendidoApagado method, of class RadioSony.
     */
    @Test
    public void testEncendidoApagado() {
        System.out.println("encendidoApagado");
        RadioSony instance = new RadioSony();
        instance.encendidoApagado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class RadioSony.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        RadioSony instance = new RadioSony();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

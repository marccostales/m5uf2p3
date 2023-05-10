/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5uf2p3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marco
 */
public class M5uf2p3Test {

    public M5uf2p3Test() {
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
     * Test of main method, of class M5uf2p3.
     */
    @Test
    public void testMain() {
        M5uf2p3 invertir = new M5uf2p3();
        String cadena = "Hola";
        String resultadoInvertido = "aloH";
        assertEquals(resultadoInvertido, invertir.inverteix(cadena));

        M5uf2p3 factorial = new M5uf2p3();
        double numero = 8;
        double resultadoFactorial = 40320;
        assertEquals(resultadoFactorial, factorial.factorial(numero), 0.0);

        M5uf2p3 edat = new M5uf2p3();
        int dia = 23;
        int mes = 1;
        int año = 2001;
        int resultadoEdat = 22;
        assertEquals(resultadoEdat, edat.edat(dia, mes, año));
    }

    /**
     * Test of inverteix method, of class M5uf2p3.
     */
    @Test
    public void testInverteix() {
        String cadena = "";
        String expResult = "";
        String result = M5uf2p3.inverteix(cadena);
        assertEquals(expResult, result);

        cadena = "a";
        expResult = "a";
        result = M5uf2p3.inverteix(cadena);
        assertEquals(expResult, result);

        cadena = "Hola mundo";
        expResult = "odnum aloH";
        result = M5uf2p3.inverteix(cadena);
        assertEquals(expResult, result);

        cadena = "Programacion";
        expResult = "noicamargorP";
        result = M5uf2p3.inverteix(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Test of edat method, of class M5uf2p3.
     */
    @Test
    public void testEdat() {
        int dia1 = 10;
        int mes1 = 5;
        int anio1 = 2000;
        int expResult1 = 23;
        int result1 = M5uf2p3.edat(dia1, mes1, anio1);
        assertEquals(expResult1, result1);

        int dia2 = 32;
        int mes2 = 5;
        int anio2 = 2000;
        int expResult2 = -2;
        int result2 = M5uf2p3.edat(dia2, mes2, anio2);
        assertEquals(expResult2, result2);

        int dia3 = 1;
        int mes3 = 0;
        int anio3 = 2000;
        int expResult3 = -2;
        int result3 = M5uf2p3.edat(dia3, mes3, anio3);
        assertEquals(expResult3, result3);

        int dia4 = 1;
        int mes4 = 13;
        int anio4 = 2000;
        int expResult4 = -2;
        int result4 = M5uf2p3.edat(dia4, mes4, anio4);
        assertEquals(expResult4, result4);

        int dia5 = 30;
        int mes5 = 2;
        int anio5 = 2000;
        int expResult5 = -2;
        int result5 = M5uf2p3.edat(dia5, mes5, anio5);
        assertEquals(expResult5, result5);

        int dia6 = 31;
        int mes6 = 4;
        int anio6 = 2000;
        int expResult6 = -2;
        int result6 = M5uf2p3.edat(dia6, mes6, anio6);
        assertEquals(expResult6, result6);

        int dia7 = 1;
        int mes7 = 1;
        int anio7 = 1800;
        int expResult7 = -1;
        int result7 = M5uf2p3.edat(dia7, mes7, anio7);
        assertEquals(expResult7, result7);
    }

    /**
     * Test of factorial method, of class M5uf2p3.
     */
    @Test
    public void testFactorial() {
        double numero1 = -5;
        double expResult1 = -1;
        double result1 = M5uf2p3.factorial(numero1);
        assertEquals(expResult1, result1, 0.0);

        double numero2 = 0;
        double expResult2 = 1;
        double result2 = M5uf2p3.factorial(numero2);
        assertEquals(expResult2, result2, 0.0);

        double numero3 = 1;
        double expResult3 = 1;
        double result3 = M5uf2p3.factorial(numero3);
        assertEquals(expResult3, result3, 0.0);

        double numero4 = 5;
        double expResult4 = 120;
        double result4 = M5uf2p3.factorial(numero4);
        assertEquals(expResult4, result4, 0.0);
    }

}

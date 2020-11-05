/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaluf2m05;

import examenuf2m05.Estudiant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 *
 * @author AdriJ
 */
public class AvaluadorTest1 {
    
    private Avaluador instance;
    
    @Rule
    public Timeout globalTimeout = Timeout.millis(250);
    
    public AvaluadorTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        instance=new Avaluador();
        
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(7.33, instance.mitjanaSiSupera(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }
    
    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(7.33, instance.mitjana(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        Estudiant [] estudiants = new Estudiant[] {new Estudiant("Adri", 9.0, 7.0, 6.0), 
                                                   new Estudiant("Pep", 5.0, 5.0, 5.0),
                                                   new Estudiant("Jose", 5.0, 6.0, 6.0)};
        
        assertEquals(estudiants[0],instance.millorEstudiantPerNotaMitjana(estudiants));
    }
    
}

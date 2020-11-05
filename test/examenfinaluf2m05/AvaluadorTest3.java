/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaluf2m05;

import examenuf2m05.Estudiant;
import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author AdriJ
 */
public class AvaluadorTest3 {
    
    private Avaluador instance;
    
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    
    @Rule
    public Timeout globalTimeout = Timeout.millis(250);
    
    public AvaluadorTest3() {
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
       thrown.expect(Exception.class);
       thrown.expectCause(Is.isA(InvalidParameterException.class));
       thrown.expectMessage(CoreMatchers.startsWith("Alguna nota parcial no supera 5"));
       assertEquals(7.33, instance.mitjanaSiSupera(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }
    
    
    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
       thrown.expect(Exception.class);
       thrown.expectCause(Is.isA(InvalidParameterException.class));
       thrown.expectMessage(CoreMatchers.startsWith("Abono negativo"));
       assertEquals(7.33, instance.mitjana(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        //assertEquals(7.33, instance.mitjana(new Estudiant("Adri",9,7,6)), 0.1);
    }
    
}

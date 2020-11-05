/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaluf2m05;

import examenuf2m05.Estudiant;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author AdriJ
 */
@RunWith(Parameterized.class)
public class AvaluadorTest2 {
    
    private Avaluador instance;
    
    @Parameterized.Parameter(0)
    public Estudiant Estudiant;
    @Parameterized.Parameter(1)
    public double mitjana;
    
    public static Collection<Object[]> data() {
        Object[][] data = new Object [][]{
            {new Estudiant ("Adri", 9.0, 7.0, 6.0), 7.33},
            {new Estudiant ("Pep", 5.0, 5.0, 5.0), 5.0},
            {new Estudiant ("Jose", 5.0, 6.0, 6.0), 5.33},
            {new Estudiant ("Ramon",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Juan",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Ivan",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Alvaro",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Laura",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Sergio",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Lionel",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Marcos",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Nieve",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Elisabeth",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Juana",5.0,6.0,8.0), 6.33},
            {new Estudiant ("Andres",5.0,6.0,8.0), 6.33}
        };
        return Arrays.asList(data);
    }
    
    public AvaluadorTest2() {
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
        assertEquals(mitjana, instance.mitjanaSiSupera(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }
    
    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(mitjana, instance.mitjana(new Estudiant("Adri",9.0,7.0,6.0)), 0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
   /* @Test
    public void testMillorEstudiantPerNotaMitjana() {
        Estudiant [] estudiants = new Estudiant[] {new Estudiant("Adri", 9.0, 7.0, 6.0), 
                                                   new Estudiant("Pep", 5.0, 5.0, 5.0),
                                                   new Estudiant("Jose", 5.0, 6.0, 6.0)};
        
        assertEquals(estudiants[0],instance.millorEstudiantPerNotaMitjana(estudiants));
    }
    */
}

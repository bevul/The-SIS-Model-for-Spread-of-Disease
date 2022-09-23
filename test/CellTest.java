/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CellTest {
    
    public CellTest() {
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
     * Test of Health method, of class Cell.
     */
    @Test
    public void testHealth() {
        System.out.println("Health");
        Cell instance = new Cell();
        boolean expResult = false;
        boolean result = instance.Health();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHealth method, of class Cell.
     */
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");
        boolean health = false;
        Cell instance = new Cell();
        instance.setHealth(health);
    }

    /**
     * Test of changeState method, of class Cell.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        int ill = 0;
        Cell instance = new Cell();
        instance.changeState(ill);
    }

    /**
     * Test of setIll method, of class Cell.
     */
    @Test
    public void testSetIll() {
        System.out.println("setIll");
        int ill = 0;
        Cell instance = new Cell();
        instance.setIll(ill);
        
    }

    /**
     * Test of getIll method, of class Cell.
     */
    @Test
    public void testGetIll() {
        System.out.println("getIll");
        Cell instance = new Cell();
        int expResult = 0;
        int result = instance.getIll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setImm method, of class Cell.
     */
    @Test
    public void testSetImm() {
        System.out.println("setImm");
        int imm = 0;
        Cell instance = new Cell();
        instance.setImm(imm);
        
    }

    /**
     * Test of getImm method, of class Cell.
     */
    @Test
    public void testGetImm() {
        System.out.println("getImm");
        Cell instance = new Cell();
        int expResult = 0;
        int result = instance.getImm();
        assertEquals(expResult, result);
        
    }
    
}

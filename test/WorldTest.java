/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class WorldTest extends JPanel {
    
    private World world;
    
    private Cell [][] worldCells;

    
    public WorldTest() {
    }
    
    @Before
    public void setUp() {
        world = new World(10, 50, 6, 4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of step method, of class World.
     */
    @Test
    public void testStep() {
        System.out.println("step");
        world.step();
        for (int i=0;i<worldCells.length;i++){
            for (int j=0;j<worldCells.length;j++){
                assertNotNull(worldCells[i][j].Health());
                assertNotNull(worldCells[i][j].getIll());
                assertNotNull(worldCells[i][j].getImm());
            }
        }
    }

    /**
     * Test of reset method, of class World.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        world.reset();
        for (int i=0;i<worldCells.length;i++){
            for (int j=0;j<worldCells.length;j++){
                assertTrue(worldCells[i][j].Health());
                assertEquals(0, worldCells[i][j].getIll());
                assertEquals(0, worldCells[i][j].getImm());
            }
        }
    }

    /**
     * Test of setN method, of class World.
     */
    @Test
    public void testSetN() {
        System.out.println("setN");
        int N = 0;
        World instance = null;
        instance.setN(N);
    }

    /**
     * Test of setCont method, of class World.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int Cont = 0;
        World instance = null;
        instance.setCont(Cont);
    }

    /**
     * Test of setIll method, of class World.
     */
    @Test
    public void testSetIll() {
        System.out.println("setIll");
        int ill = 0;
        World instance = null;
        instance.setIll(ill);
    }

    /**
     * Test of setImm method, of class World.
     */
    @Test
    public void testSetImm() {
        System.out.println("setImm");
        int imm = 0;
        World instance = null;
        instance.setImm(imm);
    }
    
}

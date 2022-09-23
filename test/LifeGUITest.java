

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author User
 */
public class LifeGUITest {
    
    private FrameFixture window;

    @Before
    public void setUp() {
    LifeGUI frame = GuiActionRunner.execute(() -> new LifeGUI());
    window = new FrameFixture(frame);
    }
    
    @After
    public void tearDown() {
        window.cleanUp();
    }

    
    @Test
    public void belowZeroInput() {
        // TODO review the generated test code and remove the default call to fail.
        window.textBox("N").deleteText();
        window.textBox("N").enterText("-1");
        window.button("Set").click();
        window.label("Status").equals("Warning");
    }
    
    @Test
    public void blankInput() {
        // TODO review the generated test code and remove the default call to fail.
        window.textBox("N").deleteText();
        window.textBox("N").enterText("");
        window.button("Set").click();
        window.label("Status").requireText("Warning!");
    }
    
    @Test
    public void aboveZeroInput() {
        // TODO review the generated test code and remove the default call to fail.
        window.textBox("N").deleteText();
        window.textBox("N").enterText("10");
        window.button("Set").click();
        window.label("Status").equals("");
    }
    
    @Test
    public void letterInput() {
        // TODO review the generated test code and remove the default call to fail.
        window.textBox("N").deleteText();
        window.textBox("N").enterText("N");
        window.button("Set").click();
        window.label("Status").requireText("Warning!");
    }
    
}

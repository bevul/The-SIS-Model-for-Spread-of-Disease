/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class ControlPanel extends JPanel{
    private World world;
    private JButton btnStep;
    private JButton btnRun;
    private JButton btnReset;
    private Timer t;
    
    
    public ControlPanel(World w){
        world = w;
        t = new Timer(500, 
                new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                world.step();
                            }
                        }
        );
        t.setRepeats(true);
        
        btnStep = new JButton("Step");
        add(btnStep);
        btnStep.addActionListener(
                        new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                world.step();
                            }
                        }
        );
        
        btnRun = new JButton("Start");
        add(btnRun);
        btnRun.addActionListener(
                        new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                JButton btn = (JButton) e.getSource();
                                if(btn.getText().equals("Start")){
                                    t.start();
                                    btn.setText("Stop");
                                } else{
                                    t.stop();
                                    btn.setText("Start");
                                }
                            }
                        }
        );
        
        btnReset = new JButton("Reset");
        add(btnReset);
        btnReset.addActionListener(
                        new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                world.reset();
                            }
                        }
        );
    }
}

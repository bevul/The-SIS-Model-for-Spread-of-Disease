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
public class LifeGUI extends JFrame{
    private World game;
    
    public LifeGUI(){
        
        setLayout(new BorderLayout());
        JPanel income = new JPanel();
        
        JTextField N, ill, imm, cont; JLabel NTxt, illTxt, immTxt, contTxt;
        NTxt = new JLabel("N"); 
        illTxt = new JLabel("Ill"); 
        immTxt = new JLabel("Imm"); 
        contTxt = new JLabel("%");
        N = new JTextField("10", 5); N.setName("N");
        ill = new JTextField("6",5); 
        imm = new JTextField("4",5); 
        cont = new JTextField("50",5);
        JButton set = new JButton("Set"); set.setName("Set");
       
        JLabel Status = new JLabel(""); Status.setName("Status");
        income.add(Status); 
        income.add(NTxt);income.add(N);
        income.add(illTxt);income.add(ill); 
        income.add(immTxt);income.add(imm); 
        income.add(contTxt);income.add(cont);
        income.add(set);
        add(income, BorderLayout.NORTH);
        
        int Num = Integer.parseInt(N.getText());
        int Nill = Integer.parseInt(ill.getText());
        int Nimm = Integer.parseInt(imm.getText());
        int Ncont = Integer.parseInt(cont.getText());
        game = new World(Num, Ncont, Nill, Nimm);
        add(game, BorderLayout.CENTER);
       
        set.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                        int Num = Integer.parseInt(N.getText());
                        int Nill = Integer.parseInt(ill.getText());
                        int Nimm = Integer.parseInt(imm.getText());
                        int Ncont = Integer.parseInt(cont.getText());
                        if (Num>0&&Nill>0&&Nimm>0&&Ncont>0){
                        game.setN(Num); game.setIll(Nill); game.setImm(Nimm); game.setCont(Ncont);
                        } else {
                            Status.setText("Warning!");
                        }
            }
        });
        
        ControlPanel cp = new ControlPanel(game);
        add(cp, BorderLayout.SOUTH);
        
        setSize(500, 500);
        setTitle("Disease Pattern");
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

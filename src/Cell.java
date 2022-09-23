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
public class Cell extends JButton{
    private boolean health;
    private int ill;
    private int imm;
    
    public Cell(){
        health = true;
        ill = 0;
        imm = 0;
        update();
    }
    
    public boolean Health(){
        return health;
    }
    
    public void setHealth(boolean health){
        this.health = health;
        update();
    }
    
    public void changeState( int ill){
        health = !health;
        if(!health) this.ill = ill;
        update();
    }
    
    public void setIll(int ill){
        this.ill = ill;
    }
    
    public int getIll(){
        return ill;
    }
    
    public void setImm(int imm){
        this.imm = imm;
    }
    
    public int getImm(){
        return imm;
    }
    
    private void update(){
        if(!health){
            setText("X");
            setBackground(Color.red);
        }
        else{
            setText("");
            setBackground(Color.blue);
        }
    } 
}

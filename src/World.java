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
public class World extends JPanel{
    private Cell [][] world;
    private int Cont;//Вероятность заражения
    private int ill;
    private int imm;
    private int size;
    
    public World(int size, int Cont, int ill, int imm){
        
        this.Cont = Cont;
        this.ill = ill;
        this.imm = imm;
        setLayout(new GridLayout(size, size));
        setN(size);  
        
    }
    
    public void step(){
        Cell[][] copy = new Cell [world.length][world.length];
        for (int i=0;i<world.length;i++){
            for (int j=0;j<world[i].length;j++){
                copy[i][j] = new Cell();
                copy[i][j].setHealth(world[i][j].Health());
                copy[i][j].setIll(world[i][j].getIll());
                copy[i][j].setImm(world[i][j].getImm());
            }
        }
        
        //rules
        for (int i=0;i<world.length;i++){
            for (int j=0;j<world[i].length;j++){
                if(!world[i][j].Health()){
                    if(i>0 && world[i-1][j].Health() && world[i-1][j].getImm()==0 && Math.random() * 100<Cont){
                        copy[i-1][j].changeState(ill);
                    }//клетка слева
                    if(j>0 && world[i][j-1].Health() && world[i][j-1].getImm()==0 && Math.random() * 100<Cont){
                        copy[i][j-1].changeState(ill);
                    }//клетка снизу
                    if(i<world.length-1 && world[i+1][j].Health() && world[i+1][j].getImm()==0 && Math.random() * 100<Cont){
                        copy[i+1][j].changeState(ill);
                    }//клетка справа
                    if(j<world.length-1 && world[i][j+1].Health() && world[i][j+1].getImm()==0 && Math.random() * 100<Cont){
                        copy[i][j+1].changeState(ill);
                    }//клетка сверху
                    copy[i][j].setIll(world[i][j].getIll() - 1);
                } 
                if (!world[i][j].Health()&&world[i][j].getIll()==0){
                        if (imm>0){
                        copy[i][j].changeState(ill);
                        copy[i][j].setImm(imm);
                                } else if(world[i][j].Health()&&world[i][j].getImm()>0){
                                                copy[i][j].setImm(world[i][j].getImm() - 1);
                            }
                    
                }
            }
        }
        
        for (int i=0;i<world.length;i++){
            for (int j=0;j<world[i].length;j++){
                world[i][j].setHealth(copy[i][j].Health());
                world[i][j].setIll(copy[i][j].getIll());
                world[i][j].setImm(copy[i][j].getImm());
            }
        }
    }
    public void reset(){
        for (int i=0;i<world.length;i++){
            for (int j=0;j<world[i].length;j++){
                world[i][j].setHealth(true);
                world[i][j].setIll(0);
                world[i][j].setImm(0);
            }
        }
    }
    
    public void setN(int N){
        
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                removeAll();
            }
        }
        
        setLayout(new GridLayout(N, N));
        world = new Cell[N][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                world[i][j] = new Cell();
                add(world[i][j]);
                world[i][j].addActionListener(
                        new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e){
                                Cell btn = (Cell) e.getSource();
                                btn.changeState(ill);
                            }
                        }
                );
            }
        }
    }
    public void setCont(int Cont){
        this.Cont=Cont;
    }
    public void setIll(int ill){
        this.ill=Cont;
    }
    public void setImm(int imm){
        this.imm=imm;
    }
}

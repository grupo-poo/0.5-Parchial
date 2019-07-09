/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Hilo5 extends Thread{
    private Turtle tortuga;

    public Hilo5(Turtle tortuga) {
        this.tortuga = tortuga;
    }
    
    @Override
    public void run(){
        this.tortuga.setPos(-60,94);
        this.tortuga.right(90);
        this.tortuga.forward(50);
        this.tortuga.right(90);
        this.tortuga.forward(50);
        this.tortuga.right(135);
        this.tortuga.forward(70);
        this.tortuga.setPenColor(Color.yellow);
        this.tortuga.forward(50);
        this.tortuga.left(90);
        this.tortuga.forward(50);
        this.tortuga.left(135);
        this.tortuga.forward(70);
        //om
    }
}
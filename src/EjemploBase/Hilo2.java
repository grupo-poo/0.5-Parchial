/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

    
public class Hilo2 extends Thread{
    private Turtle tortuga;
    public Hilo2(Turtle tortuga)
    {
       this.tortuga= tortuga;
    }
    
    public void run(){
        this.tortuga.setPos(150,167);
        this.tortuga.left(135);
        this.tortuga.forward(100);
        this.tortuga.right(90);
        this.tortuga.forward(100);
        this.tortuga.left(90);
        this.tortuga.forward(100);
        this.tortuga.left(135);
        this.tortuga.forward(140);
        this.tortuga.left(45);
        this.tortuga.forward(100);
        this.tortuga.left(135);
        this.tortuga.forward(140);
        
      
    }
    
}

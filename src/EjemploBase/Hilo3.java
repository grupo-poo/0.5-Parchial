package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author nhoyosp
 */
public class Hilo3 extends Thread {
    private Turtle tortuga;
    
    public Hilo3(Turtle tortuga){
        this.tortuga = tortuga;
    }
    public void run(){
        this.tortuga.setPos(40,44);
        this.tortuga.forward(50);
        this.tortuga.left(45);
        this.tortuga.back(75);
        this.tortuga.right(90);
        this.tortuga.back(75);
        this.tortuga.right(135);
        this.tortuga.back(50);
    }
}
package EjemploBase;

import ch.aplu.turtle.Turtle;

public class Hilo4 extends Thread{
    private Turtle tortuga;
    private double posX;
    private double posY;
    private double ladoy;
    private double ladox;
    private double angulo;

    public Hilo4(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    
    public void run(){
        this.tortuga.setPos(75,60);
            tortuga.left(45);
            tortuga.forward(50);
            this.tortuga.right(135);
            this.tortuga.forward(100);
            this.tortuga.right(45);
            this.tortuga.forward(50);
            this.tortuga.right(135);
            this.tortuga.forward(100);
        }
    }
package EjemploBase;

import ch.aplu.turtle.Turtle;

public class Hilo2 extends Thread{
    private Turtle tortuga;
    private double posX;
    private double posY;
    private double ladoy;
    private double ladox;
    private double angulo;

    public Hilo2(Turtle tortuga, double posX, double posY, double ladoy, double ladox, double angulo) {
        this.tortuga = tortuga;
        this.posX = posX;
        this.posY = posY;
        this.ladoy = ladoy;
        this.ladox = ladox;
        this.angulo = angulo;
    }
    public void run(){
        this.tortuga.setPos(posX, posY);
            tortuga.left(angulo);
            tortuga.forward(ladoy);
            this.tortuga.right(angulo + 90);
            this.tortuga.forward(ladox);
            this.tortuga.right(angulo);
            this.tortuga.forward(ladoy);
            this.tortuga.right(angulo + 90);
            this.tortuga.forward(ladox);
        }
    }

package EjemploBase;

import ch.aplu.turtle.Turtle;

public class Hilof extends Thread{
    private Turtle tortuga;

    public Hilof(Turtle tortuga) {
        this.tortuga = tortuga;
    }
    public void run(){
        this.tortuga.setPos(100,100);
        for(int i=0; i<4; i++){
            this.tortuga.forward(90);
            this.tortuga.right(90);
        }
    }
}

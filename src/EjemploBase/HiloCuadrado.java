package EjemploBase;

import ch.aplu.turtle.Turtle;
    
public class HiloCuadrado extends Thread{
    
    private Turtle tortuga;
    private boolean dibujar;
    private int posX;
    private int posY;
    
    
    public HiloCuadrado(Turtle tortuga)
    {
       this.dibujar = true;
       this.tortuga= tortuga;
       this.posX = 0;
       this.posY = 0;
    }
    
    public void run(){
        DrawCuadrado(this.dibujar);
    }
    
    public void DrawCuadrado(boolean bool){
        if (bool) {
            this.tortuga.setPos(-10,44);
            this.tortuga.forward(50);
            this.tortuga.right(90);
            this.tortuga.forward(50);
            this.tortuga.right(90);
            this.tortuga.forward(50);
            this.tortuga.right(90);
            this.tortuga.forward(50);
            this.tortuga.right(90);
        }
    }

    public Turtle getTortuga() {
        return tortuga;
    }

    public void setTortuga(Turtle tortuga) {
        this.tortuga = tortuga;
    }

    public boolean isDibujar() {
        return dibujar;
    }

    public void setDibujar(boolean dibujar) {
        this.dibujar = dibujar;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
    
}
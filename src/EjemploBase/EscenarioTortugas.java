/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga2 = null;
    Turtle tortuga1 = null;
    Turtle tortuga3 = null;
    Turtle tortuga4 = null;
    Turtle tortuga5 = null;
    Turtle tortuga6 = null;
    
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      tortuga2= new Turtle(this);
      tortuga3=new Turtle(this);
      tortuga4=new Turtle(this);
      tortuga5=new Turtle(this);
      tortuga6=new Turtle(this);
      
    }
    
    public void iniciar(){
       HiloBase hilo = new HiloBase(tortuga1);
       Hilo2 hilo2=new Hilo2(tortuga2);
       HiloCuadrado hilo3=new HiloCuadrado(tortuga3);
       Hilo3 hilo4=new Hilo3(tortuga4);
       Hilo4 hilo5=new Hilo4(tortuga5);
       Hilo5 hilo6=new Hilo5(tortuga6);
       hilo6.start();
       hilo5.start();
       hilo4.start();
       hilo3.start();
       hilo2.start();
      
      
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}

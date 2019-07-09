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
       HiloGrande hilo2=new HiloGrande(tortuga2);
       hilo2.start();
      
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

import java.util.Calendar;

/**
 *
 * @author JoseLuis
 */
public class LogCall {
    
    public int nmarcado;
    public double duracion;
    Calendar fecha; 
    
public LogCall(int nmarcado, double duracion){
    this.nmarcado=54632736;
    this.duracion=10;
    this.fecha.getTime();
}

public String toString(){
    return "Numero marcado: "+nmarcado+" Duracion de la llamada: "+duracion+" fecha actual: "+fecha;
}
    
}

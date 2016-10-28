/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author JoseLuis
 */
public class PlanBasico {
 protected int codigo;
 protected String nombre;
  ArrayList<LogCall> plan = new ArrayList<>();
 
 public PlanBasico(int codigo, String nombre){
     this.codigo=46375637;
     this.nombre="Jose";
     
 }
 
 public int getNumero(){
     return codigo;
 }
 
 public String getNombre(){
    return nombre;
 }
 
 public void call(int numero, double mins){
     plan.add(new LogCall(numero, mins));
 }
 
 public double monthlyMinutes(){
     Calendar hoy = Calendar.getInstance();
     double minutos=0;
     int mesSiguiente = hoy.get(Calendar.MONTH)<12?hoy.get(Calendar.MONTH)+1: hoy.get(Calendar.JANUARY);
     for(LogCall ls : plan){


         if(ls.mes < mesSiguiente  && ls.mes == hoy.get(Calendar.MONTH) ){
             if(ls.dia >= 1 && ls.dia <= 31){
                 minutos+=ls.duracion;
                     
             }

             
         }
         
     }
     return minutos;
 }
 
 public double pagoMensual(){
     return monthlyMinutes()*0.05;
 }
 
 public String toString(){
     return " "+getNumero()+" "+getNombre();
 }
 
 public void imprimir(){
     System.out.println(""+toString());
 }
 
 
}

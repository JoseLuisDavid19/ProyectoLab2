/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;
import java.util.*;
/**
 *
 * @author JoseLuis
 */
public class Ticket {
    int referencia;
    double precio;
    Calendar fecha;
    
 public Ticket(int referencia, double precio){

     this.referencia=0;
     this.precio=0;
     this.fecha.getTime();
 }
 
 public int getReferencia(){
     return  referencia;
 }
 
 public double getPrecio(){
     return precio;
 }
 
 public void getFecha(){
     System.out.println("hoy: "+fecha);
 }

 public void print(){
     System.out.println("[ Numero: "+referencia+" Precio: "+precio+" Fecha: "+fecha+" ]");
 }
}

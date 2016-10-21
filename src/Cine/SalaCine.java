/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import java.util.Calendar;

/**
 *
 * @author JoseLuis
 */
public class SalaCine {
    
    Ticket assientos[][] = new Ticket[10][30];
    private int ticketven;
    Calendar hoy;
    public SalaCine(){
        ticketven=0;
    }
    
    
    public Coordenada searchTicket(int num,int f,int c,int Farre,int Carre){
     if(f <= Farre){
            if(c <= Carre){
                Ticket puesto = assientos[f][c];
               if(puesto.referencia == num){
                     Coordenada cord =new Coordenada(f,c);
               return cord;}
               searchTicket(num,f,c+1,Farre,Carre);
            }
            else{
                searchTicket(num,f+1,0,Farre,Carre);
            }
        }
        return null;
    }
    
    public void reset(int f,int c,int Farre,int Carre){
     if(f <= Farre){
            if(c <= Carre){
                 assientos[f][c]=null;
                 reset(f,c+1,Farre,Carre);
            }
            else{
                reset(f,c+1,Farre,Carre);
            }
        }
    }
    
    public boolean palindromo(String palabra,String palabra2,int letras){
        if(letras>=0){
            palabra2+=palabra.charAt(letras);
            palindromo(palabra,palabra2,letras-1);
        }else if(palabra.equalsIgnoreCase(palabra2)){
            return true;
        }
        return false;
    }
    
    public double income(int f,int c,int Farre,int Carre,double suma){
    if(f <= Farre){
            if(c <= Carre){
                Ticket puesto = assientos[f][c];
                suma+=puesto.precio;
                income(f,c+1,Farre,Carre,suma);
            }
            else{
               income(f+1,0,Farre,Carre,suma);
            }
        }
    
    return suma;
    }//Fin Income

    public void sellTicket(String Cliente,int Fila,int Columna){
        if(assientos[Fila][Columna]==null){
            Ticket puesto =assientos[Fila][Columna];
            ticketven+=1;
            if(hoy.equals(Calendar.TUESDAY)){
            puesto.precio=50;
            }else if(hoy.equals(Calendar.THURSDAY) && palindromo(Cliente,"",Cliente.length())){
                puesto.precio=100*0.7;
            }else{
            puesto.precio=100;
            }
            puesto.referencia=ticketven;
        }
            
    }

    
}

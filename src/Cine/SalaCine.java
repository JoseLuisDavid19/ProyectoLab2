/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author JoseLuis
 */
public class SalaCine {
    
    Ticket assientos[][] = new Ticket[10][30];
    int ticketven=0;
    
    public Coordenada searchTicket(int num,int f,int c,int Farre,int Carre){
     if(f <= Farre){
            if(c <= Carre){
                Ticket puesto = assientos[f][c];
               // if(puesto == num){
                     //Coordenada cord =new Coordenada(f,c);
               //return cord;}
               searchTicket(num,f,c+1,Farre,Carre);
            }
            else{
                searchTicket(num,f+1,0,Farre,Carre);
            }
        }
        return null;
    }
}

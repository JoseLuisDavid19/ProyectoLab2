/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import java.util.Scanner;

/**
 *
 * @author JoseLuis
 */
public class Cines {
    
    
public Cines(){
    Scanner in=new Scanner(System.in);
    SalaCine sala = new SalaCine();
    int opcion=0;
    do{
        System.out.println("1. Sellticket");
        System.out.println("2. PrintSala");
        System.out.println("3. CancelTicket");
        System.out.println("4. EventClose");
        System.out.println("5. Salir");
        
       switch(opcion){
           case 1: 
               System.out.print("Nombre: ");
               String cliente=in.nextLine();
               int fila=in.nextInt();
               int columna=in.nextInt();
               sala.sellTicket(cliente, fila, opcion);
               break;
           case 2:
               
               break;
           case 3:
               
               break;
           case 4:
               
               break;
           default:
               System.out.println("Hasta Pronto.....");
               break;
       }
    }while(opcion != 5);
}
}

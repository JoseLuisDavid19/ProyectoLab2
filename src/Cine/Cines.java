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
public class Cines {
    
    
public Cines(){
    Cines SalaCine = new Cines();
    int opcion=0;
    do{
        System.out.println("1. Sellticket");
        System.out.println("2. PrintSala");
        System.out.println("3. CancelTicket");
        System.out.println("4. EventClose");
        System.out.println("5. Salir");
        
       switch(opcion){
           case 1:   
            /*   SalaCine.sellTicket();*/
               break;
           case 2:
             /*  SalaCine.printSala(); */
               break;
           case 3:
             /*  SalaCine.cancelTicket(); */
               break;
           case 4:
             /*  SalaCine.eventClose(); */
               break;
           default:
               System.out.println("Hasta Pronto.....");
               break;
       }
    }while(opcion != 5);
}
}

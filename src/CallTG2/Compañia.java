/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

/**
 *

 */
public class Compañia extends Tigo {
    public static void main(String[] args) {
        int opcion=0;
        System.out.println("1. addPlan");
        System.out.println("2. search");
        System.out.println("3. makeCall");
        System.out.println("4. dayPlan");
        System.out.println("5. ActivateCard");
        System.out.println("6. viewPlan");
        System.out.println("7. Salir");
        do{
            switch(opcion){
                case 1:
                    /*addPlan();*/
                break;
                case 2:
                    /*search();*/
                break;
                case 3:
                    /*makeCall();*/
                break;
                case 4:
                    /*dayPlan();*/
                break;
                case 5:
                    /*activateCard();*/
                break;
                case 6:
                    /*viewPlan();*/
                break;
                default :
                    System.out.println("Hasta pronto......");
                break;
            }
        }while(opcion != 7);
    }
    
}

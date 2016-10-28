/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

import java.util.ArrayList;

/**
 *
 * @author JoseLuis
 */
public class Tigo {
private ArrayList <PlanBasico> tipoPlan =new ArrayList<>();

public void addPlan(int numTel,String nombre,String Tipo){
    if(Tipo.equalsIgnoreCase("Basico"))
        tipoPlan.add(new PlanBasico(numTel,nombre));  
    if(Tipo.equalsIgnoreCase("Smart"))
        tipoPlan.add(new PlanSmart(numTel,nombre));  
    if(Tipo.equalsIgnoreCase("Tarjeta"))
        tipoPlan.add(new PlanTarjeta(numTel,nombre));  
}

public PlanBasico search(int numTel){
    
    for(PlanBasico Plan : tipoPlan){
        if(Plan.getNumero()== numTel)
            return Plan;
    }
    return null;
    
}

public double payPlan(int numTel){
        return  search(numTel).pagoMensual();

}
public void activateCard(int numTel,double monto){

}
}

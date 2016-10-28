/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

/**
 *
 * @author JoseLuis
 */
public class PlanSmart extends PlanBasico {
    public PlanSmart(){
    super();
    }
    public double pagoMensual(){
    PlanBasico plan=new  PlanBasico();
        /*double minutosHablados=plan.monthlyMinutes();
          double total=minutos -300;
          if(total>0)
               return=(total*0.5)+22+20;
        */
        return 42;
        
        /*
        public String toString(){
            return super.toString()+"PlanSmart"
        }
        */
    }
}

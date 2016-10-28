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
    public PlanSmart(int codigo,String nombre){
    super(codigo,nombre);
    
    }
    public double pagoMensual(){
        double minutosHablados=monthlyMinutes();
          double total=minutosHablados -300;
          if(total>0)
               return (total*0.5)+22+20;
        
        return 42;
    }
        
    @Override
        public String toString(){
            return super.toString() + "Plan Smart";
        }
        
    }


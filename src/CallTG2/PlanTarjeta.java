/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallTG2;

import java.util.Calendar;

/**
 *
 * @author JoseLuis
 */
public class PlanTarjeta extends PlanBasico {
    private double saldo;
    private PlanBasico plan=new PlanBasico();
    public PlanTarjeta(){
    super();
    saldo=0;
    }
    
    public void aplicarTarjeta(double monto){
    Calendar hoy = Calendar.getInstance();
    if(monto >0){
        if(hoy.get(Calendar.SUNDAY)==1)
            saldo+=monto*3;
    saldo+=monto;
    }
    }
    
    public void call(int numero,double minutos){
    double costoLlamada= minutos*.7;
    //if(costoLlamada<=saldo)
     //   plan.call(numero,minutos); saldo-=costoLlamada;
    
    }
    public double pagoMensual(){
        return 0;
    }
    
}

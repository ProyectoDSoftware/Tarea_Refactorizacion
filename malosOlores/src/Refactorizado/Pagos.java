/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pagos {
    private final float rmu = (float) 386.0;

    //calcula el salario dependiendo del tipo de trabajador y entrega el décimo correspondiente cada 2 meses
    public float cs(Employee employee) {
        Date date = new Date();
        //Obtiene la hora local
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //Obtiene el mes en forma de entero
        int month = localDate.getMonthValue();
        switch (employee.getEmployeeType()) {
            case Worker:
                //Si el mes es impar entonces le entrega el decimo junto con su salario
                return Decimo(month, 0);
            case Supervisor:
                float valueS = employee.getSalary() + (employee.getBonusPercentage() * 0.5F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return Decimo(month, valueS);
            case Manager:
                float valueM = employee.getSalary()+ (employee.getBonusPercentage() * 0.7F);
                //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
                return Decimo(month, valueM);
        }
        return 0.0F;
    }

    public float Decimo(int month,float value){
        return month % 2 == 0 ? value : value + rmu / 12 * 2;
    }
    
    public float (){
        
    }
    //calcula el bonus anual
    public float CalculateYearBonus(Employee employee) {
        switch (employee.getEmployeeType()) {
            case Worker:
                return 0;
            case Supervisor:
                return Bono(employee.getSalary(), 0.7F);
            case Manager:
                return Bono(employee.getSalary(), 1.0F);
        }
        return 0.0F;
    }
    
    public float Bono(float salary, float num){
        return salary + salary * num;
    }
    
}

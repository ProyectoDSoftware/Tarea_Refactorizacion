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
       boolean isworker=employee.getEmployeeType().equals(EmployeeType.Worker);
       boolean isSupervisor=employee.getEmployeeType().equals(EmployeeType.Supervisor);
       boolean isManager=employee.getEmployeeType().equals(EmployeeType.Manager); 
       if(isworker){
            return Decimo(month, 0);
       }else if(isSupervisor){
            float valueS = employee.getSalary() + (employee.getBonusPercentage() * 0.5F);
            //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
            return Decimo(month, valueS);
       }else if(isManager){
            float valueM = employee.getSalary()+ (employee.getBonusPercentage() * 0.7F);
            //Si el mes es impar entonces le entrega el decimo junto con su salario y un bono
            return Decimo(month, valueM);
       }
       return 0.0F;
    }    
       

    public float Decimo(int month,float value){
        return month % 2 == 0 ? value : value + rmu / 12 * 2;
    }
    

    //calcula el bonus anual
    public float CalculateYearBonus(Employee employee) {
       boolean isworker=employee.getEmployeeType().equals(EmployeeType.Worker);
       boolean isSupervisor=employee.getEmployeeType().equals(EmployeeType.Supervisor);
       boolean isManager=employee.getEmployeeType().equals(EmployeeType.Manager); 
       if(isworker){
            return 0;
       }else if(isSupervisor){
            return Bono(employee.getSalary(), 0.7F); 
       }else if(isManager){
            return Bono(employee.getSalary(), 1.0F);
       }
       return 0.0F;
    }    
    public float Bono(float salary, float num){
        return salary + salary * num;
    }
 
}

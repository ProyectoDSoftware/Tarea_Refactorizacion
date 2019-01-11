/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;


public class Employee extends Persona{   

    //salario del employee
    private float salary;
    //porcentaje de bonus
    private float bonusPercentage;
    //variable de tipo employeeType
    private EmployeeType employeeType;    

    public Employee(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        super("Desconocido","Desconocido","0000000000");
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;
        super.getLocation().Location("Ecuador", "Gye", "Guayas", "ESPOL Prosperina");
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

}

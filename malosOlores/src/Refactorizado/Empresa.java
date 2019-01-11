/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

import java.util.ArrayList;
import java.util.List;




public class Empresa {
    
    public List<Cliente> clientes;
    public List<Employee> empleados;
    
    public Empresa(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Employee>();
    }
    
    public void MostrarInformacion(String clien,Persona persona){
        System.out.println(clien+" :");
        System.out.println("Nombre: " + persona.Nombre + ", Apellido: " + persona.Apellido + ", con numero de cedula: " + persona.Cedula );
        System.out.println("Direccion: " + persona.getLocation().mostrarLocation());
        System.out.println("----------------------");
    }
    
    public void GuardarCliente(String Nombre, String Apellido, String Cedula){
        validarInformacion(Nombre, Apellido, Cedula);
        Cliente cliente = new Cliente(Nombre, Apellido, Cedula);
        cliente.setLocation("Ecuador", "Guayaquil", "Guayas", "Alborada 3era etapa");
        this.clientes.add(cliente);
        System.out.println(Nombre +" " + Apellido + " ha sido agregado como nuevo cliente");
        
    }
    
    public void validarInformacion(String Nombre, String Apellido, String Cedula ){
        final boolean vnombre= Nombre.equals("") && Nombre.length()> 16;
        final boolean vapellido= Apellido.equals("") && Apellido.length()> 16;
        final boolean vcedula=!Cedula.equals("") && Cedula.length()< 10;
        Validacion("nombre", vnombre);
        Validacion("apellido", vapellido);
        Validacion("cedula", vcedula);
    }
    
    public void Validacion(String palabra,boolean valor){
        if (valor) {
            System.out.println("ingreso de "+palabra+" incorrecto");
        } else {
            System.out.println("ingreso de "+palabra+"  correcto");
        }
    }
    
    public void mostrarTodo() {
        
        //Mostrar los clientes 
        for(Cliente cliente : this.clientes){
            MostrarInformacion("Cliente",cliente);           
        }
        
        //Mostrar los empleados 
        for(Employee empleado : this.empleados){
            MostrarInformacion("Empleado",empleado);           
        }
    }
    
    
}

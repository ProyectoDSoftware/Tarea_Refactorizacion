/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    public String Nombre;
    public String Apellido;
    public String Cedula;
    private Location lugar;

    public Location getLocation() {
        return lugar;
    }

    public void setLocation(String nuevoPais, String ciudadnueva, String provinciaNueva, String direccionNueva) {
        lugar=new Location(nuevoPais, ciudadnueva, provinciaNueva, direccionNueva);
    }


    public Persona(String Nombre, String Apellido, String Cedula) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author joimar
 */
public class Modelo_Cliente extends Modelo_Persona{
    private String Telefono;
    private String Correo; 
    private String Direccion;

    public Modelo_Cliente(String Telefono, String Correo, String Direccion, int Id, String Nombre, String Apellido, String Cedula, Date Fecha_Nac) {
        super(Id, Nombre, Apellido, Cedula, Fecha_Nac);
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
    }

    public Modelo_Cliente(String Telefono, String Correo, String Direccion) {
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}

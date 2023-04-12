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
public class Modelo_Cliente extends Modelo_Persona {

    private String Telefono;
    private String Correo;
    private String Direccion;
    private int Persona_Id;

    public Modelo_Cliente(String Telefono, String Correo, String Direccion, int Id, String Nombre, String Apellido, int Cedula, Date Fecha_Nac, int Persona_Id) {
        super(Id, Nombre, Apellido, Cedula, Fecha_Nac);
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Persona_Id = Persona_Id;
    }

    public Modelo_Cliente(String Telefono, String Correo, String Direccion, int Persona_Id) {
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Persona_Id = Persona_Id;
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

    public int getPersona_Id() {
        return Persona_Id;
    }

    public void setPersona_Id(int Persona_Id) {
        this.Persona_Id = Persona_Id;
    }

}

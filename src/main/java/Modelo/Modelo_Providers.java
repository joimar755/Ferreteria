

import java.util.Date;

import Modelo.Modelo_Persona;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
=======
>>>>>>> a30ceac (mm)
package Modelo;

import java.util.Date;

/**
 *
 * @author joimar
 */
public class Modelo_Providers extends Modelo_Persona {
    private int Providers_id;
    private String Nit;
    private String Razon_social;
    private int Persona_Id;
    private int Departamentos_id;
    private int Municipios;
    private int Direccion_id;

    public Modelo_Providers(int Providers_id, String Nit, String Razon_social, int Persona_Id, int Departamentos_id, int Municipios, int Direccion_id, int Id, String Nombre, String Apellido, int Cedula, Date Fecha_Nac) {
        super(Id, Nombre, Apellido, Cedula, Fecha_Nac);
        this.Providers_id = Providers_id;
        this.Nit = Nit;
        this.Razon_social = Razon_social;
        this.Persona_Id = Persona_Id;
        this.Departamentos_id = Departamentos_id;
        this.Municipios = Municipios;
        this.Direccion_id = Direccion_id;
    }

    public Modelo_Providers(int Providers_id, String Nit, String Razon_social, int Persona_Id, int Departamentos_id, int Municipios, int Direccion_id) {
        this.Providers_id = Providers_id;
        this.Nit = Nit;
        this.Razon_social = Razon_social;
        this.Persona_Id = Persona_Id;
        this.Departamentos_id = Departamentos_id;
        this.Municipios = Municipios;
        this.Direccion_id = Direccion_id;
    }

    public int getProviders_id() {
        return Providers_id;
    }

    public void setProviders_id(int Providers_id) {
        this.Providers_id = Providers_id;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public String getRazon_social() {
        return Razon_social;
    }

    public void setRazon_social(String Razon_social) {
        this.Razon_social = Razon_social;
    }

    public int getPersona_Id() {
        return Persona_Id;
    }

    public void setPersona_Id(int Persona_Id) {
        this.Persona_Id = Persona_Id;
    }

    public int getDepartamentos_id() {
        return Departamentos_id;
    }

    public void setDepartamentos_id(int Departamentos_id) {
        this.Departamentos_id = Departamentos_id;
    }

    public int getMunicipios() {
        return Municipios;
    }

    public void setMunicipios(int Municipios) {
        this.Municipios = Municipios;
    }

    public int getDireccion_id() {
        return Direccion_id;
    }

    public void setDireccion_id(int Direccion_id) {
        this.Direccion_id = Direccion_id;
    }
    
   
    
}

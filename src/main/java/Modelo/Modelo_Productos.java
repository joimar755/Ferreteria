/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joimar
 */
public class Modelo_Productos{
    private int  Productos_id;
    private String Nombre;
    private int Precio_Unit;
    private int stock;
    private int Providers_id;
    private int Cliente_id;

    public Modelo_Productos(int Productos_id, String Nombre, int Precio_Unit, int stock, int Providers_id, int Cliente_id) {
        this.Productos_id = Productos_id;
        this.Nombre = Nombre;
        this.Precio_Unit = Precio_Unit;
        this.stock = stock;
        this.Providers_id = Providers_id;
        this.Cliente_id = Cliente_id;
    }

    public Modelo_Productos() {
    }

    public int getProductos_id() {
        return Productos_id;
    }

    public void setProductos_id(int Productos_id) {
        this.Productos_id = Productos_id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio_Unit() {
        return Precio_Unit;
    }

    public void setPrecio_Unit(int Precio_Unit) {
        this.Precio_Unit = Precio_Unit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getProviders_id() {
        return Providers_id;
    }

    public void setProviders_id(int Providers_id) {
        this.Providers_id = Providers_id;
    }

    public int getCliente_id() {
        return Cliente_id;
    }

    public void setCliente_id(int Cliente_id) {
        this.Cliente_id = Cliente_id;
    }
    
}

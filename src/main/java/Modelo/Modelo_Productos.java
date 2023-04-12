/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joimar
 */
public class Modelo_Productos {
    private int Productos_id;
    private String nombre;
    private int Price_UNit;
    private int Stock;
    private int  Providers_id;
    private int UsersId;

    public Modelo_Productos(int Productos_id, String nombre, int Price_UNit, int Stock, int Providers_id, int UsersId) {
        this.Productos_id = Productos_id;
        this.nombre = nombre;
        this.Price_UNit = Price_UNit;
        this.Stock = Stock;
        this.Providers_id = Providers_id;
        this.UsersId = UsersId;
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrice_UNit() {
        return Price_UNit;
    }

    public void setPrice_UNit(int Price_UNit) {
        this.Price_UNit = Price_UNit;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getProviders_id() {
        return Providers_id;
    }

    public void setProviders_id(int Providers_id) {
        this.Providers_id = Providers_id;
    }

    public int getUsersId() {
        return UsersId;
    }

    public void setUsersId(int UsersId) {
        this.UsersId = UsersId;
    }
    
}

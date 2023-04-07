/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author joimar
 */
public class Conexion {

    public static Connection getConexion() {
        String conexionurl = "jdbc:sqlserver://localhost:1433;"
                + "database=Facturacion;"
                + "user=sa;"
                + "password=yourStrong(!)Password;"
                + "loginTimeout=30;"
                + "encrypt=false;";
        try {
            Connection con = DriverManager.getConnection(conexionurl);
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }

    }



    public static void main(String[] args) {
        System.out.println(getConexion());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joimar
 */
public class Sql_usuarios extends Conexion {

    public boolean registrar(Modelo_Usuarios usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String Sql = "INSERT INTO Users(FirstName, LastName, Type_doc, Number_doc, Email,Pass, TypeUserId)VALUES(?,?,?,?,?,?,?)";
        System.out.println(Sql);
        try {
            ps = con.prepareStatement(Sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getApellido());
            ps.setString(3, usr.getTipo_Doc());
            ps.setInt(4, usr.getCedula());
            ps.setString(5, usr.getCorreo());
            ps.setString(6, usr.getPassword());
            ps.setInt(7, usr.getTipo_user());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(Sql_usuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}

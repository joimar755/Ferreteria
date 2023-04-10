/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo_Usuarios;
import Modelo.Sql_usuarios;
import Modelo.hash;
import Vista.Registro_usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author joimar
 */
public class Controlador_Usuarios implements ActionListener {

    private Registro_usuarios Vista_Usu;
    private Modelo_Usuarios U;
    private Sql_usuarios Consulta;
    private hash encryp;

    public Controlador_Usuarios(Registro_usuarios Vista_Usu, Modelo_Usuarios U, Sql_usuarios Consulta, hash encryp) {
        this.Vista_Usu = Vista_Usu;
        this.U = U;
        this.Consulta = Consulta;
        this.encryp = encryp;
        Vista_Usu.Btn_crear.addActionListener(this);
    }

    public void iniciar() {
        Vista_Usu.setTitle("Registro Users");
        Vista_Usu.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Vista_Usu.Btn_crear) {
            ValidarCamposLLenos();
        }
    }

    public void insertar() {
        String Pass = new String(Vista_Usu.Txt_contraseña.getPassword());
        String ValPass = new String(Vista_Usu.Txt_confirmar.getPassword());
        if (Pass.equals(ValPass)) {
            if (Consulta.existe_Usuarios(Vista_Usu.Txt_nombre.getText()) == 0) {
                if (Consulta.validarEmail(Vista_Usu.Txt_Correo.getText())) {
                    int Tipo_users = Vista_Usu.cbx_Tipo_Users.getSelectedIndex() + 1;
                    String NuevoPass = hash.sha1(Pass);
                    U.setNombre(Vista_Usu.Txt_nombre.getText());
                    U.setApellido(Vista_Usu.Txt_apellido.getText());
                    U.setTipo_Doc(Vista_Usu.Cbx_Tipo.getSelectedItem().toString());
                    int Cedula = Integer.parseInt(Vista_Usu.Txt_Cedula.getText());
                    U.setCedula(Cedula);
                    U.setCorreo(Vista_Usu.Txt_Correo.getText());
                    U.setPassword(NuevoPass);
                    U.setTipo_user(Tipo_users);
                    if (Consulta.registrar(U)) {
                        JOptionPane.showMessageDialog(null, "registrado correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "no registro correctamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "el correo eslectronico no es valido");

                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");

            }
        } else {
            JOptionPane.showMessageDialog(null, "la contraseña no coinciden");
        }

    }

    public static boolean esNumero(String texto) {
        try {
            Long.parseLong(texto);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void ValidarCamposLLenos() {
        String Cedula = Vista_Usu.Txt_Cedula.getText();

        if (Vista_Usu.Txt_nombre.getText().length() == 0 || Vista_Usu.Txt_apellido.getText().length() == 0
                || Vista_Usu.Txt_Cedula.getText().length() == 0
                || Vista_Usu.Txt_Correo.getText().length() == 0
                || Vista_Usu.Txt_contraseña.getPassword().length == 0
                || Vista_Usu.Txt_confirmar.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "llene los campos");
        } else if (!esNumero(Vista_Usu.Txt_Cedula.getText())) {
            JOptionPane.showMessageDialog(null, "El campo Cédula debe contener solo números.");
        } else {
            insertar();
        }
    }
    

}

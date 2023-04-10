/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo_Factura;
import Modelo.Modelo_Productos;
import Modelo.Sql_Factura;
import Vista.Vista_Factura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author joimar
 */
public class Controlador_Factura implements ActionListener {

    private Vista_Factura v_factura;
    private Modelo_Factura F;
    private Modelo_Productos P;
    private Sql_Factura Consulta_factura;

    public Controlador_Factura(Vista_Factura v_factura, Modelo_Factura F, Sql_Factura Consulta_factura, Modelo_Productos P) {
        this.v_factura = v_factura;
        this.P = P;
        this.Consulta_factura = Consulta_factura;
        this.F = F;
        v_factura.Btn_buscar.addActionListener(this);
        enca();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v_factura.Btn_buscar) {
            JOptionPane.showMessageDialog(null, "pulsado");
        }
    }

    public void enca() {
        F.Enca(v_factura);
    }

}

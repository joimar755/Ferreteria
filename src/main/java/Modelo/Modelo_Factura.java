/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Vista_Factura;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joimar
 */
public class Modelo_Factura {

    public void Enca(Vista_Factura vistaFactura) {
        DefaultTableModel dtm = new DefaultTableModel();
        String[] title = {"id", "Nombre Del Producto", "Cantidad", "valor", "total"};
        dtm.setColumnIdentifiers(title);
        vistaFactura.Tabla_Fac.setModel(dtm);

    }

}

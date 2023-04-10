/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ferreteria;

import Controlador.Controlador_Factura;
import Controlador.Controlador_Usuarios;
import Modelo.Modelo_Factura;
import Modelo.Modelo_Productos;
import Modelo.Modelo_Usuarios;
import Modelo.Sql_Factura;
import Modelo.Sql_usuarios;
import Modelo.hash;
import Vista.Registro_usuarios;
import Vista.Vista_Factura;
import Vista.Vista_Inicio;

/**
 *
 * @author joimar
 */
public class Ferreteria {

    public static void main(String[] args) {
        Registro_usuarios r = new Registro_usuarios();
        Vista_Inicio inicio = new Vista_Inicio();
        Vista_Factura factura = new Vista_Factura();
        Modelo_Usuarios users = new Modelo_Usuarios();
        Sql_usuarios consulta = new Sql_usuarios();
        Modelo_Factura P = new Modelo_Factura();
        Sql_Factura Consulta_factura = new Sql_Factura();
        Modelo_Productos F = new Modelo_Productos();
        hash encrypt = new hash();
        
        
        Controlador_Usuarios controlador = new Controlador_Usuarios(r, users, consulta, encrypt);
        Controlador_Factura controlador_F = new Controlador_Factura(factura, P, Consulta_factura, F);
        controlador.iniciar();
        r.setVisible(false);
        inicio.setVisible(false);
        factura.setVisible(true);

        /* 
       Vista_Inicio v = new Vista_Inicio();
       v.setTitle("nuevo Contacto");
       v.setVisible(true);
         */
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ferreteria;

import Controlador.Controlador_Usuarios;
import Modelo.Modelo_Usuarios;
import Modelo.Sql_usuarios;
import Modelo.hash;
import Vista.Registro_usuarios;
import Vista.Vista_Inicio;

/**
 *
 * @author joimar
 */
public class Ferreteria {

    public static void main(String[] args) {
        Registro_usuarios r = new Registro_usuarios() ;
        Modelo_Usuarios users = new Modelo_Usuarios();
        Sql_usuarios consulta = new Sql_usuarios();
        hash encrypt = new hash();
        Controlador_Usuarios controlador = new Controlador_Usuarios(r, users, consulta, encrypt);
        controlador.iniciar();
        r.setVisible(true);
        
         
        
        
        /* 
       Vista_Inicio v = new Vista_Inicio();
       v.setTitle("nuevo Contacto");
       v.setVisible(true);
         */
    }
}

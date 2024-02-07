/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_software;

import javax.swing.JOptionPane;
import prueba_software.Operaciones;

/**
 *
 * @author usuario_RCUL12
 */
public class Prueba_software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3;
        n1 = Leer_int("digite numero 1: ");
        n2 = Leer_int("digite numero 2: ");
        n3 = Leer_int("digite numero 3: ");
        Operaciones op = new Operaciones(); 
        Mostrar("el mayor es:" + op.mayor(n1, n2, n3));
        System.exit(0);

    }

    static int Leer_int(String Mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(Mensaje));
    }

    static void Mostrar(String Mensaje) {
         JOptionPane.showMessageDialog(null, Mensaje);
         
    }

}

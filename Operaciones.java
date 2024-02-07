/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_software;

/**
 *
 * @author usuario_RCUL12
 */
public class Operaciones {
    public int mayor(int num1, int num2, int num3) {
        int mayor = Integer.MIN_VALUE;
        if ((num1 >= num2) && (num1 >= num3)) {
            mayor = num1;
        } else if ((num2 >= num1) && (num2 >= num3)) { 
            mayor = num2;
        } else {
            mayor = num3;
        }
        return mayor;

    }
}

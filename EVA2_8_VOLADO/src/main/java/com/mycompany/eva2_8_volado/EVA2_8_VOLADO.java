/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_volado;

/**
 *
 * @author DOWER
 */
public class EVA2_8_VOLADO {

    public static void main(String[] args) {
        //numero aleatorio en Java:
        //valores entre 0 y 1
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda = "+moneda);
        //o.5 es la mitad del rango
        if(moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
    }
}

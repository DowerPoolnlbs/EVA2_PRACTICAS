/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_4_VENTAS {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        int piezas,calSaldo;
        System.out.println("¿Cuantas piezas quieres comprar?");
        piezas = ver.nextInt();
        if(piezas > 1000)
            calSaldo = piezas * 500;
        else
            calSaldo = piezas * 800;
        System.out.println("El saldo es "+calSaldo);
    }
}

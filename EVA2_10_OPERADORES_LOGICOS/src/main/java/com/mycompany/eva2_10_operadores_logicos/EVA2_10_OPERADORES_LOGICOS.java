/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_10_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        double mone = Math.random();
        int num;
        Scanner ver = new Scanner(System.in);
        System.out.println("Cara = 1 o Cruz = 2");
        num = ver.nextInt();
        System.out.println("El valor de la moneda = "+mone);
        //0.5 es la mitad del rango, > 0.5 CARA, MENOR ES CRUZ
        if(mone > 0.5 && num == 1){
            System.out.println("Adivinastes, es cara!!");
        }
        else
            if(mone <= 0.5 && num == 1)
                System.out.println("Adivinastes, es cruz!!");
            else
                System.out.println("Perdistes");
    }
}

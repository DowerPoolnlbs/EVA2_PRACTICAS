/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_9_VOLADO2 {

    public static void main(String[] args) {
        double mone = Math.random();
        int num, mon;
        String jug;
        Scanner ver = new Scanner(System.in);
        System.out.println("Cara = 1 o Cruz = 2");
        num = ver.nextInt();
        if(num <= 1)
            jug = "Cara";
        else
            jug = "Cruz";
        if(mone > 0.5){
            System.out.println("Tu elegistes "+jug+" La moneda cayo Cara");
            mon =+ 1;
        }
        else{
            System.out.println("Tu elegistes "+jug+" La moneda cayo Cruz");
            mon = 0;
        }
        if(num == mon)
            System.out.println("Ganastes");
        else
            System.out.println("Perdistes");
    }
}

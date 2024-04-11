/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_17_BISIESTO {

    public static void main(String[] args) {
        int año;
        double resu;
        Scanner ver = new Scanner(System.in);
        System.out.println("Indtroduce el año a evaluar: ");
        año = ver.nextInt();
        resu = año;
        
        if(resu % 400 == 0)
            System.out.println("son bisiesto");
        else if(resu % 4 == 0 && resu %100 != 0)
            System.out.println("son bisiesto");
        else
            System.out.println("no es bisiesto");
    }
}

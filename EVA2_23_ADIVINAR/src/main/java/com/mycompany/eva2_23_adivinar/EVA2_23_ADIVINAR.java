/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_23_adivinar;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_23_ADIVINAR {

    public static void main(String[] args) {
        int nume = 5;
        int valor= 0;
        Scanner ver = new Scanner(System.in);
        
        do{
            System.out.println("¿Cual es el numero? (Entres de uno a diez):");
            valor = ver.nextInt();
        }while(nume != valor);
        System.out.println("ADIVINASTES!!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_24_adivinar_while;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_24_ADIVINAR_WHILE {

    public static void main(String[] args) {
        int nume = 5;
        int valor= 0;
        Scanner ver = new Scanner(System.in);
        
        while(nume != valor){
            System.out.println("¿Cual es el numero? (Entres de uno a diez):");
            valor = ver.nextInt();
        }
        System.out.println("ADIVINASTES!!");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_20_FOR_3 {

    public static void main(String[] args) {
        //Primer Problema
        Scanner ver = new Scanner(System.in);
        String mens,vece = "";
        int cant,num,num1,sum = 0;
        System.out.println("Pon tu mensaje que quieras imprimir");
        mens = ver.nextLine();
        System.out.println("¿Cuantas veces quieres repetir el mensaje?");
        cant = ver.nextInt();
        for (int i = 1; i <= cant; i++) {
            System.out.println(mens);
        }
        //Segundo problema
        System.out.println("Pon un numero entero");
        num = ver.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
            System.out.print(sum+" ");
        }
        System.out.println("");
        //Tercer Problema
        System.out.println("Pon tu numero que quieras que cuenten");
        num1 = ver.nextInt();
        for (int i = 0; i < num1; i++) {
            vece += "*";
            System.out.println(vece);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_3_IF {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        double califa;
        System.out.println("Introduce una calificacion");
        califa = ver.nextDouble();
        if(califa >= 70)//esta seccion es --> true
            //{} opcionales, solo cuando tenemos mas
            //de una instrucion
            System.out.println("Acredistastes");
        else //la evualuaciion false es opcional
            System.out.println("Mejor suerte para la proxima");
        //aui continua el programa
    }
}

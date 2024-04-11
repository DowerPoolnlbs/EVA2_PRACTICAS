/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_19_FOR_2 {

    public static void main(String[] args) {
        //PREGUNTAR CANTIDAD DE ESTUDIANTES EN EL GRUPO
        int NumAlum;
        Scanner ver = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        NumAlum = ver.nextInt();
        //hay que capturar todas las calificaciones:
        for (int i = 1; i <= NumAlum; i++) {
            System.out.println("Calificacion: ");
            int cali = ver.nextInt();
        }
    }
}

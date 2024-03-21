/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_servicio_social;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_12_SERVICIO_SOCIAL {

    public static void main(String[] args) {
        int creditos, semestre;
        Scanner ver = new Scanner(System.in);
        System.out.println("¿Que semestre cursas?");
        semestre = ver.nextInt();
        System.out.println("¿Cuantos creditos llevas?");
        creditos = ver.nextInt();
        //INDICAR SI PUEDE O NO REALIZAR EL SERVICIO SOCIAL
        //IR EN 6TO SEMESTRE O SUPERIOR
        //TENER AL MENOS 150 CREDITOS
        if(semestre >= 6 && creditos >= 150)
            System.out.println("Puedes realizar el serviocio social");
        else
            System.out.println("No puedes realizar el servicio social");
        
    }
}

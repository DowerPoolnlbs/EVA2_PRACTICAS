/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_5_IF {

    public static void main(String[] args) {
        int temp;
        Scanner ver = new Scanner(System.in);
        //CAPTURA TEMPERATURA
        System.out.println("Temperatura (°C): ");
        temp = ver.nextInt();
        //VAMOS A EVALUAR
        //Si la temperatura es mayor a °22, se enciende el 
        //clima
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
    }
}

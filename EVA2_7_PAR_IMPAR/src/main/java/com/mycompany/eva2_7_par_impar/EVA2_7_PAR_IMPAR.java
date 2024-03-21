/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_7_PAR_IMPAR {

    public static void main(String[] args) {
        int num, divi, resi;
        Scanner ver = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        num = ver.nextInt();
        divi = num / 2;
        System.out.println("Divicion entera de "+num+" / 2 "+divi);
        resi = num % 2;
        System.out.println("Divicion entera de "+num+" / 2 "+resi);
        //NUMERO PAR O IMPAR
        if(resi == 1)
            System.out.println(num+" es impar");
        else
            System.out.println(num+" es par");
    }
}

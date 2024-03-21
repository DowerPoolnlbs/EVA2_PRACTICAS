/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_califa_eeuu;

import java.util.Scanner;

/**
 *
 * @author DOWER
 */
public class EVA2_14_CALIFA_EEUU {

    public static void main(String[] args) {
        int cali;
        Scanner ver = new Scanner(System.in);
        System.out.println("Introduce la calificacion (0 - 100): ");
        cali = ver.nextInt();
        
        if(cali >= 90 && cali <= 100)
            System.out.println("Sacastes un A");
        else if(cali <= 89 && cali >= 80)
            System.out.println("Sacastes un B");
        else if(cali <= 79 && cali >= 70)
            System.out.println("Sacastes un C");
        else if(cali <= 69 && cali >= 60)
            System.out.println("Sacastes un D");
        else if(cali <= 59 && cali >= 0)
            System.out.println("Sacastes un F");
        else
            System.out.println("Te pasastes");
    }
}

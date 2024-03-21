/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_operadores_logicos2;

/**
 *
 * @author DOWER
 */
public class EVA2_11_OPERADORES_LOGICOS2 {

    public static void main(String[] args) {
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        //HAYA DINERO Y HAYA C¿BUEN CLIMA
        hayDinero = false;
        hayBuenClima = false;
        System.out.println("1.NO HAY DINERO Y NO HAY BUEN CLIMA");
        if(hayDinero == true && hayBuenClima == true)
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("HUEVITO!!");
        
        hayDinero = false;
        hayBuenClima = true;
        System.out.println("2.NO HAY DINERO Y NO HAY BUEN CLIMA");
        if(hayDinero == true && hayBuenClima == true)
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("HUEVITO!!");
        
        hayDinero = true;
        hayBuenClima = false;
        System.out.println("3.NO HAY DINERO Y NO HAY BUEN CLIMA");
        if(hayDinero == true && hayBuenClima == true)
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("HUEVITO!!");
        
        hayDinero = true;
        hayBuenClima = true;
        System.out.println("4.NO HAY DINERO Y NO HAY BUEN CLIMA");
        if(hayDinero == true && hayBuenClima == true)
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("HUEVITO!!");
    }
}

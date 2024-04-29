/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_cubo2;

/**
 *
 * @author DOWER
 */
public class EVA3_8_CUBO2 {

    public static void main(String[] args) {
        int cubo[][][][][] = new int[40][20][10][5][3];
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            cubo[i][j][k][l][m] = (int)(Math.random() *100);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    for (int l = 0; l < cubo[i][j][k].length; l++) {
                        for (int m = 0; m < cubo[i][j][k][l].length; m++) {
                            System.out.println("[" + cubo[i][j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
    }
}

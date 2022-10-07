/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

/**
 *
 * @author Dam
 */
public class Excepcion4 {

    static void divide() {
        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length + 1; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (java.lang.ArithmeticException e){
                System.out.println("Es una división entre 0");
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("El array está fuera de rango" + e.getMessage());
            }
        }
    }
}
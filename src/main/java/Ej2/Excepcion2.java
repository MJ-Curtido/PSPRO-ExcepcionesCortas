/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author Dam
 */
class Excepcion2 {

    void miMetodo() {
        try {
            int numero[] = new int[5];
            System.out.println("Accesando a una posicion fuera del vector");
            numero[7] = 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
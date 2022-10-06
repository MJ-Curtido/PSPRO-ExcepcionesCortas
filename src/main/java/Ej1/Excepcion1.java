/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author Dam
 */
public class Excepcion1 {
    public static void main(String args[]) {
        try {
            int numero[] = new int[5];
            numero[7] = 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
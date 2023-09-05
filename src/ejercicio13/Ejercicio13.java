/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;


    public class Ejercicio13 {


        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            double valcomp, valpag, pdes;
            String color;

            System.out.println("Ingrese el valor de la compra: ");
            valcomp = entrada.nextDouble();
            System.out.println("Ingrese el color de la bolita");
            color = entrada.next().toUpperCase();

            if (color.equals("BLANCO")) {
                pdes = 0;
            } else if (color.equals("VERDE")) {
                pdes = 10;
            } else if (color.equals("AMARILLO")) {
                pdes = 25;
            } else if (color.equals("AZUL")) {
                pdes = 50;
            } else {
                pdes = 100;
            }

            valpag = valcomp - pdes*valcomp/100;

            System.out.println("EL CLIENTE DEBE PAGAR: $" + valpag);
        }
    }


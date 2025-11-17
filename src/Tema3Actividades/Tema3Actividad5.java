package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Introduce un número del 1 al 10: ");
            numero = in.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("El número debe estar entre 1 y 10.");
            } else {
                mostrarTabla(numero);
            }
        }
        while (numero < 1 || numero > 10);
    }

    public static void mostrarTabla(int a) {
        System.out.println("Tabla de multiplicar del " + a + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}

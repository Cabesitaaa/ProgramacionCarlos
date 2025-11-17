package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros positivos (0 para salir):");

        do {
            System.out.print("Número: ");
            numero = in.nextInt();

            if (numero > 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }
            } else if (numero < 0) {
                System.out.println("Por favor, introduce solo números positivos.");
            }

        } while (numero != 0);

        System.out.println("Programa finalizado.");
    }

    public static boolean esPrimo(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}

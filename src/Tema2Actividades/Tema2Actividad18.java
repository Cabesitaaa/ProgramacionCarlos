package Tema2Actividades;

import java.util.Scanner;

public class Tema2Actividad18 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = in.nextDouble();
        if (numero < 0) {
            System.out.println("No es correcto, no se puede calcular la raíz cuadrada de un número negativo.");
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        }
    }
}

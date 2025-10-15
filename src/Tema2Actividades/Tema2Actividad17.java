package Tema2Actividades;

import java.util.Scanner;

public class Tema2Actividad17 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una figura: ");
        System.out.println("0 - Cuadrado");
        System.out.println("1 - Rectángulo");
        System.out.println("2 - Triángulo");
        int opcion = in.nextInt();
        if (opcion == 0) {
            System.out.print("Introduce el lado del cuadrado: ");
            double lado = in.nextDouble();
            double superficie = lado * lado;
            double perimetro = 4 * lado;
            System.out.println("Superficie del cuadrado: " + superficie);
            System.out.println("Perímetro del cuadrado: " + perimetro);
        } else if (opcion == 1) {
            System.out.print("Introduce la base del rectángulo: ");
            double base = in.nextDouble();
            System.out.print("Introduce la altura del rectángulo: ");
            double altura = in.nextDouble();
            double superficie = base * altura;
            double perimetro = 2 * (base + altura);
            System.out.println("Superficie del rectángulo: " + superficie);
            System.out.println("Perímetro del rectángulo: " + perimetro);
        } else if (opcion == 2) {
            System.out.print("Introduce la base del triángulo: ");
            double base = in.nextDouble();
            System.out.print("Introduce la altura del triángulo: ");
            double altura = in.nextDouble();
            double superficie = (base * altura) / 2;
            System.out.println("Superficie del triángulo: " + superficie);
        } else {
            System.out.println("Error: opción no válida.");
        }
    }
}


package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad3 {
    public static boolean validRadius(double radius) {
        if (radius > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius;
        do {
            System.out.println("Introduce el radio del circulo:");
            radius = in.nextDouble();

            if (!validRadius(radius)) {
                System.out.println("El radio del circulo no puede ser menor de 0");
            }
        }
        while (!validRadius(radius));
        double circlePerimeter = calculateCirclePerimeter(radius);
        double circleArea = calculateCircleArea(radius);

        System.out.println("El radio que has introducido es: " + radius);
        System.out.println("El perimetro es: " + circlePerimeter);
        System.out.println("El area es: " + circleArea);

    }
}

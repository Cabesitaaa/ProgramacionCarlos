package Tema2Actividades;

import java.util.Scanner;

public class Tema2Actividad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce lado del cuadrado = ");
        double num1 =in.nextInt();
        double superficie = num1 * num1;
        double perimetro = 4 * num1;
        System.out.println("Superficie = " + superficie);
        System.out.println("Perimetro = " + perimetro);
    }
}

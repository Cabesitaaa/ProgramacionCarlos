package Tema2Actividades;

import java.util.Scanner;

public class Tema2Actividad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base del rectangulo = ");
        double num1 = in.nextInt();
        System.out.println("Introduce la altura del rectangulo = ");
        double num2 = in.nextInt();
        double superficie = num1 * num2;
        double perimetro= 4 *(num1 * num2);
        System.out.println("Superficie = " + superficie);
        System.out.println("Perimetro = " + perimetro);


    }
}

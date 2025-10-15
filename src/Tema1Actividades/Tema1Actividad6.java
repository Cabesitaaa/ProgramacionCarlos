package Tema1Actividades;

import java.util.Scanner;
public class Tema1Actividad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el Radio del circulo para poder calcular su area:");
        double R = in.nextDouble();
        double A = Math.PI *R * R;
        System.out.println(A);
        in.close();
    }
}

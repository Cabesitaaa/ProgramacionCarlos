package Tema1Actividades;

import java.util.Scanner;

public class Tema1Actividad9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int num1 = in.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = in.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int resto = num1 % num2;
        int division = num1 / num2;
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Producto = " + producto);
        System.out.println("Resto = " + resto);
        System.out.println("Division = " + division);
        if (num2 != 0) {
            System.out.println("Resto = " + resto);
            System.out.println("Division = " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}



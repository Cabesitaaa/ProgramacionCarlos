package Tema1Actividades;

import java.util.Scanner;
public class Tema1Actividad8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int num1 = in.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }
    }

}


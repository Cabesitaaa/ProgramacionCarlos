package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad1 {
    public static int numberSign(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int number = in.nextInt();

        number = numberSign(number);

        if (number == 0) {
            System.out.println("El numero es 0");
        } else if (number == 1) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}



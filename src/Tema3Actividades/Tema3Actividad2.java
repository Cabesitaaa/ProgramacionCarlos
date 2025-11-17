package Tema3Actividades;

import java.util.Scanner;

import static Tema3Actividades.Tema3Actividad1.numberSign;

public class Tema3Actividad2 {
    public static boolean isAdult(int edad) {

        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        numberSign(3);
        //Tema3Actividad1.main(args);
        Scanner in = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad: ");
        edad = in.nextInt();

        boolean adulto = false;
        adulto = isAdult(edad);

        if (adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}

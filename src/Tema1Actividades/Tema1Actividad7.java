package Tema1Actividades;

import java.util.Scanner;
    public class Tema1Actividad7 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Elige un número del 1 al 6 como un dado:");
            int cara = in.nextInt();
            if (cara >= 1 && cara <= 6) {
                int opuesto = 7 - cara;
                System.out.println("El cara opuesta es: " + opuesto);
            } else {
                System.out.println("No es número correcto");
            }
        }
    }


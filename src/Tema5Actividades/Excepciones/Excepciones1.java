package Tema5Actividades.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero: ");
            int numero = in.nextInt();

        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto");
        }
    }
}

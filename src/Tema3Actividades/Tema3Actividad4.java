package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            showMenu();
            System.out.print("Selecciona una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cantidad en euros: ");
                    double euros = in.nextDouble();
                    System.out.printf("%.2f € son %.2f $%n", euros, euro2dollar(euros));
                    break;

                case 2:
                    System.out.print("Introduce la cantidad en dólares: ");
                    double dolares = in.nextDouble();
                    System.out.printf("%.2f $ son %.2f €%n", dolares, dollar2euro(dolares));
                    break;

                case 3:
                    System.out.println("Cerrando el programa");
                    break;

                default:
                    System.out.println("Esta opcion no es correcta");
            }

            System.out.println();
        } while (opcion != 3);

    }

    public static void showMenu() {
        System.out.println("CONVERSOR DE MONEDA");
        System.out.println("1.Convertir de euros a dólares");
        System.out.println("2.Convertir de dólares a euros");
        System.out.println("3.Salir");
    }

    public static double euro2dollar(double euros) {
        return euros * 1.08;
    }

    public static double dollar2euro(double dolares) {
        return dolares / 1.08;
    }
}

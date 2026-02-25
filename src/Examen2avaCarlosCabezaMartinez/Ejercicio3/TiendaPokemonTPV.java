package Examen2avaCarlosCabezaMartinez.Ejercicio3;

import java.util.Scanner;

public class TiendaPokemonTPV {
    public static void main (String[]Args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            myMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("La opcion no es correcta");
            }

        } while (opcion != 7);
    }
    public static void myMenu() {
        System.out.println("---TiendaPokemonTPV---");
        System.out.println("1.Añadir pocion al ticket");
        System.out.println("2.Añadir pokebola al ticket");
        System.out.println("3.Añadir accesorio al ticket");
        System.out.println("4.Borrar el articulo del ticket (por posicion en el ticket)");
        System.out.println("5.Mostrar todos los articulos del ticket");
        System.out.println("6.Mostrar total");
        System.out.println("7.Salir");
        System.out.println("Ingresa una opcion: ");
    }
}

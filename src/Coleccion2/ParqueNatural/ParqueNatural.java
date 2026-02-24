package Coleccion2.ParqueNatural;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ParqueNatural {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Avistamiento> lista = new ArrayList<>();
        int opcion;

        do {
            myMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1: anadirLobo(lista, in);
                break;
                case 2: anadirLobo(lista, in);
                break;
                case 3: anadirLobo(lista, in);
                break;
                case 4: mostrarDesdeLas8(lista);
                break;
                case 5: mostrarNocturnos(lista);
                break;
                case 6: mostrarLobos(lista);
                break;
                case 7: mostrarSerpientes(lista);
                break;
                case 8: mostrarPajaros(lista);
                break;
                case 0: System.out.println("Saliendo del programa...");
                break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void myMenu() {
        System.out.println("--- REGISTRO PARQUE NATURAL ---");
        System.out.println("1. Añadir Serpiente");
        System.out.println("2. Añadir Pájaro");
        System.out.println("3. Añadir Manada de Lobos");
        System.out.println("4. Ver todo (desde las 8:00)");
        System.out.println("5. Ver nocturnos (20:00 a 8:00)");
        System.out.println("6. Ver solo Lobos");
        System.out.println("7. Ver solo Serpientes");
        System.out.println("8. Ver solo Pájaros");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");

    }
    private static void anadirSerpiente(List<Avistamiento> lista, Scanner in) {
        System.out.print("Hora: ");
        int h = in.nextInt();
        System.out.print("Longitud: ");
        double l = in.nextDouble();
        in.nextLine();
        System.out.print("Especie: ");
        String e = in.nextLine();
        lista.add(new Serpiente(h, l, e));
    }

    private static void anadirPajaro(List<Avistamiento> lista, Scanner in) {
        System.out.print("Hora: ");
        int h = in.nextInt();
        System.out.print("Peso: ");
        double p = in.nextDouble();
        in.nextLine();
        System.out.print("Especie: ");
        String e = in.nextLine();
        lista.add(new Pajaro(h, p, e));
    }

    private static void anadirLobo(List<Avistamiento> lista, Scanner in) {
        System.out.print("Hora: ");
        int h = in.nextInt();
        System.out.print("Número lobos: ");
        int n = in.nextInt();
        in.nextLine();
        System.out.print("Observaciones: ");
        String o = in.nextLine();
        lista.add(new ManadaLobos(h, n, o));
    }

    private static void mostrarDesdeLas8(List<Avistamiento> lista) {
        System.out.println("--- Avistamientos Diurnos ---");
        lista.stream().filter(a -> a.getHora() >= 8).forEach(System.out::println);
    }

    private static void mostrarNocturnos(List<Avistamiento> lista) {
        System.out.println("--- Avistamientos Nocturnos ---");
        lista.stream().filter(a -> a.getHora() >= 20 || a.getHora() < 8).forEach(System.out::println);
    }

    private static void mostrarLobos(List<Avistamiento> lista) {
        lista.stream().filter(ManadaLobos.class::isInstance).forEach(System.out::println);
    }

    private static void mostrarSerpientes(List<Avistamiento> lista) {
        lista.stream().filter(Serpiente.class::isInstance).forEach(System.out::println);
    }

    private static void mostrarPajaros(List<Avistamiento> lista) {
        lista.stream().filter(Pajaro.class::isInstance).forEach(System.out::println);
    }
}



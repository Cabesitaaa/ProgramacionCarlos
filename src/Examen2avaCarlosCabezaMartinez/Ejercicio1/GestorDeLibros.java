package Examen2avaCarlosCabezaMartinez.Ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeLibros {
    public static void main(String[] args) {
        List<String> libros = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            myMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    introducirLibro(in);
                    break;
                case 2:
                    mostrarInfo(in);
                    break;
                case 3:
                    modificarGenero(in);
                    break;
                case 4:
                    buscarPorAutor(in);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("La opcion no es correcta");
            }

        } while (opcion != 5);
    }

    public static void myMenu() {
        System.out.println("---Menu Libros---");
        System.out.println("(1) Introducir libro");
        System.out.println("(2) Mostrar informacion de un libro (por ISBN)");
        System.out.println("(3) Modificar el genero de un libro (por ISBN)");
        System.out.println("(4) Buscar todos los libros de un autor");
        System.out.println("(5) Salir");
        System.out.println("Introduce la opcion: ");
    }

    public static void introducirLibro(Scanner in) {
        System.out.println("---Introducir Libro---");

        System.out.println("Introduce el nombre del libro: ");
        String n = in.nextLine();

        System.out.println("Introduce el ISBN del libro: ");
        String isbn = in.nextLine();

        System.out.println("Introduce el autor del libro: ");
        String autor = in.nextLine();

        System.out.println("Introduce el nº de paginas que tiene el libro: ");
        int nPag = in.nextInt();
        in.nextLine();

        System.out.println("Introduce el genero del libro: ");
        String genero = in.nextLine();

        System.out.println("Libro guardado correctamente!");
    }

    public static void buscarPorAutor(Scanner in) {
        System.out.println("---Buscar libros por autor---");

        System.out.println("Introduce el nombre del autor para buscar sus libros: ");
        String autor = in.nextLine();

    }

    public static void mostrarInfo(Scanner in) {
        System.out.println("---Mostrar informacion de un libro---");
        System.out.println("Introduce el ISBN del libro: ");
        String isbn = in.nextLine();
    }
    public static void modificarGenero(Scanner in) {
        System.out.println("---Modificar genero de un libro---");
        System.out.println("Introduce el ISBN del libro: ");
        String isbn = in.nextLine();
    }
}

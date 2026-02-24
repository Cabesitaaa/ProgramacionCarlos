package AcortadorURL;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AcortadorURL {
    private static Map<String, String> diccionario = new HashMap<>();
    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String BASE_URL = "https://acortar.link/";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            myMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1: crearRegistro(in);
                break;
                case 2: resolverDireccion(in);
                break;
                case 3: borrarRegistro(in);
                break;
                case 4: mostrarRegistros();
                break;
                case 0: System.out.println("Saliendo del programa...");
                break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void crearRegistro(Scanner in) {
        System.out.print("Introduce la URL para acortar: ");
        String urlLarga = in.nextLine();

        String clave = generarClaveUnica();
        diccionario.put(clave, urlLarga);

        System.out.println("Registro creado exitosamente.");
        System.out.println("La URL acortada es: " + BASE_URL + clave);
    }

    private static void resolverDireccion(Scanner in) {
        System.out.print("Introduce la cadena única (ej: FQp7Y): ");
        String clave = in.nextLine();
        if (diccionario.containsKey(clave)) {
            System.out.println("Dirección URL: " + diccionario.get(clave));
        } else {
            System.out.println("No existe. No hay ninguna URL asociada a esa cadena.");
        }
    }

    private static void borrarRegistro(Scanner in) {
        System.out.print("Introduce la cadena única del registro a borrar: ");
        String clave = in.nextLine();
        if (diccionario.remove(clave) != null) {
            System.out.println("Registro borrado correctamente.");
        } else {
            System.out.println("No se encontró el registro para borrar.");
        }
    }

    private static void mostrarRegistros() {
        if (diccionario.isEmpty()) {
            System.out.println("No hay registros almacenados actualmente.");
        } else {
            System.out.println("--- LISTADO DE REGISTROS ---");
            diccionario.forEach((clave, url) -> {
                System.out.println(BASE_URL + clave + " -> " + url);
            });
        }
    }

    private static String generarClaveUnica() {
        Random rand = new Random();
        String clave;

        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                sb.append(ALFABETO.charAt(rand.nextInt(ALFABETO.length())));
            }
            clave = sb.toString();
        } while (diccionario.containsKey(clave));

        return clave;
    }

    private static void myMenu() {
        System.out.println("--- ACORTADOR DE URLs ---");
        System.out.println("1. Crear un nuevo registro");
        System.out.println("2. Resolver dirección");
        System.out.println("3. Borrar un registro");
        System.out.println("4. Mostrar todos los registros");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }
}
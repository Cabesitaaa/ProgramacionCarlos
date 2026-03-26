package Tema7Actividades.EjercicioB4;
import java.io.*;
import java.util.*;

public class NombresYApellidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String rutaNombres = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB4/usa_nombres.txt";
        String rutaApellidos = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB4/usa_apellidos.txt";
        String rutaDestino = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB4/usa_personas.txt";

        List<String> listaNombres = leerArchivo(rutaNombres);
        List<String> listaApellidos = leerArchivo(rutaApellidos);

        System.out.print("Cuántos nombres nuevos quieres añadir a 'usa_personas.txt'?: ");
        int cantidad = teclado.nextInt();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino, true))) {

            for (int i = 0; i < cantidad; i++) {
                String n = listaNombres.get(random.nextInt(listaNombres.size()));
                String a = listaApellidos.get(random.nextInt(listaApellidos.size()));

                bw.write(n + " " + a);
                bw.newLine();
            }

            System.out.println("Se han añadido " + cantidad + " personas sin borrar las anteriores.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    private static List<String> leerArchivo(String ruta) {
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) lista.add(linea.trim());
            }
        } catch (IOException e) {
            System.out.println("Error leyendo " + ruta);
        }
        return lista;
    }
}
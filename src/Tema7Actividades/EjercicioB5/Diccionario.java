package Tema7Actividades.EjercicioB5;
import java.io.*;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args) {
        String rutaCarpeta = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB5";
        String archivoFuente = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB5/diccionario.txt";

        File directorio = new File(rutaCarpeta);
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Carpeta creada: " + rutaCarpeta);
            }
        }

        for (char letra = 'A'; letra <= 'Z'; letra++) {
            String letraActual = String.valueOf(letra);
            String rutaArchivoLetra = rutaCarpeta + "/" + letraActual + ".txt";

            try (Scanner lector = new Scanner(new File(archivoFuente));
                 PrintWriter escritor = new PrintWriter(new FileWriter(rutaArchivoLetra))
            ) {
                while (lector.hasNextLine()) {
                    String palabra = lector.nextLine().trim();

                    if (palabra.toUpperCase().startsWith(letraActual)) {
                        escritor.println(palabra);
                    }
                }
                System.out.println("Archivo hecho: " + rutaArchivoLetra);

            } catch (FileNotFoundException e) {
                System.err.println("No se encontró el archivo " + archivoFuente);
                break;
            } catch (IOException e) {
                System.err.println("Error al escribir el archivo " + letraActual);
            }
        }
        System.out.println("Proceso finalizado.");
    }
}
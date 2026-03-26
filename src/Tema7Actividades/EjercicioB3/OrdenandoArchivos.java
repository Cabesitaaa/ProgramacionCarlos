package Tema7Actividades.EjercicioB3;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoArchivos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String archivoOrigen = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB3/usa_personas.txt";
        String archivoDestino = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB3/usa_personas_sorted.txt";

        List<String>lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                lineas.add(linea);
                }
            }
            System.out.println("Archivo leída correctamente (" + lineas.size() + " líneas).");

        } catch (IOException e) {
            System.out.println("Error al leer archivo origen."+ e.getMessage());
        }
        Collections.sort(lineas);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("El archivo" +archivoDestino+ "se ha creado y ordenado de manera correcta");
        } catch (IOException e) {
            System.out.println("Error al escribir archivo."+ e.getMessage());
        }

    }
}

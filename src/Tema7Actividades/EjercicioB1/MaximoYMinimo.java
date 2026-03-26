package Tema7Actividades.EjercicioB1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaximoYMinimo {
    public static void main(String[] args) {
        String nombreArchivo = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB1/numeros.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            Integer max = null;
            Integer min = null;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.isEmpty()) continue;
                String[] partes = linea.split("\\s+");

                for (String parte : partes) {
                    try {
                        int numeroActual = Integer.parseInt(parte);
                        if (max == null || min == null) {
                            max = numeroActual;
                            min = numeroActual;
                        } else {
                            if (numeroActual > max) max = numeroActual;
                            if (numeroActual < min) min = numeroActual;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Saltando dato no numérico: " + parte);
                    }
                }
            }

            if (max != null) {
                System.out.println("Resultados de '" + nombreArchivo + "':");
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
            } else {
                System.out.println("No se encontraron números válidos en el archivo.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
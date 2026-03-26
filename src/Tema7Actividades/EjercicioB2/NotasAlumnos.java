package Tema7Actividades.EjercicioB2;
import java.io.*;
import java.util.*;

public class NotasAlumnos {
    public static void main(String[] args) {
        String ruta = "/home/carcabmar8/IdeaProjects/Programacion/src/Tema7Actividades/EjercicioB2/alumnos_notas.txt";
        List<Alumnos> listaAlumnos = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea;

        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;

            String[] partes = linea.trim().split("\\s+");

            String nombre = partes[0] + " " + partes[1];

            double sumaNotas = 0;
            int contadorNotas = 0;

            for (int i = 2; i < partes.length; i++) {
                try {
                    sumaNotas += Double.parseDouble(partes[i]);
                    contadorNotas++;
                } catch (NumberFormatException e) {
                }
            }

            if (contadorNotas > 0) {
                double media = sumaNotas / contadorNotas;
                listaAlumnos.add(new Tema7Actividades.EjercicioB2.Alumnos(nombre, media));
            }
        }

        Collections.sort(listaAlumnos, (a1, a2) -> Double.compare(a2.media, a1.media));

        System.out.println("RANKING DE NOTAS:");
        for (Tema7Actividades.EjercicioB2.Alumnos al : listaAlumnos) {
            System.out.println(al);
        }

    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    }
}


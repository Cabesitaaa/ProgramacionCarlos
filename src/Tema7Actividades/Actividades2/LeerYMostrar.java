package Tema7Actividades.Actividades2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerYMostrar {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("usuario.txt"))) {
            String linea;
            System.out.println("Contenido de usuario.txt:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + e.getMessage());
        }
    }
}
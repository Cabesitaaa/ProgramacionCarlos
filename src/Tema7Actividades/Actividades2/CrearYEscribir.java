package Tema7Actividades.Actividades2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrearYEscribir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = in.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = in.nextInt();

        try (FileWriter fw = new FileWriter("usuario.txt")) {
            fw.write("Nombre: " + nombre);
            fw.write("Edad: " + edad);
            System.out.println("Datos guardados correctamente en usuario.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + e.getMessage());
        }
    }
}
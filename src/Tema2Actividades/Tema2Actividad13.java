package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce las horas (0-23): ");
        int horas = in.nextInt();
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = in.nextInt();
        System.out.print("Introduce los segundos (0-59): ");
        int segundos = in.nextInt();
        if (segundos < 0) {
            System.out.println("Introduce un numero correcto");
        }
        if (minutos < 0) {
            System.out.println("Introduce un numero correcto");
        }
        if (horas < 0) {
            System.out.println("Introduce un numero correcto");
        } else {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
            }
            System.out.print("La hora con un segundo más es: " + horas + ":" + minutos + ":" + segundos);
        }
    }
}

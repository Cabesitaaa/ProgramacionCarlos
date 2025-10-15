package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el numero de personas: ");
        int personas = in.nextInt();
        System.out.print("Introduce el numero de dias ");
        int dias = in.nextInt();
        int tarifa = 15;
        double precioTotal = personas * dias * tarifa;
        if (personas > 5 && dias >= 7) {
            precioTotal *= 0.75;
        }
        System.out.print("El presio total de la estancia es: " + precioTotal + "€");
    }
}


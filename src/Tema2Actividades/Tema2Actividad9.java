
package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la cantidad en dolares: ");
        double dolares = in.nextDouble();
        double tipoCambio = 1.08;
        double euros = dolares / tipoCambio;
        System.out.println(dolares + " dolares equivalen a " + euros + " euros.");
    }
}

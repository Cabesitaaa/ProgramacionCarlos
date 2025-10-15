package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad16 {
    //switch
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        double cambioEuroDolar = 1.10;
        System.out.print("Introduce la cantidad a convertir: ");
        double cantidad = in.nextDouble();
        System.out.print("Introduce 'D' para convertir de euros a dólares o 'E' para convertir de dólares a euros: ");
        char opcion = in.next().toUpperCase().charAt(0);
        double resultado;
        switch (opcion) {
            case 'D':
                double resultadoD = cantidad * cambioEuroDolar;
                System.out.println(cantidad + " euros son " +resultadoD + " dólares.");
                break;
            case 'E':
                double resultadoE = cantidad / cambioEuroDolar;
                System.out.println(cantidad + " dólares son " + resultadoE + " euros.");
                break;
            default:
                System.out.println("Opción no válida. Debes introducir 'D' o 'E'.");
        }
    }
}

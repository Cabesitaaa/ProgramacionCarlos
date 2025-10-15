package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce la cantidad en euros: ");
            double euros = in.nextDouble();
            double tipoCambio = 1.08;
            double dolares = euros * tipoCambio;
            System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
        }
    }


package Tema5Actividades.Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];
        int contador = 0;

        while (contador < 5){
            try {
                System.out.println("Introduce los valores enteros: ");
                valores[contador] = scanner.nextDouble();
                contador++;

            } catch (InputMismatchException e){
                System.out.println("Has introducido un valor que no es correcto.");
                e.printStackTrace();
                scanner.nextLine();
            }
        }
        System.out.println("Array rellenado con exito.");
    }
}

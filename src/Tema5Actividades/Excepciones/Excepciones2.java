package Tema5Actividades.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        double division;
        try {
            System.out.println("Introduce el valor del primer numero: ");
            num1 = scanner.nextInt();

            System.out.println("Introduce el valor del segundo numero: ");
            num2 = scanner.nextInt();

            division = (double) num1 / num2;
            System.out.println("El resultado de la division es: " + division);

        }catch (InputMismatchException e){
            System.out.println("Valor introducido incorrecto.");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("No se puede realizar una division por 0.");
            e.printStackTrace();

        }finally {
            scanner.close();
        }
    }
}

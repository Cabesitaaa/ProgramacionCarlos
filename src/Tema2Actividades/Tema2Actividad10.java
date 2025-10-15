package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están ordenados de menor a mayor.");
        } else {
            System.out.println("Los números NO están ordenados de menor a mayor.");
        }
    }
}

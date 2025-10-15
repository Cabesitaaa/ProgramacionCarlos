package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = in.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = in.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = in.nextInt();
        if ((num2 == num1 + 1 && num3 == num2 + 1) || (num2 == num1 - 1 && num3 == num2 - 1)) {
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos.");
        }
    }
}

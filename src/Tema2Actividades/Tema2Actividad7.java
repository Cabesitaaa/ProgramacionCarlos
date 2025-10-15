package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero = ");
        int num1 = in.nextInt();
        System.out.println("Introduce el segundo numero = ");
        int num2 = in.nextInt();
        if (num1 < num2) {
            int resta1 = num2 - num1;
            System.out.println("El resultado de la resta es = " + resta1);
        } else {
            int resta2 = num1 - num2;
            System.out.println("El resultado de la resta es = " + resta2);

        }

    }
}



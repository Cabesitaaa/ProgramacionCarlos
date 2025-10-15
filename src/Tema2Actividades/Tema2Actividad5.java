package Tema2Actividades;
import  java.util.Scanner;
public class Tema2Actividad5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el primer número: ");
            double num1 = in.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = in.nextDouble();
            System.out.print("Introduce el tercer número: ");
            double num3 = in.nextDouble();
            double MediaDecimales = (num1 + num2 + num3) / 3;
            int MediaSinDecimales = (int) Math.round(MediaDecimales);
            System.out.println("Media con decimales: " + MediaDecimales);
            System.out.println("Media sin decimales: " + MediaSinDecimales);

        }
    }


package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo=  ");
        double base = in.nextDouble();
        System.out.print("Introduce la altura del triángulo=  ");
        double altura = in.nextDouble();
        double superficie = (base * altura) / 2;
        System.out.println("La superficie del triángulo es = " + superficie);

    }
}





package Tema2Actividades;
import java.util.Scanner;
public class Tema2Actividad4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el primer número=  ");
            int num1 = in.nextInt();
            System.out.print("Introduce el segundo número =  ");
            int num2 = in.nextInt();
            System.out.print("Introduce el tercer número =  ");
            int num3 = in.nextInt();
            int mayor;
            if (num1 >= num2 && num1 >= num3) {
                mayor = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
            System.out.println("El número mayor es =  " + mayor);

        }
    }



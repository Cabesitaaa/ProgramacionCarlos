package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        int anio = sc.nextInt();

        if (esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es correcta.");
        }

    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12 || dia < 1 || anio <= 0) {
            return false;
        }

        int diasMes;

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                if (esBisiesto(anio)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            default:
                diasMes = 31;
        }

        return dia <= diasMes;
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}

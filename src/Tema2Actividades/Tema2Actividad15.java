package Tema2Actividades;

import java.util.Scanner;

public class Tema2Actividad15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero del Mes ");
        int mes = in.nextInt();
        System.out.println("Introduce el numero del Año ");
        int anio = in.nextInt();
        int dias;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = 0;
        }
        if (dias == 0) {
            System.out.println("Mes no válido. Debe estar entre 1 y 12.");
        } else {
            System.out.println("El mes " + mes + " del año " + anio + " tiene " + dias + " días.");
        }
    }
}
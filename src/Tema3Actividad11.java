package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad11 {
    public static class myMath {
        public static double squarePerimeter(double lado) {
            return 4 * lado;
        }

        public static double squareArea(double lado) {
            return lado * lado;
        }

        public static double rectanglePerimetrer(double altura, double base) {
            return 2 * (altura * base);
        }

        public static double rectangleArea(double altura, double base) {
            return altura * base;
        }

        public static double circlePerimetrer(double radius) {
            return 2 * Math.PI * radius;
        }

        public static double circleArea(double radius) {
            return Math.PI * (radius * radius);
        }

        public static boolean noEsPrimo(int num) {
            if (num <= 1) return true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return true;
            }
            return false;
        }

        public static int numDigitos(int num) {
            if (num == 0) return 1;
            int contador = 0;
            num = Math.abs(num);
            while (num > 0) {
                num = num / 10;
                contador++;
            }
            return contador;
        }

        public static int numParesDigitos(int num) {
            int cantidadPares = 0;
            num = Math.abs(num);
            if (num == 0) return 1;
            while (num > 0) {
                int ultimoDigito = num % 10;
                if (ultimoDigito % 2 == 0) {
                    cantidadPares++;
                }
                num = num / 10;
            }
            return cantidadPares;
        }

        public static int numImparesDigitos(int num) {
            num = Math.abs(num);
            int digito;
            if (num == 0) return 0;
            int cont = 0;
            while (num > 0) {
                digito = num % 10;
                if (digito % 2 != 0) {
                    cont++;
                }
                num /= 10;
            }
            return cont;
        }

        public static int factorial(int num) {
            long resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            return (int) resultado;
        }

        public static int factorialRecursivo(int num) {
            if (num <= 1) return 1;
            return num * factorial(num - 1);
        }

        public static int ecuacion(double a, double b, double c) {
            double D = b * b - 4 * a * c;
            if (D > 0) return 2;
            else if (D == 0) return 1;
            else return 0;
        }

        public static int sumaDigitos(int num) {
            num = Math.abs(num);
            int suma = 0;
            while (num > 0) {
                suma += num % 10;
                num /= 10;
            }
            return suma;
        }
    }
}






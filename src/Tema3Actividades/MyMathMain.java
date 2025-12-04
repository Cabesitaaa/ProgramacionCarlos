package Tema3Actividades;

import java.util.Scanner;

public class MyMathMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu MyMath");
            System.out.println("1. Calcular perimetros");
            System.out.println("2. No es primo?");
            System.out.println("3. Mostrar numero de digitos de un numero");
            System.out.println("4. Devolver numero de digitos pares");
            System.out.println("5. Devolver numero de digitos impares");
            System.out.println("6. Calcular factorial de un numero");
            System.out.println("7. Calcular factorial de manera recursiva de un numero");
            System.out.println("8. Calcular cuantos resultados tiene una equacion");
            System.out.println("9. Sumar digitos de un numero entero");

            System.out.println("Introduce una opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    int opcion1;
                    do {
                        System.out.println("Elije una opcion para calcular el perimetro");
                        System.out.println("1. Calcular area y perimetro del cuadrado");
                        System.out.println("2. Calcular area y perimetro del rectangulo");
                        System.out.println("3. Calcular area y perimetro del circulo");
                        System.out.println("4. Volver al menu principal");
                        System.out.println("Introduce una opcion");
                        opcion1 = in.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.println("Introduce el lado del cuadrado");
                                int lado = in.nextInt();
                                System.out.println("El perimetro del cuadrado: " + Tema3Actividad11.myMath.squarePerimeter(lado));
                                System.out.println("El area del cuadrado es: " + Tema3Actividad11.myMath.squareArea(lado));
                                break;
                            case 2:
                                System.out.println("Introduce la base del rectangulo: ");
                                int base = in.nextInt();
                                System.out.println("Introduce la altura del rectangulo: ");
                                int altura = in.nextInt();
                                System.out.println("El perimetro del rectangulo es: " + Tema3Actividad11.myMath.rectanglePerimetrer(base, altura));
                                System.out.println("El area del rectangulo es: " + Tema3Actividad11.myMath.rectangleArea(base, altura));
                                break;
                            case 3:
                                System.out.println("Introduce el radio del circulo:");
                                int radio = in.nextInt();
                                System.out.println("El perimetro del circulo: " + Tema3Actividad11.myMath.circlePerimetrer(radio));
                                System.out.println("El area del circulo es: " + Tema3Actividad11.myMath.circleArea(radio));
                                break;
                            case 4:
                                System.out.println("Volviendo al menú principal");
                                break;
                            default:
                                System.out.println("Opción no válida");
                        }
                    }
                    while (opcion1 != 4);
                case 2:
                    int num2;
                    System.out.println("Introduce un numero: ");
                    num2 = in.nextInt();
                    boolean resultado2 = Tema3Actividad11.myMath.noEsPrimo(num2);
                    if (resultado2 == true) {
                        System.out.println("El numero no es primo");
                    } else {
                        System.out.println("El numero es primo");
                    }
                    break;
                case 3:
                    System.out.println("Introduce un numero: ");
                    int num3 = in.nextInt();
                    int cantidad = Tema3Actividad11.myMath.numDigitos(num3);
                    System.out.println("El número tiene " + cantidad + " dígitos.");
                    break;
                case 4:
                    System.out.println("Introduce un numero: ");
                    int num4 = in.nextInt();
                    int cantidadPares = Tema3Actividad11.myMath.numParesDigitos(num4);
                    System.out.println("El número tiene " + cantidadPares + " dígitos pares.");
                    break;
                case 5:
                    System.out.println("Introduce un numero: ");
                    int num5 = in.nextInt();
                    int cantidadImpares = Tema3Actividad11.myMath.numImparesDigitos(num5);
                    System.out.println("El número tiene " + cantidadImpares + " dígitos impares.");
                    break;
                case 6:
                    System.out.println("Introduce un numero: ");
                    int num6 = in.nextInt();
                    int resultado6 = Tema3Actividad11.myMath.factorial(num6);
                    System.out.println("El resultado es " + resultado6);
                    break;
                case 7:
                    System.out.println("Introduce un numero: ");
                    int num7 = in.nextInt();
                    int resultado7 = Tema3Actividad11.myMath.factorialRecursivo(num7);
                    System.out.println("El resultado es " + resultado7);
                    break;
                case 8:
                    System.out.println("Introduce a: ");
                    double a = in.nextDouble();
                    System.out.println("Introduce b: ");
                    double b = in.nextDouble();
                    System.out.println("Introduce c: ");
                    double c = in.nextDouble();
                    int numResultado = Tema3Actividad11.myMath.ecuacion(a, b, c);
                    if (numResultado == 2) {
                        System.out.println("La equacion tiene dos soluciones");
                    } else if (numResultado == 1) {
                        System.out.println("La equacion tiene una solucion");
                    } else {
                        System.out.println("El equacion no tiene solucion");
                    }
                    break;
                case 9:
                    System.out.println("Introduce un número para sumar sus dígitos: ");
                    int num9 = in.nextInt();
                    int resultadoSuma = Tema3Actividad11.myMath.sumaDigitos(num9);
                    System.out.println("La suma de los dígitos de " + num9 + " es " + resultadoSuma);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
        while (opcion != 9);
    }
}
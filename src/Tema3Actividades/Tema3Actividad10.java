package Tema3Actividades;

import java.util.Scanner;

public class Tema3Actividad10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("0) Salir del programa");
            System.out.println("1) Muestra el signo de un número introducido por el usuario");
            System.out.println("2) Indica si el usuario es mayor de edad o no.");
            System.out.println("3) Calcula el área y perímetro de un círculo.");
            System.out.println("4) Conversor de euros a dólares y de dólares a euros.");
            System.out.println("5) Mostrar tabla de multiplicar de un número.");
            System.out.println("6) Mostrar tablas de multiplicar del 1 al 10.");
            System.out.println("7) Comprobador de números primos");
            System.out.println("8) Comprobador de fechas.");

            System.out.println("Introduce una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduce un numero: ");
                    int number = in.nextInt();

                    int resultado = Tema3Actividad1.numberSign(number);

                    if (resultado == 0) {
                        System.out.println("El numero es 0");
                    } else if (number == 1) {
                        System.out.println("El numero es positivo");
                    } else {
                        System.out.println("El numero es negativo");
                    }
                    break;
                case 2:

                    int edad = in.nextInt();

                    System.out.println("Introduce tu edad: ");
                    edad = in.nextInt();


                    if (Tema3Actividad2.isAdult(edad)) {
                        System.out.println("Es mayor de edad");
                    } else {
                        System.out.println("Es menor de edad");
                    }
                    break;
                case 3:
                    double radius;
                    do {
                        System.out.println("Introduce el radio del circulo:");
                        radius = in.nextDouble();

                        if (!Tema3Actividad3.validRadius(radius)) {
                            System.out.println("El radio del circulo no puede ser menor de 0");
                        }
                    }
                    while (!Tema3Actividad3.validRadius(radius));
                    double circlePerimeter = Tema3Actividad3.calculateCirclePerimeter(radius);
                    double circleArea = Tema3Actividad3.calculateCircleArea(radius);

                    System.out.println("El radio que has introducido es: " + radius);
                    System.out.println("El perimetro es: " + circlePerimeter);
                    System.out.println("El area es: " + circleArea);

                    break;
                case 4:
                    do {
                        Tema3Actividad4.showMenu();
                        System.out.print("Selecciona una opción: ");
                        opcion = in.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.print("Introduce la cantidad en euros: ");
                                double euros = in.nextDouble();
                                System.out.printf("%.2f € son %.2f $%n", euros, Tema3Actividad4.dollar2euro(euros));
                                break;

                            case 2:
                                System.out.print("Introduce la cantidad en dólares: ");
                                double dolares = in.nextDouble();
                                System.out.printf("%.2f $ son %.2f €%n", dolares, Tema3Actividad4.euro2dollar(dolares));
                                break;

                            case 3:
                                System.out.println("Cerrando el programa");
                                break;

                            default:
                                System.out.println("Esta opcion no es correcta");
                        }

                        System.out.println();
                    } while (opcion != 3);

                    break;
                case 5:
                    int numero;
                    do {
                        System.out.print("Introduce un número del 1 al 10: ");
                        numero = in.nextInt();

                        if (numero < 1 || numero > 10) {
                            System.out.println("El número debe estar entre 1 y 10.");
                        } else {
                            Tema3Actividad5.mostrarTabla(numero);
                        }
                    }
                    while (numero < 1 || numero > 10);
                    break;
                case 6:
                    for (int i = 1; i <= 10; i++) {
                        Tema3Actividad5.mostrarTabla(i);
                    }
                    break;
                case 7:

                    System.out.println("Introduce números enteros positivos (0 para salir):");

                    do {
                        System.out.print("Número: ");
                        numero = in.nextInt();

                        if (numero > 0) {
                            if (Tema3Actividad7.esPrimo(numero)) {
                                System.out.println(numero + " es primo.");
                            } else {
                                System.out.println(numero + " no es primo.");
                            }
                        } else if (numero < 0) {
                            System.out.println("Por favor, introduce solo números positivos.");
                        }

                    } while (numero != 0);

                    System.out.println("Programa finalizado.");
                    break;
                case 8:
                    System.out.print("Introduce el día (1-31): ");
                    int dia = in.nextInt();

                    System.out.print("Introduce el mes (1-12): ");
                    int mes = in.nextInt();

                    System.out.print("Introduce el año: ");
                    int anio = in.nextInt();

                    if (Tema3Actividad8.esFechaValida(dia, mes, anio)) {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " es correcta.");
                    } else {
                        System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " no es correcta.");
                    }
                    break;
                case 9:
                default:
                    System.out.println("Esta opcion no es correcta");
                    break;
            }
        }
        while (opcion != 9);
    }
}



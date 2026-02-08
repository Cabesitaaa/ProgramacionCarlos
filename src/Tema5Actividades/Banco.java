package Tema5;
import java.util.LinkedList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        LinkedList<UsuarioBanco> cola = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---COLA BANCO---");
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Atender Siguiente");
            System.out.println("3. Abandonar");
            System.out.println("4. Salir");

            System.out.print("Opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    in.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = in.nextLine();

                    System.out.print("DNI: ");
                    String dni = in.nextLine();

                    System.out.print("Edad: ");
                    int edad = in.nextInt();
                    in.nextLine();

                    cola.add(new UsuarioBanco(nombre, dni, edad));
                    System.out.println("Usuario añadido correctamente a la cola");
                    break;

                case 2:
                    UsuarioBanco atendido = cola.pollFirst();
                    if (atendido != null) {
                        System.out.println("Atendiendo ahora a: " + atendido.getNombre());
                    } else {
                        System.out.println("No hay nadie esperando");
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.print("¿Qué posición abandona? (0 - " + (cola.size() - 1) + "): ");
                        int pos = in.nextInt();
                        if (pos >= 0 && pos < cola.size()) {
                            UsuarioBanco seVa = cola.remove(pos);
                            System.out.println(seVa.getNombre() + " ha salido de la fila");
                        } else {
                            System.out.println("Esa posición no es válida");
                        }
                    }
                    break;
                }
            } while (opcion != 4);
        }
    }
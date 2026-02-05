package Tema5Actividades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gym {
    private static Scanner in = new Scanner(System.in);
    private static Map<String, UsuarioGym> gimnasio = new HashMap<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("---BIENVENIDO AL GIMNASIO---");
            System.out.println("1. Dar de alta usuario");
            System.out.println("2. Dar de baja usuario");
            System.out.println("3. Mostrar datos de usuarios");
            System.out.println("4. Modificar datos de usuarios");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---DAR DE ALTA UN USUARIO---");
                    System.out.println("Introduce el dni del usuario: ");
                    String dni = in.nextLine();
                    in.nextLine();

                    if (gimnasio.containsKey(dni)) {
                        System.out.println("El usuario ya existe");

                    } else {
                        System.out.println("Introduce el nombre del usuario: ");
                        String nombre = in.nextLine();

                        System.out.println("Introduce la edad del usuario: ");
                        int edad = in.nextInt();

                        gimnasio.put(dni, new UsuarioGym(nombre, edad));
                        System.out.println("Usuario registrado con éxito.");
                    }

                    break;
                case 2:
                    System.out.println("---DAR DE BAJA UN USUARIO---");
                    System.out.println("Introduce el dni del usuario a eliminar: ");
                    String dniEliminar = in.nextLine();
                    in.nextLine();

                    if (gimnasio.remove(dniEliminar) != null) {
                        System.out.println("Usuario eliminado");
                    }  else {
                        System.out.println("Error: El usuario no existe.");
                    }
                    break;
                case 3:
                    System.out.println("---MOSTRAR DATOS DE UN USUARIO---");
                    System.out.print("Introduce DNI para poder revisar los datos: ");
                    String dniDatos = in.nextLine();
                    in.nextLine();

                    UsuarioGym a = gimnasio.get(dniDatos);
                    if (a != null) {
                        System.out.println("Datos: " + a);
                    } else {
                        System.out.println("Error: Usuario no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("---MODIFICAR DATOS DE UN USUARIO---");
                    System.out.print("Introduce DNI del usuario a modificar: ");
                    String dniModificar = in.nextLine();
                    UsuarioGym b = gimnasio.get(dniModificar);

                    if (b != null) {
                        System.out.print("Nuevo nombre (actual: " + b.getNombre() + "): ");
                        b.setNombre(in.nextLine());
                        in.nextLine();

                        System.out.print("Nueva edad (actual: " + b.getEdad() + "): ");
                        b.setEdad(Integer.parseInt(in.nextLine()));
                        in.nextLine();

                        System.out.println("Usuario actualizado.");
                    } else {
                        System.out.println("Error: No se puede modificar un usuario que no existe.");
                    }
                    break;
                case 5:
                    System.out.println("---SALIR DEL PROGRAMA---");
                    break;
                default: System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
    }
}




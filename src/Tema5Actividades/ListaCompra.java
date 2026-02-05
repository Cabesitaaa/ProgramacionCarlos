package Tema5Actividades;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> productos = new HashSet<>();
        String producto;
        int cantidad;

        System.out.println("Introduce la cantidad de producto que has comprado:");
        cantidad = in.nextInt();
        in.nextLine();

        System.out.println("Introduce los productos que has comprado: ");
        for (int i = 0; i < cantidad; i++) {
            producto = in.nextLine();

            if (productos.contains(producto)) {
                System.out.println("El producto que has introducido ya esta en tu lista");
                cantidad++;
            } else {
                productos.add(producto);
            }
        }
        System.out.println("Tu lista es:" + productos);
    }
}

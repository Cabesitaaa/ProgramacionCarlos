package Tema5;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompraAmpliado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listaDeseos = new HashSet<>();
        Set<String> carro = new HashSet<>();
        int opcion;

        do {
            System.out.println("---COMPRA---");
            System.out.println("1. Añadir a la lista de deseos");
            System.out.println("2. Añadir al carro");
            System.out.println("3. Ver carro y lista de deseos");
            System.out.println("4. Salir");
            System.out.print("Selecciona: ");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {

                    case 1:
                    System.out.print("Introduce producto para la lista: ");
                    String pDeseo = in.nextLine().toLowerCase();

                    if (!listaDeseos.add(pDeseo)) {
                        System.out.println(pDeseo + " ya está en tu lista.");
                    } else {
                        System.out.println("Producto añadido a deseos.");
                    }
                    break;

                    case 2:
                        System.out.print("Qué producto quieres meter en el carro? ");
                        String pCarro = in.nextLine().toLowerCase();
                        carro.add(pCarro);
                        System.out.println("Has metido " + pCarro + " en el carro.");
                        break;

                    case 3:
                        System.out.println("---CARRO ACTUAL---");
                        System.out.println("Productos en el carro: " + carro);

                        Set<String> faltantes = new HashSet<>(listaDeseos);
                        faltantes.removeAll(carro);

                        if (faltantes.isEmpty()) {
                            System.out.println("Todo comprado");
                        } else {
                            System.out.println("Te falta añadir al carro: " + faltantes);
                        }

                        Set<String> comprasPrevistas = new HashSet<>(carro);
                        comprasPrevistas.retainAll(listaDeseos);
                        System.out.println("Productos del carro que estaban en tu lista: " + comprasPrevistas);
                        break;
            }
        } while (opcion != 4);
    }
}
package Arrays;

import java.util.Scanner;

public class MenuArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] v1 = null;
        int[] v2 = null;

        int opcion;

        do {
            System.out.println("MENU DE ARRAYS");
            System.out.println("1. Introducir vector 1");
            System.out.println("2. Introducir vector 2");
            System.out.println("3. Imprimir vector 1");
            System.out.println("4. Máximo, mínimo y media");
            System.out.println("5. Buscar elemento en v1");
            System.out.println("6. Sumar vectores");
            System.out.println("7. Restar vectores");
            System.out.println("8. Producto escalar");
            System.out.println("9. Invertir vector 1 (nuevo)");
            System.out.println("10. Invertir vector 1 (modifica original)");
            System.out.println("11. ¿Es capicúa v1?");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = in.nextInt();

            switch(opcion){

                case 1: v1 = pedirVector(in); break;

                case 2: v2 = pedirVector(in); break;

                case 3:
                    if(v1==null) v1 = pedirVector(in);
                    MyArray.imprimir(v1);
                    break;

                case 4:
                    if(v1==null) v1 = pedirVector(in);
                    System.out.println("Máx: " + MyArray.max(v1));
                    System.out.println("Mín: " + MyArray.min(v1));
                    System.out.println("Media: " + MyArray.media(v1));
                    break;

                case 5:
                    if(v1==null) v1 = pedirVector(in);
                    System.out.print("Número a buscar: ");
                    int n = in.nextInt();
                    System.out.println("Existe → " + MyArray.existir(v1,n));
                    break;

                case 6:
                    if(v1==null) v1 = pedirVector(in);
                    if(v2==null) v2 = pedirVector(in);
                    MyArray.imprimir(MyArray.sumvec(v1,v2));
                    break;

                case 7:
                    if(v1==null) v1 = pedirVector(in);
                    if(v2==null) v2 = pedirVector(in);
                    MyArray.imprimir(MyArray.resvec(v1,v2));
                    break;

                case 8:
                    if(v1==null) v1 = pedirVector(in);
                    if(v2==null) v2 = pedirVector(in);
                    System.out.println("Producto escalar = " + MyArray.escalar(v1,v2));
                    break;

                case 9:
                    if(v1==null) v1 = pedirVector(in);
                    MyArray.imprimir(MyArray.invertir(v1));
                    break;

                case 10:
                    if(v1==null) v1 = pedirVector(in);
                    MyArray.invertirposicion(v1);
                    MyArray.imprimir(v1);
                    break;

                case 11:
                    if(v1==null) v1 = pedirVector(in);
                    System.out.println("Capicúa → " + MyArray.esCapicua(v1));
                    break;

                case 0:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while(opcion!=0);
    }

    public static int[] pedirVector(Scanner sc){
        System.out.println("Introduce números (x para parar)");
    //array temporal
        int[] temp = new int[1000];
        int count = 0;

        while(true){
            System.out.print("Valor " + (count+1) + ": ");
            if(sc.hasNextInt()){
                temp[count] = sc.nextInt();
                count++;
            }else{
                String parar = sc.next();
                if(parar.equalsIgnoreCase("x")) break;
                else System.out.println("Valor no válido.");
            }
        }

        int[] v = new int[count];
        for(int i=0;i<count;i++){
            v[i]=temp[i];
        }
        return v;
    }
}

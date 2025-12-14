package Arrays;

import java.util.Scanner;

public class WifiCoberturaArray {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);

        int[] hotel= new int[20];

        int habitacion, potencia;
                do{
                    System.out.println("Introduce el numero de habitacion para colocar el router(1-20)");
                    habitacion=in.nextInt();
                }while(habitacion<1 || habitacion>20);
                do{
                    System.out.println("Elige la potencia del router (1-6)");
                    potencia=in.nextInt();
                }while (potencia< 1 || potencia >6);
                int pos=habitacion-1;

                hotel[pos] = potencia;

    for(int i = pos + 1; i < hotel.length; i++){
            potencia--;
            if(potencia <= 0) break;
            hotel[i] = potencia;
        }
        potencia = hotel[pos];

        for(int i = pos - 1; i >= 0; i--){
            potencia--;
            if(potencia <= 0) break;
            hotel[i] = potencia;
        }
        for(int x : hotel) System.out.print(x+" ");
    }
}

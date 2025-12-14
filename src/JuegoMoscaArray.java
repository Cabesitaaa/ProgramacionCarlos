package Arrays;
import java.util.Random;
import java.util.Scanner;
public class JuegoMoscaArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        int[] tablero = new int[15];
        int mosca = ran.nextInt(15);
        boolean atrapada= false;
        int intentos= 0;

        System.out.println("JUEGO DE LA MOSCA");
        System.out.println("En este juego tienes que atrapar a la mosca en un tablero de 15 casillas");
        System.out.println("Intenta adivinar dónde esta");
        System.out.println("Si estás al lado, la mosca se escapa");

        do{
            System.out.print("Elige una posición (1-15): ");
            int intento = in.nextInt() - 1;
            intentos++;
            if (intento==mosca){
                System.out.println("Atrapaste a la mosca en "+intentos+" intentos!");
                atrapada=true;
            }else if (intento== mosca-1 || intento== mosca+1){
                System.out.println("Has estado cerca! La mosca ahora se movera a una posición distinta, la asustaste...");
                mosca=ran.nextInt(15);
            }else{
                System.out.println("No has encontrado nada, tampoco esta cerca de esta posicion. Sigue buscando");
            }
        }while(!atrapada);
        System.out.println("Fin del juego");
    }
}
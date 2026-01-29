package Tema4;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class RelojMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora, minuto, segundo;
        do {
            System.out.println("Introduce la hora del 0 al 23: ");
            hora = in.nextInt();

            System.out.println("Introduce los minutos del 0 al 59: ");
            minuto = in.nextInt();

            System.out.println("Introduce los segundos del 0 al 59 ");
            segundo = in.nextInt();

            if (hora > 23 || hora < 0 || minuto > 59 || minuto < 0 || segundo > 59 || segundo < 0) {
                System.out.println("La hora introducida no es correcta");
            }
        } while (hora > 23 || hora < 0 || minuto > 59 || minuto < 0 || segundo > 59 || segundo < 0);
        Reloj r1 = new Reloj();
        Reloj r2 = new Reloj(hora, minuto, segundo);

        int formato;
        do {
            System.out.println("Que formato quieres para la hora (12 o 24): ");
            formato = in.nextInt();
        } while (formato != 12 && formato !=24);
            if (formato == 12) {
                r1.setFormato24h(false);
                r2.setFormato24h(false);
            } else {
                r1.setFormato24h(true);
                r2.setFormato24h(true);
            }
            r1.mostrarHora();
            r2.mostrarHora();
        }
    }

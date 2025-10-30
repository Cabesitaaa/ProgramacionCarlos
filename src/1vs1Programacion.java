import java.util.Random;
import java.util.Scanner;

public class Videojuego1vs1Turnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bienvenidos a la Arena jugadores!!");
        System.out.println("Pulsa 1 para empezar la partida");
        int empezar = in.nextInt();

        //Estadisticas jugador1 y jugador2
        String jug1 = "", jug2 = "";
        int vel1, ata1, def1, vid1;
        int vel2, ata2, def2, vid2;
        int suma1, suma2;
        double danio;

        //Variables en combate
        int ronda = 1;
        int jugadorActivo;
        int accion;

        do {
            //Estadisticas jugador1
            System.out.println("Jugador 1 introduce tu nombre: ");
            jug1 = in.next();

            System.out.println("Perfecto! Ahora introduce tus estadisticas. Las estadisticas no pueden superar en conjunto los 500 puntos, y cada estadistica solo puede tener como maximo 200 puntos.");

            System.out.println("Introduce la velocidad de tu personaje: ");
            vel1 = in.nextInt();

            System.out.println("Introduce el ataque de tu personaje: ");
            ata1 = in.nextInt();

            System.out.println("Introduce la defensa de tu personaje: ");
            def1 = in.nextInt();

            System.out.println("Introduce la vida de tu personaje: ");
            vid1 = in.nextInt();

            suma1 = vel1 + ata1 + def1 + vid1;

            if (vel1 > 200 || vel1 < 1 || ata1 < 1 || ata1 > 200 || def1 < 1 || def1 > 200 || vid1 < 1 || vid1 > 200) {
                System.out.println("Las estadisticas no pueden ser menos de 1 y mayor de 200");
                System.out.println(jug1 + "por favor, vuelve a introducir todos los datos.\n");
            } else if (suma1 > 500) {
                System.out.println("Las estadisticas no pueden superar los 500 puntos en conjunto");
                System.out.println(jug1 + " por favor, vuelve a introducir todos los datos.\n");
            } else {
                System.out.println("Estadísticas guardadas correctamente para " + jug1 + "!");
            }
        }
        while (vel1 > 200 || vel1 < 1 || ata1 < 1 || ata1 > 200 || def1 < 1 || def1 > 200 || vid1 < 1 || vid1 > 200 || (vel1 + ata1 + def1 + vid1) > 500);

        //Estadisticas jugador2
        do {
            System.out.println("Jugador 2 introduce tu nombre: ");
            jug2 = in.next();

            System.out.println("Perfecto! Ahora introduce tus estadisticas. Las estadisticas no pueden superar en conjunto los 500 puntos, y cada estadistica solo puede tener como maximo 200 puntos.");

            System.out.println("Introduce la velocidad de tu personaje: ");
            vel2 = in.nextInt();

            System.out.println("Introduce el ataque de tu personaje: ");
            ata2 = in.nextInt();

            System.out.println("Introduce la defensa de tu personaje: ");
            def2 = in.nextInt();

            System.out.println("Introduce la vida de tu personaje: ");
            vid2 = in.nextInt();

            suma2 = vel2 + ata2 + def2 + vid2;

            if (vel2 > 200 || vel2 < 1 || ata2 < 1 || ata2 > 200 || def2 < 1 || def2 > 200 || vid2 < 1 || vid2 > 200) {
                System.out.println("Las estadisticas no pueden ser menos de 1 y mayor de 200");
                System.out.println(jug2 + "por favor, vuelve a introducir todos los datos.\n");
            } else if (suma2 > 500) {
                System.out.println("Las estadisticas no pueden superar los 500 puntos en conjunto");
                System.out.println(jug2 + " por favor, vuelve a introducir todos los datos.\n");
            } else {
                System.out.println("Estadísticas guardadas correctamente para " + jug2 + "!");
            }
        }
        while (vel2 > 200 || vel2 < 1 || ata2 < 1 || ata2 > 200 || def2 < 1 || def2 > 200 || vid2 < 1 || vid2 > 200 || (vel2 + ata2 + def2 + vid2) > 500);

        //Combate
        System.out.println("Bienvenidos al combate " + jug1 + " y " + jug2 + " !!");
        System.out.println(jug1 + " vs " + jug2 + "!!");

        //1r turno (Ataca el que ma velocidad tenga)
        if (vel1 > vel2) {
            jugadorActivo = 1;
            System.out.println(jug1 + " es mas rapido y ataca primero");
        } else if (vel2 > vel1) {
            jugadorActivo = 2;
            System.out.println(jug2 + " es mas rapido y ataca primero");
        } else {

            //Sorteo 1r Turno si son velocidades iguales
            jugadorActivo = random.nextInt(2) + 1;
            if (jugadorActivo == 1) {
                System.out.println("Las velocidades son iguales " + jug1 + " gana el sorteo y atacara primero!");
            } else {
                System.out.println("Las velocidades son iguales " + jug2 + " gana el sorteo y atacara primero");
            }
        }

        while (vid1 > 0 && vid2 > 0) {
            System.out.println("===== RONDA " + ronda + " =====");

            //ATAQUE JUGADOR 1
            System.out.println("Turno de " + jug1 + ". Pulsa 1 y presiona el Enter para atacar\"⚔\\uFE0F\":");
            accion = in.nextInt();
            if (accion != 1) {
                System.out.println("Pulsa el numero correcto. Pulsa 1 para atacar:");
            }

            danio = ata1 - (def2 * 0.2);
            danio += random.nextInt(6);
            danio= random.nextInt(10)+5;
            if (danio < 1) danio = 5;

            //Golpe critico jugador 1
            if (random.nextDouble() < 0.25) {
                danio += 10;
                System.out.println("💥 ¡GOLPE CRÍTICO de " + jug1 + "!");

            }

            vid2 -= danio;
            if (vid2 < 0) vid2 = 0;
            System.out.println("⚔\uFE0F"+jug1 + " ataca a " + jug2 + " y causa " + danio + " de daño.");
            System.out.println("♥\uFE0FVida de " + jug2 + ": " + vid2);

            //ATAQUE JUGADOR 2
            if (vid2 > 0) {
                System.out.println("Turno de " + jug2 + ". Pulsa 2 y presiona Enter para atacar⚔\uFE0F:");
                accion = in.nextInt();
                if (accion != 2) {
                    System.out.println("Pulsa el numero correcto. Pulsa 2 para atacar:");
                    accion = in.nextInt();
                }
                danio = ata2 - (def2 * 0.2);
                danio += random.nextInt(6);
                if (danio > 15) {
                    danio= random.nextInt(10)+5;
                }
                if (danio < 1) danio = 5;

                //Golpe critico jugador 2
                if (random.nextDouble() < 0.25) {
                    danio += 10;
                    System.out.println("💥 ¡GOLPE CRÍTICO de " + jug2 + "!");
                }

                vid1 -= danio;
                if (vid1 < 0) vid1 = 0;

                System.out.println("⚔\uFE0F"+jug2 + " ataca a " + jug1 + " y causa " + danio + " de daño.");
                System.out.println("♥\uFE0FVida de " + jug1 + ": " + vid1);
            }

            //FIN DE RONDA
            System.out.println("=====Fin de la ronda " +ronda+"=====" );
            System.out.println("♥\uFE0FVida de " + jug1 + ": " + vid1);
            System.out.println("♥\uFE0FVida de " + jug2 + ": " + vid2);

            //Avanzar a la siguiente ronda
            System.out.println("Pulsa cualquier tecla y presiona Enter para avanzar a la siguiente ronda:");
            in.next();

            ronda++;
        }

        //FIN DEL COMBATE
        if (vid1 <= 0 && vid2 <= 0) {
            System.out.println("¡Empate! Ambos habeis sido eliminados al mismo tiempo.");
        } else if (vid1 <= 0) {
            System.out.println("\uD83C\uDFC6¡" + jug2 + " gana el combate!");
        } else {
            System.out.println("\uD83C\uDFC6¡" + jug1 + " gana el combate!");
        }
    }
}

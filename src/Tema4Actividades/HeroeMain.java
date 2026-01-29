package Tema4Actividades;
import java.util.ArrayList;
import java.util.Random;
public class HeroeMain {
    public static void main(String[] args) {
        Random random = new Random();

        //Mi heroe
        Heroe heroe = new Heroe("Romanian Final Boss", 10, 100, 100, 10, 60, 50);
        int hordasSobrevividas = 0;

        System.out.println("===COMIENZA EL JUEGO===");
        System.out.println(heroe);

        while (heroe.getHealth() > 0) {
            hordasSobrevividas++;
            System.out.println("---LLEGA LA HORDA NÚMERO " + hordasSobrevividas + " ---");

            //Aparecen entre 1 y 3 enemigos
            ArrayList<Heroe> enemigos = new ArrayList<>();
            int numEnemigos = random.nextInt(3) + 1;
            for (int i = 0; i < numEnemigos; i++) {
                enemigos.add(new Heroe("Horda" + (i + 1), 1, 25, 30, 1, 10, 15));
            }
            System.out.println("Han aparecido " + numEnemigos + " enemigos.");

            //Lucha por turnos
            while (heroe.getHealth() > 0 && !enemigos.isEmpty()) {

                //Posible huida de la horda
                for (int i = enemigos.size() - 1; i >= 0; i--) {
                    if (random.nextDouble() < 0.10) {
                        System.out.println("Un enemigo ha huido");
                        enemigos.remove(i);
                    }
                }

                // Si todos huyen se termina la horda
                if (!enemigos.isEmpty()) {

                    //Mi turno
                    // Atacamos al primer enemigo de la lista
                    Heroe objetivo = enemigos.get(0);
                    heroe.attack(objetivo);

                    if (objetivo.getHealth() <= 0) {
                        System.out.println("Has derrotado a un enemigo");
                        enemigos.remove(0);
                    }

                    //Turno de la horda
                    for (Heroe e : enemigos) {
                        if (heroe.getHealth() > 0) {
                            e.attack(heroe);
                        }
                    }
                }

                //Eventos posbiles despues de la horda
                if (heroe.getHealth() > 0) {

                    // Probabilidad de Poción
                    if (random.nextDouble() < 0.10) {
                        System.out.println("Encuentras una pocion pequeña de vida");
                        heroe.pocionVida();
                    }
                    // Probabilidad de Descansar
                    if (random.nextDouble() < 0.001) {
                        System.out.println("Puedes descansar");
                        heroe.rest();
                    }
                    System.out.println("Estado tras horda: " + heroe);
                }
            }
            //Fin del juego
            System.out.println("=============================");
            System.out.println("EL HÉROE HA CAÍDO");
            System.out.println("Sobreviviste a " + hordasSobrevividas + " hordas.");
            System.out.println("=============================");
        }
    }
}
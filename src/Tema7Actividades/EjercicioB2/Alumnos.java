package Tema7Actividades.EjercicioB2;

public class Alumnos {
        String nombreCompleto;
        double media;

        public Alumnos(String nombreCompleto, double media) {
            this.nombreCompleto = nombreCompleto;
            this.media = media;
        }

        @Override
        public String toString() {
            return String.format("%-25s | Media: %.2f", nombreCompleto, media);
        }
    }


package Tema6.Publicacion;
public class PublicacionVideoActualizado implements PublicacionConReaccion, AbrirPublicacion {
    private String tituloVideo;
    private int duracionSegundos;

    public PublicacionVideoActualizado() {
        this.tituloVideo = "";
        this.duracionSegundos = 0;
    }

    public PublicacionVideoActualizado(String tituloVideo, int duracionSegundos) {
        this.tituloVideo = tituloVideo;
        this.duracionSegundos = duracionSegundos;
    }

    public String getTituloVideo() {
        return tituloVideo;
    }
    public void setTituloVideo(String tituloVideo) {
        this.tituloVideo = tituloVideo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    @Override
    public void publicar() {
        System.out.println("Procesando y publicando vídeo de " + duracionSegundos + " seg: " + tituloVideo);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo el enlace del vídeo.");
    }

    @Override
    public void abrir() {
        System.out.println("Reproduciendo el vídeo en el reproductor multimedia.");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("Nuevo comentario en tu vídeo '" + tituloVideo + "': '" + texto + "'");
    }
}
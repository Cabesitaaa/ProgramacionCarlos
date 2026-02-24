package Tema6.Publicacion;
public class PublicacionTexto implements Publicacion {
    private String contenido;

    public PublicacionTexto() {
        this.contenido = "";
    }

    public PublicacionTexto(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando estado de texto: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo el texto de un estado de un amigo.");
    }
}
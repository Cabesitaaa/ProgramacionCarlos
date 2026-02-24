package Tema6.Publicacion;
public class PublicacionTextoActualizado implements PublicacionConReaccion {
    private String contenido;

    public PublicacionTextoActualizado() {
        this.contenido = "";
    }

    public PublicacionTextoActualizado(String contenido) {
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

    @Override
    public void comentar(String texto) {
        System.out.println("Nuevo comentario en tu texto: '" + texto + "'");
    }
}
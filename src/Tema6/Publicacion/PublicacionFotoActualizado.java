package Tema6.Publicacion;
public class PublicacionFotoActualizado implements PublicacionConReaccion, AbrirPublicacion {
    private String nombreArchivo;

    public PublicacionFotoActualizado() {
        this.nombreArchivo = "";
    }

    public PublicacionFotoActualizado(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void publicar() {
        System.out.println("Subiendo foto al servidor: " + nombreArchivo);
    }

    @Override
    public void compartir() {
        System.out.println("Enviando foto por mensaje directo.");
    }

    @Override
    public void abrir() {
        System.out.println("Ampliando la foto [" + nombreArchivo + "] a pantalla completa.");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("💬 Nuevo comentario en tu foto: '" + texto + "'");
    }
}
package Tema6.Ficha;
public class Revista extends Ficha {
    private int numPublicacion;
    private int anio;

    public Revista() {
        this.numPublicacion = 0;
        this.anio = 0;
        super();
    }

    public Revista(int numero, String titulo, int numPublicacion, int anio) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }

    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.print("REVISTA");
        super.mostrarDetalles();
        System.out.println("Publicación Nº: " + numPublicacion + " | Año: " + anio);
    }
}
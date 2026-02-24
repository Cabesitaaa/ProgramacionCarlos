package Tema6.Ficha;
public class DVD extends Ficha {
    private String director;
    private int anio;
    private String tipo;

    public DVD() {
        this.director = "";
        this.anio = 0;
        this.tipo = "";
        super();
    }

    public DVD(int numero, String titulo, String director, int anio, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.print("DVD");
        super.mostrarDetalles();
        System.out.println(" Director: " + director + " | Año: " + anio + " | Género: " + tipo);
    }
}
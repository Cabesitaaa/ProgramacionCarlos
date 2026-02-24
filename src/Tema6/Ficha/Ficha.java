package Tema6.Ficha;
public abstract class Ficha {
    private int numero;
    private String titulo;

    public Ficha() {
        this.numero = 0;
        this.titulo = "";
    }

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDetalles() {
        System.out.println("Ficha #" + numero + " | Título: '" + titulo + "'");
    }
}
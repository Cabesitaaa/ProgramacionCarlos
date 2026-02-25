package Examen2avaCarlosCabezaMartinez.Ejercicio1;

public class Libro {
    private String isbn;
    private String nombre;
    private String autor;
    public int nPag;
    private String genero;

    public Libro(String ISBN, String nombre, String autor, int nPag, String genero) {
        this.isbn = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.nPag = nPag;
        this.genero = genero;

    }

    public Libro() {
        this.isbn = "";
        this.nombre = "";
        this.autor = "";
        this.nPag = 0;
        this.genero = "";

    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    @Override
    public String toString() {
        return "Nombres: " +nombre+ " / Nombre autor: " +autor;
    }
}

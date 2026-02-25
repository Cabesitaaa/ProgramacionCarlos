package Examen2avaCarlosCabezaMartinez.Ejercicio3;

public class Pocion extends Articulo {
    private int nivel;
    String efectos;


    public Pocion(int nivel, String efectos, String nombre, boolean gratis) {
        super(nombre, gratis);
        this.nivel = nivel;
        this.efectos = efectos;
    }

    public Pocion() {
        super();
        this.nivel = 0;
        this.efectos = "";
    }

    public String getEfectos() {
        return efectos;
    }

    public void setEfectos(String efectos) {
        this.efectos = efectos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

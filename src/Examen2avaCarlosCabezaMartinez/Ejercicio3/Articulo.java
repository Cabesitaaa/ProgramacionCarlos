package Examen2avaCarlosCabezaMartinez.Ejercicio3;
public abstract class Articulo {
    String nombre;
    boolean gratis;

    public Articulo(String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }
    public Articulo() {
        this.nombre = "";
        this.gratis = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getGratis() {
        return gratis;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }

}

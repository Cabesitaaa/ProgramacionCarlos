package Examen2avaCarlosCabezaMartinez.Ejercicio3;

public class Accesorio extends Articulo {
    private String nombreAccesorio;

    public Accesorio(String nombreAccesorio, String nombre, boolean gratis) {
        super(nombre,gratis);
        this.nombreAccesorio = nombreAccesorio;
    }
    public Accesorio() {
        super();
        this.nombreAccesorio = "";
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }
}

package Examen2avaCarlosCabezaMartinez.Ejercicio3;

public class Pokebola extends Articulo {
    private String tipoPokebola;

    public Pokebola(String tipoPokebola, String nombre, boolean gratis) {
        super(nombre,gratis);
        this.tipoPokebola = tipoPokebola;
    }

    public Pokebola() {
        super();
        this.tipoPokebola = "";
    }

    public String getTipoPokebola() {
        return tipoPokebola;
    }

    public void setTipoPokebola(String tipoPokebola) {
        this.tipoPokebola = tipoPokebola;
    }
}

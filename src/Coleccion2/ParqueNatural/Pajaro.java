package Coleccion2.ParqueNatural;
class Pajaro extends Avistamiento {
    private double peso;
    private String especie;

    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    public Pajaro() {
        super();
        this.peso = 0.0;
        this.especie = "";
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Avistamiento Pajaro [Hora: " + getHora() + ", Peso: " + peso + "kg " + ", Especie: " + especie + "]";
    }
}


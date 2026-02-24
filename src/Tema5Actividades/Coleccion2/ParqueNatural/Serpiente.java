package Coleccion2.ParqueNatural;

class Serpiente extends Avistamiento {
    private double longitud;
    private String especie;

    public Serpiente(int hora, double longitud, String especie) {
       super(hora);
       this.longitud = longitud;
       this.especie = especie;
    }

    public Serpiente() {
        super();
        this.longitud = 0.0;
        this.especie = "";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Avistamiento Serpiente [Hora: " + getHora() + ", Longitud: " + longitud + "m " + ", Especie: " + especie + "]";
    }

}

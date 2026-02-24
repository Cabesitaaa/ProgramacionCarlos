package Coleccion2.ParqueNatural;
class ManadaLobos extends Avistamiento {
    private int numLobos;
    private String observaciones;

    public ManadaLobos(int hora, int numLobos, String observaciones) {
        super(hora);
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    public ManadaLobos() {
        super();
        this.numLobos = 0;
        this.observaciones = "";
    }

    public int getNumLobos() {
        return numLobos;
    }

    public void setNumLobos(int numLobos) {
        this.numLobos = numLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Avistamiento ManadaLobos [Hora: " + getHora() + ", Número de lobos: " +numLobos + ", Observaciones: " + observaciones + "]";
    }
}
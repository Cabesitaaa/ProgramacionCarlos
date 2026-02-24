package Coleccion2.ParqueNatural;

abstract class Avistamiento {
    private int hora;

    public Avistamiento(int hora) {
            this.hora = hora;
    }

    public Avistamiento() {
        this.hora = 0;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public abstract String toString();
}

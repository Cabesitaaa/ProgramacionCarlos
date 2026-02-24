package Tema6.Vehiculo;
class Camion extends Vehiculo {
    private double pesoMaximoAutorizado;
    private boolean mercanciaPeligrosa;

    public Camion(String marca, String modelo, double pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
        super(marca, modelo);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }
    public Camion() {
        super("", "");
        this.pesoMaximoAutorizado = 0.0;
        this.mercanciaPeligrosa = false;
    }
    public double getPesoMaximoAutorizado() {
        return pesoMaximoAutorizado;
    }

    public void setPesoMaximoAutorizado(double pesoMaximoAutorizado) {
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
    }

    public boolean isMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }
}
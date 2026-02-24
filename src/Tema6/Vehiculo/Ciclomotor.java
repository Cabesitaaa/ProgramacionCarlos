package Tema6.Vehiculo;
class Ciclomotor extends Vehiculo {
    private int cilindrada;

    public Ciclomotor(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public Ciclomotor() {
        super("", "");
        this.cilindrada = 0;
    }

    public boolean necesitaCarnet() {
        return this.cilindrada >= 125;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
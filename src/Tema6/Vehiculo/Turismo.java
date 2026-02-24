package Tema6.Vehiculo;
class Turismo extends Vehiculo {
    private int numeroPlazas;
    private String tipoUso;

    public Turismo(String marca, String modelo, int numeroPlazas, String tipoUso) {
        super(marca, modelo);
        this.numeroPlazas = numeroPlazas;
        this.tipoUso = tipoUso;
    }
    public Turismo() {
        super("", "");
        this.numeroPlazas = 0;
        this.tipoUso = "";
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getTipoUso() {
        return tipoUso;
    }

    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }
}
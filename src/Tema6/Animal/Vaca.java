package Tema6.Animal;
public class Vaca extends Animal {
    private double litrosLecheDiarios;

    public Vaca() {
        this.litrosLecheDiarios = 0.0;
        super();
    }

    public Vaca(String nombre, double litrosLecheDiarios) {
        super(nombre);
        this.litrosLecheDiarios = litrosLecheDiarios;
    }

    public double getLitrosLecheDiarios() {
        return litrosLecheDiarios;
    }

    public void setLitrosLecheDiarios(double litrosLecheDiarios) {
        this.litrosLecheDiarios = litrosLecheDiarios;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + ": Muuuuuu!");
    }

    public void pastar() {
        System.out.println(getNombre() + " está pastando en el prado.");
    }
}
package Tema6.Figuras2D;
public class Circulo extends Figura2D {
    private double radio;

    public Circulo() {
        this.radio = 0;
        super();
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo [" + super.toString() + "]";
    }
}
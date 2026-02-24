package Tema6.Figuras2D;
public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 0.0;
        this.altura = 0.0;
        super();
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectángulo [" + super.toString() + "]";
    }
}
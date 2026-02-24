package Tema6.Figuras2D;
public abstract class Figura2D {
    private String color;

    public Figura2D() {
        this.color = "";
    }

    public Figura2D(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Color: " + color + " | Área: " + area() + " | Perímetro: " + perimetro();
    }
}
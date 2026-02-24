package Tema6.Figuras2D;
public class Cuadrado extends Rectangulo {

    //Los atributos se heredan del Rectangulo
    public Cuadrado() {

        super();
    }

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }


    public double getLado() {
        return getBase();
    }

    public void setLado(double lado) {
        setBase(lado);
        setAltura(lado);
    }

    @Override
    public void setBase(double base) {
        super.setBase(base);
        super.setAltura(base);
    }

    @Override
    public void setAltura(double altura) {
        super.setBase(altura);
        super.setAltura(altura);
    }

    @Override
    public String toString() {
        return "Cuadrado [" + super.toString() + "]";
    }
}
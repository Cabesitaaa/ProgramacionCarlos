package Tema6.Figuras2D;
    public class Triangulo extends Figura2D {
        private double base;
        private double altura;
        private double lado1;
        private double lado2;

        public Triangulo() {
            super();
            this.lado1 = 0;
            this.lado2 = 0;
            this.base = 0;
            this.altura = 0;
        }

        public Triangulo(String color, double base, double altura, double lado1, double lado2) {
            super(color);
            this.base = base;
            this.altura = altura;
            this.lado1 = lado1;
            this.lado2 = lado2;
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

        public double getLado1() {
            return lado1;
        }

        public void setLado1(double lado1) {
            this.lado1 = lado1;
        }

        public double getLado2() {
            return lado2;
        }

        public void setLado2(double lado2) {
            this.lado2 = lado2;
        }

        @Override
        public double area() {
            return (base * altura) / 2;
        }

        @Override
        public double perimetro() {
            return base + lado1 + lado2;
        }

        @Override
        public String toString() {
            return "Triángulo [" + super.toString() + "]";
        }
    }

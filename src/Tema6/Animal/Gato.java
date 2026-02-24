package Tema6.Animal;
public class Gato extends Animal {
    private int vidasRestantes;

    public Gato() {
        this.vidasRestantes = 0;
        super();
    }

    public Gato(String nombre, int vidasRestantes) {
        super(nombre);
        this.vidasRestantes = vidasRestantes;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " : Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando");
    }
}


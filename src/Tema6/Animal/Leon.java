package Tema6.Animal;
public class Leon extends Animal {
    private boolean esMachoAlfa;

    public Leon() {
        this.esMachoAlfa = false;
        super();
    }

    public Leon(String nombre, boolean esMachoAlfa) {
        super(nombre);
        this.esMachoAlfa = esMachoAlfa;
    }

    public boolean isEsMachoAlfa() {
        return esMachoAlfa;
    }

    public void setEsMachoAlfa(boolean esMachoAlfa) {
        this.esMachoAlfa = esMachoAlfa;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " hace: ROAAAR!");
    }

    public void cazar() {
        System.out.println(getNombre() + " está acechando a su presa.");
    }
}

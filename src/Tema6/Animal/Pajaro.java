package Tema6.Animal;
public class Pajaro extends Animal {
    private String colorPlumas;

    public Pajaro() {
        this.colorPlumas = "";
        super();
    }

    public Pajaro(String nombre, String colorPlumas) {
        super(nombre);
        this.colorPlumas = colorPlumas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + ": Pío, pío!");
    }

    public void volar() {
        System.out.println(getNombre() + " está volando alto en el cielo.");
    }
}
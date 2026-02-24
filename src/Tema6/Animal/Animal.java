package Tema6.Animal;
public abstract class Animal {
    private String nombre;

    public Animal() {
        this.nombre = "";
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(this.nombre + " está comiendo su comida.");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo");
    }

    public abstract void hacerRuido();
}
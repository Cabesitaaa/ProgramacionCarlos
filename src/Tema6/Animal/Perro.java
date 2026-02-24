package Tema6.Animal;
public class Perro extends Animal {
    private String raza;

    public Perro() {
        this.raza = "";
        super();
    }

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + ": Guau, guau!");
    }

    public void buscarPelota() {
        System.out.println(getNombre() + " está buscando la pelota.");
    }
}
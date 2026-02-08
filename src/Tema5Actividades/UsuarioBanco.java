package Tema5;

public class UsuarioBanco {
    private String nombre;
    private String dni;
    private int edad;

    public UsuarioBanco(String nombre,String dni,int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String Datos() {
        return "Nombre: " +this.nombre + " - DNI: " +this.dni;
    }

}

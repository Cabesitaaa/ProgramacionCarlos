package Tema4;
public class Persona {

    //Atributos
    private int edad;
    private String nombre, apellidos;
    public final String dni;
    private static final int adultAge = 18;
    private static final int retiredAge = 65;

    //Constructores
    public Persona(int edad, String nombre, String apellidos, String dni) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Constructor vacío
    public Persona() {
        this.dni = null;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //comprobar que no me insertar una edad <0
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Metodos
    public void print() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
    }

    //Es adulto o no
    public boolean isAdult() {
        boolean adult=false;
        if (edad >= 18) {
           adult=true;
        } else {
            adult=false;
        }
        return adult;
    }

    //SOLO UN RETURN
    //Es jubilado o no
    public boolean isRetired() {
        boolean retired=false;
        if (edad >= 65) {
            retired=true;
        } else {
            retired=false;
        }
        return retired;
    }

    //Edad de diferencia
    public int ageDifference(Persona p) {
        return Math.abs(edad - p.edad);
    }
    public void estadoPersona() {
        if (isAdult()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        if (isRetired()) {
            System.out.println("Esta jubilado");
        } else {
            System.out.println("No esta jubilado");
        }
    }

    public static boolean checkDNI(String dni) {
        if (dni == null ||dni.length() != 9) return false;

        for (int i = 0; i < 8; i++)
            if (dni.charAt(i) < '0' || dni.charAt(i) > '9') return false;

        char ultima = dni.charAt(8);
        return (ultima >= 'A' && ultima <= 'Z') || (ultima >= 'a' && ultima <= 'z');
    }
}



package Tema7Actividades.Actividades2;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializarObjeto {
    public static void main(String[] args) {
        Persona persona = new Persona("Ximo", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(persona);
            System.out.println("Objeto Persona serializado y guardado en persona.dat");
        } catch (IOException e) {
            System.out.println("Error en la serialización: " + e.getMessage());
        }
    }
}
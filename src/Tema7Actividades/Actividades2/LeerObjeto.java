package Tema7Actividades.Actividades2;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class LeerObjeto {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona personaRecuperada = (Persona) ois.readObject();
            System.out.println("Objeto recuperado: ");
            System.out.println(personaRecuperada.toString());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto " + e.getMessage());
        }
    }
}
package Tema4;
public class PersonaMain {
    public static void main(String[] args) {

    //1a Persona
    Persona p1 = new Persona(18, "Andres","Porcar Baiter", "54817389A" );
    p1.print();
    p1.estadoPersona();
    System.out.println("EL DNI es valido? "+ Persona.checkDNI(p1.dni));
    System.out.println("\n");

    //2a Persona
    Persona p2 = new Persona(19, "Cristian", "De Jesus Guinot", "54666699A");
     p2.print();
     p2.estadoPersona();
     System.out.println("EL DNI es valido? "+ Persona.checkDNI(p2.dni));
     p1.ageDifference(p2);
     System.out.println("La diferencia de edad es: "+ p1.ageDifference(p2));
    }
}

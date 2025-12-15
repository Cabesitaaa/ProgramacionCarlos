package ExamenProgramacion;
import java.util.Scanner;
public class Main {
    public static void readOption() {
        System.out.println("---MENU EXAMEN---");
        System.out.println("a.Introducir notas");
        System.out.println("b.Introducir plantilla del examen");
        System.out.println("c.Corregir un examen");
        System.out.println("d.Introducir notas del ciclo");
        System.out.println("e.SALIR");
        System.out.println("Introduce una opcion:");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opcion;
        do {
            readOption();
            opcion = in.next();
            switch (opcion) {
                case "a":
                    double notasSobre50;
                    double notasSobre10;
                    int numAlumnos;
                    int contNotas = 0;
                    System.out.println("Introduce el numero de alumnos que tienes");
                    numAlumnos = in.nextInt();
                    System.out.println("Introduce las notas del modulo");
                    notasSobre50 = in.nextInt();
                    while (numAlumnos > contNotas) {
                        contNotas++;
                        if (contNotas == numAlumnos) {
                            System.out.println("Las notas han sido aceptadas");
                        }
                    } //He probado cosas durante 3 horas y no me sale nada, dejo esto por dejar algo
                    break;
                case "b":
                    System.out.println("---INTRODUCIR PLANTILLA EXAMEN---");
                    break;
                case "c":
                    System.out.println("---CORREGIR EXAMEN---");
                    break;
                case "d":
                    System.out.println("---INTRODUCIR NOTAS CICLO---");
                    break;
                case "e":
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion == "e");
    }
}

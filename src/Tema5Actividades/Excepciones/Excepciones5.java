package Tema5Actividades.Excepciones;
public class Excepciones5 {
    public static void imprimePositivo(int numP) throws Exception {
        if (numP < 0) {
            throw new Exception("Error: El numero " + numP + " es negativo.");
        }
        System.out.println("Numero positivo: " + numP);
    }

    public static void imprimeNegativo(int numG) throws Exception {
        if (numG >= 0) {
            throw new Exception("Error: El numero " + numG + " es positivo.");
        }
        System.out.println("Numero negativo: " + numG);
    }

    public static void main(String[] args){
        try {
            imprimePositivo(5);
            imprimePositivo(-1);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            imprimeNegativo(-4);
            imprimeNegativo(3);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

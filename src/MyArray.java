package Arrays;

public class MyArray {
    public static void imprimir(int[] num){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static int max(int[] num){
        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

    public static int min(int [] num){
        int min = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }

    public static double media(int[] num){
        int suma = 0;
        for(int i=0; i<num.length;i++){
            suma += num[i];
        }
        return (double) suma / num.length;
    }

    public static boolean existir(int[]num, int existe) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == existe) {
                return true;
            }
        }
        return false;
    }

    public static int[] sumvec(int[] a, int[] b){
        int[] r= new int[a.length];
        for(int i=0; i<a.length;i++){
            r[i]=a[i]+b[i];
        }
        return r;
    }

    public static int[] resvec(int[] a, int[] b){
        int[] r= new int[a.length];
        for(int i=0; i<a.length;i++){
            r[i]=a[i]-b[i];
        }
        return r;
    }

    public static int escalar(int[] a, int[] b){
        int esc = 0;
        for(int i=0; i<a.length;i++){
            esc += a[i] * b[i];
        }
        return esc;
    }

    public static int[] invertir(int [] v){
        int[] r = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            r[i] = v[v.length - 1 - i];
        }
        return r;
    }

    public static void invertirposicion(int[] v) {
        int i = 0;
        int j = v.length - 1;

        while (i < j) {
            int aux = v[i];
            v[i] = v[j];
            v[j] = aux;
            i++;
            j--;
        }
    }

    public static boolean esCapicua(int[] v) {
        for (int i = 0; i < v.length / 2; i++) {
            if (v[i] != v[v.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Arrays;

public class Caso2 {
    public static void main(String[] args) {
        /*
         * Dado un Array bidimensional con números enteros, devolver la posición donde
         * se encuentra el número más alto.
         */

        int[] numeros1 = { 8, 14, 10, 1, 2, 12, 6, 7, 5, 3 };
        int[] numeros2 = { 20, 11, 18, 17, 13, 15, 19, 4, 9, 16 };
        int tamanoArray = numeros1.length + numeros2.length;
        int[] numerosOrdenados = new int[tamanoArray];
        int max;
        int posicion;
        String queArray;

        numerosOrdenados = numerosAdd(tamanoArray, numeros1, numeros2);
        max = buscarNumeroAlto(numerosOrdenados);
        posicion = buscarPosicionNumero(numeros1, numeros2, max);
        queArray = buscarArrayNumero(numeros1, numeros2, max);
        System.out.println("el número " +max + " está en la posición " + posicion + " del " + queArray);

    }

    private static int[] numerosAdd(int tamanoArray, int[] datos1, int[] datos2) {
        int[] numeros = new int[tamanoArray];

        for (int i = 0; i < datos1.length; i++) {
            numeros[i] = datos1[i];
        }
        for (int i = datos1.length; i < datos1.length + datos2.length; i++) {
            numeros[i] = datos2[i - datos1.length];
        }
        return numeros;
    }

    private static int buscarNumeroAlto(int[] unArray) {
        int max;
        Arrays.sort(unArray);
        max = unArray[unArray.length - 1];
        return max;
    }

    private static int buscarPosicionNumero(int[] Array1, int[] Array2, int numero) {

        int longitud1 = Array1.length;
        int longitud2 = Array2.length;
        int i = 0;
        int posicion = -1;
        boolean encontrado = false;

        if (longitud1 > 0) {
            do {
                if (Array1[i] == (numero)) {
                    posicion = i;
                    encontrado = true;
                }
                i++;
            } while (i < longitud1 && !encontrado);
        }

        if (!encontrado) {
            i = 0;
            if (longitud2 > 0) {
                do {
                    if (Array2[i] == numero) {
                        posicion = i + longitud1;
                        encontrado = true;
                    }
                    i++;
                } while (i < longitud2 && !encontrado);
            }
        }

        return posicion;

    }
    private static String buscarArrayNumero(int[] Array1, int[] Array2, int numero) {

        int longitud1 = Array1.length;
        int longitud2 = Array2.length;
        int i = 0;
        int posicion = -1;
        boolean encontrado = false;
        boolean arrayEncontrado=false;
        String queArray;

        if (longitud1 > 0) {
            do {
                if (Array1[i] == (numero)) {
                    posicion = i;
                    encontrado = true;
                    arrayEncontrado=false;
                }
                i++;
            } while (i < longitud1 && !encontrado);
        }

        if (!encontrado) {
            i = 0;
            if (longitud2 > 0) {
                do {
                    if (Array2[i] == numero) {
                        posicion = i + longitud1;
                        encontrado = true;
                        arrayEncontrado=true;
                    }
                    i++;
                } while (i < longitud2 && !encontrado);
            }
        }
        if (encontrado && !arrayEncontrado){
            queArray ="Array 1";
        }else if (encontrado && arrayEncontrado) {
            queArray="Array 2";
        }else{
            queArray=null;
        }
        return queArray;

    }
}

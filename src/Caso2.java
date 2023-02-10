import java.util.Arrays;

public class Caso2 {
    public static void main(String[] args) {
        /*
         * ENUNCIADO:
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
        System.out.println("el número " + max + " está en la posición " + posicion + " del " + queArray);

    }

    /**
     * Une dos arrays de números enteros en uno solo
     * 
     * @param tamanoArray es un número entero con el tamaño que tendrá el array
     *                    final
     * @param datos1      es el primer Array a incluir
     * @param datos2      es el segundo Array a incluir
     * @retun El Array con los números de ambos arrays.
     */
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

    /**
     * Ordena un array y devuelve el número más alto del mismo
     * 
     * @param unArray el Array a ordenar
     * @return el número más alto del array
     */
    private static int buscarNumeroAlto(int[] unArray) {
        int max;
        Arrays.sort(unArray);
        max = unArray[unArray.length - 1];
        return max;
    }

    /**
     * Busca un número en dos arrays y devuelve la posición en la que lo ha
     * encontrado
     * 
     * @param Array1 el primer array en el que buscar el número
     * @param Array2 el segundo array en el que buscar el número
     * @param numero el número a buscar
     * @return la posición en la que se en cuentra el número (-1 en caso de que no
     *         exista)
     */
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

    /**
     * Busca en qué Array se encuenta un número concreto
     * 
     * @param Array1 el primer array en el que buscar el número
     * @param Array2 el segundo array en el que buscar el número
     * @param numero el número a buscar
     * @return devuelve el String con el nombre del Array en el que se encontraba el
     *         número (nulo en caso de no existir)
     */
    private static String buscarArrayNumero(int[] Array1, int[] Array2, int numero) {

        int longitud1 = Array1.length;
        int longitud2 = Array2.length;
        int i = 0;
        int posicion = -1;
        boolean encontrado = false;
        boolean arrayEncontrado = false;
        String queArray;

        if (longitud1 > 0) {
            do {
                if (Array1[i] == (numero)) {
                    posicion = i;
                    encontrado = true;
                    arrayEncontrado = false;
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
                        arrayEncontrado = true;
                    }
                    i++;
                } while (i < longitud2 && !encontrado);
            }
        }
        if (encontrado && !arrayEncontrado) {
            queArray = "Array 1";
        } else if (encontrado && arrayEncontrado) {
            queArray = "Array 2";
        } else {
            queArray = null;
        }
        return queArray;

    }
}

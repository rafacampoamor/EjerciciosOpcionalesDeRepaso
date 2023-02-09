import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Caso1 {
    public static void main(String[] args) throws Exception {
        /*
         * Genera 3 contraseñas de manera aleatoria.
         * Deben tener 8 caracteres como mínimo y 10 como máximo.
         * Deben contener al menos un número, una letra mayúscula y un símbolo.
         * Conseguirás más puntos en este ejercicio si sigues patrones diferentes y
         * aleatorios.
         * Que las letras, números y símbolos siempre estén en las mismas posiciones se
         * valorará con un máximo de 15 puntos.
         * Ejemplo del resultado:
         * 3er1#AWa
         * Qwert12&s
         * ASDFfds$$a
         */

        ArrayList<Character> letras = new ArrayList<Character>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Character> simbolos = new ArrayList<Character>();
        int longitud;
        ArrayList<String> password = new ArrayList<String>();


        // Declarar listas

        letras = InicioLetras();
        numeros = InicioNumeros();
        simbolos = InicioSimbolos();

        System.out.println(letras.toString());
        System.out.println(numeros.toString());
        System.out.println(simbolos.toString());

        // Establecer largo de lista al azar
        longitud= Longitud();

        //Incio bucle contraseña

        for (int i =0; i<longitud;i++){

        }

    }

    private static ArrayList<Character> InicioLetras() {
        ArrayList<Character> letras = new ArrayList<Character>();
        char[] arrayLetras = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
                'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
        for (int i = 0; i < arrayLetras.length; i++) {
            letras.add(arrayLetras[i]);
        }
        return letras;
    }

    private static ArrayList<Character> InicioSimbolos() {
        ArrayList<Character> simbolos = new ArrayList<Character>();
        char[] arrraySimbolos = { '!', '·', '$', '%', '&', '/', '=', '?', '¿', '^', '*', '¨', 'Ç', '|', '@', '#', '¢',
                '∞',
                '¬', '÷', '“', '”', '≠' };
        for (int i = 0; i < arrraySimbolos.length; i++) {
            simbolos.add(arrraySimbolos[i]);
        }
        return simbolos;

    }
    private static ArrayList<Integer> InicioNumeros() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
        return numeros;

    }
    private static int Longitud() {
        ArrayList<Integer> longitudLista = new ArrayList<Integer>();
        int[] longitudes = { 8, 9, 10 };
        int longitud;
        for (int i =0; i<longitudes.length;i++) {
            longitudLista.add(longitudes[i]);
        }

        Collections.shuffle(longitudLista);
        longitud = longitudLista(0);
        return longitud;

    }
}

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<String> tipo = new ArrayList<String>();
        String tipoActual;

        // Declarar listas

        letras = InicioLetras();
        numeros = InicioNumeros();
        simbolos = InicioSimbolos();
        tipo = tipos();

        // Establecer largo de lista al azar
        longitud = Longitud();

        // Incio bucle contraseña

        for (int i = 0; i < longitud; i++) {
            Collections.shuffle(tipo);
            tipoActual = tipo.get(0);
            switch (tipoActual) {
                case "letra":
                    Collections.shuffle(letras);
                    password.add(String.valueOf(letras.get(0)));
                    break;
                case "numero":
                    Collections.shuffle(numeros);
                    password.add(String.valueOf(numeros.get(0)));
                    break;
                case "simbolo":
                    Collections.shuffle(simbolos);
                    password.add(String.valueOf(simbolos.get(0)));
                    break;
                default:
                    break;
            }
        }

        // impresion por pantalla de la password

        System.out.println("Password: " + String.join("", password));

    }

    private static ArrayList<Character> InicioLetras() {
        ArrayList<Character> letras = new ArrayList<Character>();
        char[] arrayLetras = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k',
                'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D',
                'F', 'G', 'H', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
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
        for (int i = 0; i < longitudes.length; i++) {
            longitudLista.add(longitudes[i]);
        }

        Collections.shuffle(longitudLista);
        longitud = longitudLista.get(0);
        return longitud;

    }

    private static ArrayList<String> tipos() {
        ArrayList<String> tipo = new ArrayList<String>();
        String[] tipoString = { "letra", "numero", "simbolo" };
        for (int i = 0; i < tipoString.length; i++) {
            tipo.add(tipoString[i]);
        }
        return tipo;
    }
}

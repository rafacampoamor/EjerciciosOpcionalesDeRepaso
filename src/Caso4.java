public class Caso4 {
    public static void main(String[] args) {
        /*
         * Valida que el usuario introduce una fecha en formato ##/##/####.
         * No es válido introducir ni el día ni el mes con un dígito. Por ejemplo
         * 2/10/2021 o 12/3/2021.
         * El sistema debe mostrar un mensaje con cada error que se encuentre.
         * Por ejemplo en “q1/23-20211”
         * -El día no puede tener letras/ deben ser números.
         * -Falta una “/”
         * -El símbolo “-” no es válido.
         * -El mes es incorrecto.
         * -El año es incorrecto.
         */

        String fecha;
        boolean valido = false;

        do {
            fecha = Utilidades.PedirString("Dame una fecha en formato dd/mm/aaaa:");

            valido = ValidarFecha(fecha);
        } while (!valido);

    }


    /**
     * Recibe un String y verifica que se trate de una fecha en formato dd/mm/aaaa
     * @param fecha El String a comprobar
     * @return devuelve un booleano comprobando si es válido o no
     */
    private static boolean ValidarFecha(String fecha) {
        boolean esnumero;
        int numero;
        boolean valido = false;

        // validar formato dd/mm/aaaa
        if (fecha.substring(2, 3).equals("/")) {

            if (fecha.substring(5, 6).equals("/")) {

                esnumero = Utilidades.sonNumeros(fecha.substring(0, 2));
                numero = Integer.parseInt(fecha.substring(0, 2));

                if (esnumero && numero > 0 && numero <= 31) {
                    esnumero = Utilidades.sonNumeros(fecha.substring(3, 5));
                    numero = Integer.parseInt(fecha.substring(3, 5));

                    if (esnumero && numero > 0 && numero <= 12) {
                        esnumero = Utilidades.sonNumeros(fecha.substring(6));
                        numero = Integer.parseInt(fecha.substring(6));
                        if (esnumero && numero <= 2999) {
                            // devolver fecha con formato
                            System.out.println("Es el " + fecha.substring(0, 2) + " del " + fecha.substring(3, 5)
                                    + " de " + fecha.substring(6));
                            valido = true;
                            return valido;
                            // devolver error
                        } else
                            error();
                        return valido;
                    } else
                        error();
                    return valido;

                } else
                    error();
                return valido;
            } else
                error();
            return valido;
        } else {

            error();
            return valido;
        }
    }

    /**
     * Imprime por consola un mensaje de error
     */
    private static void error() {
        System.out.println("Formato de fecha inválido");
    }
}

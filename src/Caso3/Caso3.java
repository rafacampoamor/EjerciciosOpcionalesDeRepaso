package Caso3;

import java.util.ArrayList;

public class Caso3 {
    public static void main(String[] args) {
        /*
         * Pepe y Lola van a un restaurante. El camarero toma nota:
         * Quién pide el plato.
         * El nombre del plato.
         * Lo que cuesta el plato.
         * Como máximo pueden pedir 3 platos cada uno.
         * El finalizar la comida debe presentarse un ticket con el total de la cuenta y
         * el resumen de platos de cada uno. Por ejemplo:
         * Pepe: 112,56€ (plato1 de Pepe, plato2 de Pepe, plato3 de Pepe).
         * Lola: 120,02€ (plato1 de Lola, plato2 de Lola, plato3 de Lola).
         */

        ArrayList<Plato> menu = new ArrayList<Plato>();
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<Pedido> pedido = new ArrayList<Pedido>();

        menu = metodos.addMenu();
        personas = metodos.addPersona();
        metodos.pedir(personas, menu, pedido);
        metodos.ticket(pedido, personas);

        /*
         * Falta:
         * 1. Evitar que se pueda pedir más de una vez por cada uno
         */

    }

}
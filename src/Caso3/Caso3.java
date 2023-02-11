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

        menu = addMenu();
        personas = addPersona();
        pedir(personas, menu, pedido);
        System.out.println(pedido);

        /*
         * Falta:
         * 1. Evitar que se pueda pedir más de una vez por cada uno
         * 2. Sacar la suma de cada uno
         * 3. Sacar la lista de platos bonita
         */

        
    }

    /**
     * Inicializa la lista del menu
     * @return devuelve un Arraylist con el menú relleno
     */
    private static ArrayList<Plato> addMenu() {
        ArrayList<Plato> menu = new ArrayList<Plato>();
        menu.add(new Plato("Spaghetti", 30));
        menu.add(new Plato("Sopa", 25));
        menu.add(new Plato("Ensalada", 20));
        menu.add(new Plato("Pollo", 25));
        menu.add(new Plato("Pescado", 27));
        menu.add(new Plato("Ternera", 33));
        menu.add(new Plato("Pudding", 15));
        menu.add(new Plato("Helado", 14));
        menu.add(new Plato("Fruta", 9));

        return menu;
    }

    /**
     * Inicializa la lista de personas con Lola y Pepe
     * @return devuelve un Arraylist con las dos personas
     */
    private static ArrayList<Persona> addPersona() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("Pepe"));
        personas.add(new Persona("Lola"));

        return personas;

    }

    /**
     * Formulario de selección de cliente e inicio de pedido
     * @param personas listado de clientes
     * @param menu listado de platos del menú
     * @param pedido listado dónde se almacenan los pedidos de cada persona
     */
    private static void pedir(ArrayList<Persona> personas, ArrayList<Plato> menu, ArrayList<Pedido> pedido) {
        int seleccion;
        do {
            System.out.println("Quién pide?");
            for (int i = 0; i < personas.size(); i++) {
                System.out.println(i + " - " + personas.get(i).getNombre());
            }
            System.out.println("3 - [Salir]");

            seleccion = Utilidades.pedirInt("Selecciona un cliente por su código:");
            elegirPlato(seleccion, menu, personas, pedido);
        } while (seleccion < personas.size());

    }

    /**
     * Formulario de selección de platos para cada cliente
     * @param cliente el índice del cliente que está pidiendo
     * @param menu listado de platos del menú
     * @param clientes listado de clientes
     * @param pedido listado donde se almacenan los pedidos de cada persona
     */
    private static void elegirPlato(int cliente, ArrayList<Plato> menu, ArrayList<Persona> clientes,
            ArrayList<Pedido> pedido) {
        int seleccion;

        switch (cliente) {
            case 0:
                System.out.println("=== MENU ===");
                for (int i = 0; i < menu.size(); i++) {
                    System.out.println(i + " - " + menu.get(i).getNombre());
                }
                for (int i = 0; i < 3; i++) {
                    seleccion = Utilidades.pedirInt("Elige un plato para " + clientes.get(cliente).getNombre());
                    pedido.add(new Pedido(clientes.get(cliente), menu.get(seleccion)));
                }
                Utilidades.pausa();
                break;

            case 1:
                System.out.println("=== MENU ===");
                for (int i = 0; i < menu.size(); i++) {
                    System.out.println(i + " - " + menu.get(i).getNombre());
                }
                for (int i = 0; i < 3; i++) {
                    seleccion = Utilidades.pedirInt("Elige un plato para " + clientes.get(cliente).getNombre());
                    pedido.add(new Pedido(clientes.get(cliente), menu.get(seleccion)));
                }
                Utilidades.pausa();
                break;

            default:
                Utilidades.pausa();
                break;
        }

    }
}
package Caso3;

import java.util.ArrayList;

public class metodos {
    /**
     * Inicializa la lista del menu
     * 
     * @return devuelve un Arraylist con el menú relleno
     */
    public static ArrayList<Plato> addMenu() {
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
     * 
     * @return devuelve un Arraylist con las dos personas
     */
    public static ArrayList<Persona> addPersona() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("Pepe"));
        personas.add(new Persona("Lola"));

        return personas;

    }

    /**
     * Formulario de selección de cliente e inicio de pedido
     * 
     * @param personas listado de clientes
     * @param menu     listado de platos del menú
     * @param pedido   listado dónde se almacenan los pedidos de cada persona
     */
    public static void pedir(ArrayList<Persona> personas, ArrayList<Plato> menu, ArrayList<Pedido> pedido) {
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
     * 
     * @param cliente  el índice del cliente que está pidiendo
     * @param menu     listado de platos del menú
     * @param clientes listado de clientes
     * @param pedido   listado donde se almacenan los pedidos de cada persona
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

    /**
     * Recoge el pedido y devuelve cada pedido por persona
     * 
     * @param pedido   el Arraylist de pedidos
     * @param personas el Arraylist de clientes
     */
    public static void ticket(ArrayList<Pedido> pedido, ArrayList<Persona> personas) {
        int posicion = 0;

        System.out.println("=== TICKET===\n");
        // listado ticket
        do {
            System.out.println(
                    pedido.get(posicion).getPersona().getNombre() + " - " + pedido.get(posicion).getPlato().getNombre()
                            + ", " + pedido.get(posicion).getPlato().getPrecio() + "€");
            posicion++;

        } while (posicion < pedido.size());

        // suma por cliente

        sumaPedido(pedido, personas);

    }

    /**
     * Devuelve la suma del pedido de cada persona
     * 
     * @param pedido   el Arraylist de pedidos
     * @param personas el Arraylist de clientes
     */
    private static void sumaPedido(ArrayList<Pedido> pedido, ArrayList<Persona> personas) {
        int sumaPepe = 0;
        int sumaLola = 0;
        int posicion = 0;
        do {
            if (pedido.get(posicion).getPersona().getNombre().equals("Pepe")) {

                sumaPepe += pedido.get(posicion).getPlato().getPrecio();
            } else {
                sumaLola += pedido.get(posicion).getPlato().getPrecio();
            }
            posicion++;

        } while (posicion < pedido.size());

        System.out.println("\n - Pepe: " + sumaPepe + "\n - Lola: " + sumaLola);

    }
}

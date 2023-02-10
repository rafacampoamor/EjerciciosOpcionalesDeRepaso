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

        ArrayList<PlatoCaso3> menu = new ArrayList<PlatoCaso3>();
        ArrayList<PersonaCaso3> personas = new ArrayList<PersonaCaso3>();
        ArrayList<Pedido> pedido = new ArrayList<Pedido>();

        menu = addMenu();
        personas = addPersona();
        pedir(personas, menu, pedido);
        System.out.println(pedido);

        /*
         * Falta:
         * 1. Evigtar que se pueda pedir más de una vez por cada uno
         * 2. Sacar la suma de cada uno
         * 3. Sacar la lista de platos bonita
         */
    }

    private static ArrayList<PlatoCaso3> addMenu() {
        ArrayList<PlatoCaso3> menu = new ArrayList<PlatoCaso3>();
        menu.add(new PlatoCaso3("Spaghetti", 30));
        menu.add(new PlatoCaso3("Sopa", 25));
        menu.add(new PlatoCaso3("Ensalada", 20));
        menu.add(new PlatoCaso3("Pollo", 25));
        menu.add(new PlatoCaso3("Pescado", 27));
        menu.add(new PlatoCaso3("Ternera", 33));
        menu.add(new PlatoCaso3("Pudding", 15));
        menu.add(new PlatoCaso3("Helado", 14));
        menu.add(new PlatoCaso3("Fruta", 9));

        return menu;
    }

    private static ArrayList<PersonaCaso3> addPersona() {
        ArrayList<PersonaCaso3> personas = new ArrayList<PersonaCaso3>();

        personas.add(new PersonaCaso3("Pepe"));
        personas.add(new PersonaCaso3("Lola"));

        return personas;

    }

    private static void pedir(ArrayList<PersonaCaso3> personas, ArrayList<PlatoCaso3> menu, ArrayList<Pedido> pedido) {
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

    private static void elegirPlato(int cliente, ArrayList<PlatoCaso3> menu, ArrayList<PersonaCaso3> clientes,
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
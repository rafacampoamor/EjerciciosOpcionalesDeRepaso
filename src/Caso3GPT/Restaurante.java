package Caso3GPT;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurante {
    ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
    HashMap<String, Double> cuentas = new HashMap<String, Double>();
    HashMap<String, Integer> numPlatos = new HashMap<String, Integer>();
    Menu menu = new Menu();
    
    public void agregarPlatoMenu(String nombrePlato, double precioPlato) {
        menu.agregarPlato(nombrePlato, precioPlato);
    }
    
    public void tomarNota(String nombreCliente, String nombrePlato) {
        double precioPlato = menu.obtenerPrecio(nombrePlato);
        if (precioPlato == 0.0) {
            System.out.println("El plato " + nombrePlato + " no está disponible en el menú.");
            return;
        }
        if (!numPlatos.containsKey(nombreCliente)) {
            numPlatos.put(nombreCliente, 1);
        } else {
            int platosActuales = numPlatos.get(nombreCliente);
            if (platosActuales >= 3) {
                System.out.println("El cliente " + nombreCliente + " ya ha pedido 3 platos.");
                return;
            }
            numPlatos.put(nombreCliente, platosActuales + 1);
        }
        listaPlatos.add(new Plato(nombreCliente, nombrePlato, precioPlato));
        if (!cuentas.containsKey(nombreCliente)) {
            cuentas.put(nombreCliente, precioPlato);
        } else {
            double cuentaActual = cuentas.get(nombreCliente);
            cuentas.put(nombreCliente, cuentaActual + precioPlato);
        }
    }
    
    public void presentarTicket() {
        for (String cliente : cuentas.keySet()) {
            System.out.print(cliente + ": " + cuentas.get(cliente) + "€");
            System.out.print(" (");
            for (Plato plato : listaPlatos) {
                if (plato.nombreCliente.equals(cliente)) {
                    System.out.print(plato.nombrePlato + ", ");
                }
            }
            System.out.println(")");
        }
    }
}

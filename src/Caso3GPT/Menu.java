package Caso3GPT;

import java.util.HashMap;

public class Menu {
    HashMap<String, Double> platos = new HashMap<String, Double>();
    
    public void agregarPlato(String nombrePlato, double precioPlato) {
        platos.put(nombrePlato, precioPlato);
    }
    
    public double obtenerPrecio(String nombrePlato) {
        return platos.get(nombrePlato);
    }
}

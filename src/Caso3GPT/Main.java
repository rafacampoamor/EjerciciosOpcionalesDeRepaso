package Caso3GPT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner sc = new Scanner(System.in);
        
        restaurante.agregarPlatoMenu("Spaghetti Carbonara", 15.50);
        restaurante.agregarPlatoMenu("Pizza Margherita", 12.00);
        restaurante.agregarPlatoMenu("Arroz con Pollo", 18.00);
        restaurante.agregarPlatoMenu("Bife de Chorizo", 25.00);
        restaurante.agregarPlatoMenu("Salmón a la Parrilla", 22.00);
        restaurante.agregarPlatoMenu("Ensalada César", 10.00);
        restaurante.agregarPlatoMenu("Sopa de Tomate", 7.50);
        restaurante.agregarPlatoMenu("Churros con Chocolate", 5.00);
        restaurante.agregarPlatoMenu("Flan Casero", 6.00);
        
        System.out.println("Ingrese el nombre del cliente (Pepe o Lola) y el nombre del plato separados por una coma:");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] partes = line.split(", ");
            if (partes.length != 2) {
                System.out.println("Entrada inválida, intente de nuevo.");
                continue;
            }
            String nombreCliente = partes[0];
            String nombrePlato = partes[1];
            restaurante.tomarNota(nombreCliente, nombrePlato);
        }
        
        System.out.println("Ticket:");
        restaurante.presentarTicket();
    }
}

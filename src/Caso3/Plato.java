package Caso3;

public class Plato {
    private String nombre;
    private int precio;

    /**
     * @param nombre
     * @param precio
     */
    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PlatoCaso3 [nombre=" + nombre + ", precio=" + precio + "]";
    }

}
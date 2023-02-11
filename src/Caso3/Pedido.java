package Caso3;

public class Pedido {
    private Persona persona;
    private Plato plato;
    
    public Pedido(Persona persona, Plato plato) {
        this.persona = persona;
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    @Override
    public String toString() {
        return "Pedido [persona=" + persona + ", plato=" + plato + "]";
    }
    
}
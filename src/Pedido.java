

public class Pedido {
    private PersonaCaso3 persona;
    private PlatoCaso3 plato;
    
    public Pedido(PersonaCaso3 persona, PlatoCaso3 plato) {
        this.persona = persona;
        this.plato = plato;
    }

    public PersonaCaso3 getPersona() {
        return persona;
    }

    public void setPersona(PersonaCaso3 persona) {
        this.persona = persona;
    }

    public PlatoCaso3 getPlato() {
        return plato;
    }

    public void setPlato(PlatoCaso3 plato) {
        this.plato = plato;
    }

    @Override
    public String toString() {
        return "Pedido [persona=" + persona + ", plato=" + plato + "]";
    }
    
}
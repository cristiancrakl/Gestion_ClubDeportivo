package Persona;

public class Miembro extends Persona {
    private int eventosOrganizados;

    public Miembro(String nombre, int edad) {
        super(nombre, edad);
        this.eventosOrganizados = 0;
    }

    public void organizarEvento() {
        if (eventosOrganizados < 3) {
            eventosOrganizados++;
        } else {
            System.out.println("No se puede organizar más de tres eventos.");
        }
    }

    public int getEventosOrganizados() {
        return eventosOrganizados;
    }
}
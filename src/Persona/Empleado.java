package Persona;

public class Empleado extends Persona {
    private int eventosGestionados;
    private double bono;

    public Empleado(String nombre, int edad, double bono) {
        super(nombre, edad);
        this.eventosGestionados = 0;
        this.bono = bono;
    }

    public void gestionarEvento() {
        eventosGestionados++;
    }

    public int getEventosGestionados() {
        return eventosGestionados;
    }

    public double getBono() {
        return bono;
    }
}

package Evento;

import Persona.*;


public class Evento {
    private Miembro solicitante;
    private Empleado organizador;
    private String fecha;

    public Evento(Miembro solicitante, Empleado organizador, String fecha) {
        this.solicitante = solicitante;
        this.organizador = organizador;
        this.fecha = fecha;
    }

    public Miembro getSolicitante() {
        return solicitante;
    }

    public Empleado getOrganizador() {
        return organizador;
    }

    public String getFecha() {
        return fecha;
    }
}


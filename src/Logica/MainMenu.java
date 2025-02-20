package Logica;

import Evento.Evento;
import Persona.Empleado;
import Persona.Miembro;

public class MainMenu {
    public static void Menu(){
         // Crear miembros
        Miembro miembro1 = new Miembro("Juan", 25);
        Miembro miembro2 = new Miembro("María", 30);

        // Crear empleados
        Empleado empleado1 = new Empleado("Pedro", 35, 1000.0);
        Empleado empleado2 = new Empleado("Ana", 40, 1200.0);

        // Crear eventos
        Evento evento1 = new Evento(miembro1, empleado1, "2024-03-15");
        Evento evento2 = new Evento(miembro1, empleado2, "2024-04-20");
        Evento evento3 = new Evento(miembro2, empleado1, "2024-05-10");

        // Mostrar información de los eventos
        System.out.println("Evento 1:");
        System.out.println("Solicitante: " + evento1.getSolicitante().getNombre());
        System.out.println("Organizador: " + evento1.getOrganizador().getNombre());
        System.out.println("Fecha: " + evento1.getFecha());

        System.out.println("Evento 2:");
        System.out.println("Solicitante: " + evento2.getSolicitante().getNombre());
        System.out.println("Organizador: " + evento2.getOrganizador().getNombre());
        System.out.println("Fecha: " + evento2.getFecha());

        System.out.println("Evento 3:");
        System.out.println("Solicitante: " + evento3.getSolicitante().getNombre());
        System.out.println("Organizador: " + evento3.getOrganizador().getNombre());
        System.out.println("Fecha: " + evento3.getFecha());
    }
}

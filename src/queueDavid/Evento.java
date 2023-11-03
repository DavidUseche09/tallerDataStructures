package queueDavid;

import java.util.Scanner;

public class Evento {
    Queue asistentes;
    int aforo;
    int ticketsDisponibles;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.ticketsDisponibles = aforo;
        this.asistentes = new Queue();
    }

    public void registrarComprador(Asistente asistente) {
        this.asistentes.add(asistente);
        System.out.println("Hola, " + asistente.getNombre() + " " + asistente.getApellido() + "! Has sido agregado a la cola.");
    }

    public void comprarTicket(Asistente asistente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos tickets desea comprar, " + asistente.getNombre() + "?");
        int cantidadTickets = scanner.nextInt();

        if (cantidadTickets <= ticketsDisponibles) {
            System.out.println("Se han comprado " + cantidadTickets + " tickets para " + asistente.getNombre() + " " + asistente.getApellido() + ".");
            ticketsDisponibles -= cantidadTickets;
        } else {
            System.out.println("Lo sentimos, no hay suficientes tickets disponibles para " + asistente.getNombre() + " " + asistente.getApellido() + ".");
        }
    }

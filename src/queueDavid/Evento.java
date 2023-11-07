package queueDavid;
import java.util.Scanner;

public class Evento {
    private Queue asistentes;
    private int aforo;
    private int ticketsDisponibles;

    public Evento(int aforo) {
        this.asistentes = new Queue();
        this.aforo = aforo;
        this.ticketsDisponibles = aforo;
    }

    public void registrarComprador(Asistente asistente) {
        if (ticketsDisponibles > 0) {
            asistentes.add(asistente);
            System.out.println("El asistente " + asistente.getNombre() + " " + asistente.getApellido() + " ha sido agregado a la cola.");
        } else {
            System.out.println("No hay más tickets disponibles. Lo sentimos, " + asistente.getNombre() + " " + asistente.getApellido() + ".");
        }
    }
    public void atenderAsistentes() {
        Scanner scanner = new Scanner(System.in);
        while (!asistentes.isEmpty()) {
            Asistente asistente = asistentes.remove();
            System.out.println("Asistente: " + asistente.getNombre() + " " + asistente.getApellido());
            System.out.println("¿Cuántos tickets desea comprar?");
            int cantidadTickets = scanner.nextInt();
            if (cantidadTickets <= ticketsDisponibles) {
                System.out.println("Se han comprado " + cantidadTickets + " tickets para " + asistente.getNombre() + " " + asistente.getApellido() + ".");
                ticketsDisponibles -= cantidadTickets;
            } else {
                System.out.println("Lo sentimos, no hay suficientes tickets disponibles para " + asistente.getNombre() + " " + asistente.getApellido() + ".");
            }
        }
    }
}


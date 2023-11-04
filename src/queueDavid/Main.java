package queueDavid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al sistema de gestión de tickets");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese el aforo máximo del evento:");
        int aforo = scanner.nextInt();
        Evento evento = new Evento(aforo);
        boolean continuar = true;

        while (continuar) {
            System.out.println("-------------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar asistente");
            System.out.println("2. Solicitar ticket");
            System.out.println("3. Salir");
            System.out.println("-------------------------------------------");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del asistente:");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el apellido del asistente:");
                    String apellido = scanner.next();
                    Asistente asistente = new Asistente(nombre, apellido);
                    evento.registrarComprador(asistente);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del asistente que solicita el ticket:");
                    nombre = scanner.next();
                    System.out.println("Ingrese el apellido del asistente que solicita el ticket:");
                    apellido = scanner.next();
                    asistente = new Asistente(nombre, apellido);
                    evento.comprarTicket(asistente);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        System.out.println("Gracias por utilizar el sistema de gestión de tickets.");
    }
}

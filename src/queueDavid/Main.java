package queueDavid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bienvenido al sistema de gestión de tickets para el concierto");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ingrese el aforo máximo del concierto:");
        int aforo = read.nextInt();
        Evento evento = new Evento(aforo);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar asistente a la cola");
            System.out.println("2. Atender asistentes");
            System.out.println("3. Salir");
            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del asistente:");
                    String nombre = read.next();
                    System.out.println("Ingrese el apellido del asistente:");
                    String apellido = read.next();
                    Asistente asistente = new Asistente(nombre, apellido);
                    evento.registrarComprador(asistente);
                    break;
                case 2:
                    evento.atenderAsistentes();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        System.out.println("Gracias por utilizar el sistema de gestión de tickets para el concierto. Vuelva pronto :D");
    }
}

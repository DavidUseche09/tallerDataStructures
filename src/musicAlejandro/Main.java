/*
Simular una cola de reproducción de música  (Colas):
Implementa un programa que simule una cola de reproducción de música.
Los usuarios pueden agregar canciones a la cola y reproducirlas en el orden en que se agregaron.
También deben poder eliminar canciones de la cola.
*/

package musicAlejandro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue playlist = new Queue();

        boolean play = true;

        while (play){
            System.out.println("1. Agregar canción a la cola");
            System.out.println("2. Mostrar lista de reproducción");
            System.out.println("3. Eliminar canción de la cola");
            System.out.println("4. Salir");
            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre de la canción:");
                    String nombreCancion = scanner.nextLine();
                    Cancion cancion = new Cancion(nombreCancion);
                    playlist.add(cancion);
                    System.out.println("Canción agregada a la cola de reproducción.");
                    break;
                case 2:
                    playlist.reproducirCanciones();
                    break;
                case 3:
                    if (!playlist.isEmpty()) {
                        Cancion cancionEliminada = playlist.remove();
                        System.out.println("Se eliminó la canción " + cancionEliminada.getTitulo() + " de la cola de reproducción.");
                    } else {
                        System.out.println("La cola de reproducción está vacía.");
                    }
                    break;
                case 4:
                    play = false;
                    break;
                default:
                    System.out.println("Por favor seleccione una opción válida");
            }
        }
    }
}

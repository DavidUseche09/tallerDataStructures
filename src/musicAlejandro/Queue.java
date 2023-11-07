package musicAlejandro;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Cancion> list = new LinkedList<>();

    public void add(Cancion cancion) {
        this.list.add(cancion);
    }

    public Cancion remove() {
        return this.list.remove();
    }

    public void reproducirCanciones() {
        if (list.isEmpty()) {
            System.out.println("La cola de reproducción está vacía.");
        } else {
            System.out.println("Reproduciendo canciones:");
            for (Cancion cancion : list) {
                System.out.println(cancion.getTitulo());
            }
        }
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
package queueDavid;
import java.util.LinkedList;

public class Queue {
    private LinkedList<Asistente> list = new LinkedList<>();

    public void add(Asistente asistente) {
        this.list.add(asistente);
    }

    public Asistente remove() {
        return this.list.remove();
    }

    public Asistente peek() {
        return this.list.peek();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
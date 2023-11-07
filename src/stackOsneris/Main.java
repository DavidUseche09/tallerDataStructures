package stackOsneris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese una palabra o comando (-1 para deshacer, +print para mostrar el texto): ");
            String input = scanner.next();

            if (input.equals("-1")) {
                editor.undoLastAction();
            } else if (input.equals("+print")) {
                editor.printText();
            } else {
                editor.addText(input);
            }
        }

    }
}
package mathJulian;
import java.util.Stack;


public class math {
    public static boolean expresionValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                pila.push(c);


            } else if (c == '}' || c == ']' || c == ')') {
                if (pila.isEmpty()) {
                    return false;               // cierre sin apertura correspondiente
                }
                char apertura = pila.pop();
                if ((c == '}' && apertura != '{') || (c == ']' && apertura != '[') || (c == ')' && apertura != '(')) {
                    return false;         // los sombolos no coincidieron.
                }
            }
        }
        return pila.isEmpty();     // si la pila está vacía, todos los simbolos coincidieron



    }
}

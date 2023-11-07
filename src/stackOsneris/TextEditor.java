package stackOsneris;

import java.util.Stack;
import java.util.Scanner;

public class TextEditor {
    private StringBuilder text;
    private Stack<String> actionStack;

    public TextEditor() {
        text = new StringBuilder();
        actionStack = new Stack<>();
    }
    public void addText(String word) {
        text.append(word).append("");
        actionStack.push(word);
    }

    public void undoLastAction() {
        if (!actionStack.isEmpty()) {
            String removedWord = actionStack.pop();
            int lengthToRemove = removedWord.length() + 1;
            text.delete(text.length() - lengthToRemove, text.length());
        }
    }

    public void printText() {
        System.out.println(text.toString());
    }
}
package Desafios;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InversaoString {
    public static String inversoString(String string) {
        Stack d = new Stack();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isLetter(c)) {
                d.add(c);
            }
        }
        String resultado = " ";
        while (!d.isEmpty()) {
            resultado += d.pop();
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(inversoString("Java 123!"));
    }
}

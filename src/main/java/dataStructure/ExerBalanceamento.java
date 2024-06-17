package dataStructure;

import java.util.Set;
import java.util.Stack;

public class ExerBalanceamento {

    // Método para verificar se a expressão de parênteses está balanceada
    public boolean solve(String expression) {
        Set<Character> openSymbols = Set.of('(', '{', '[');
        Set<Character> closeSymbols = Set.of(')', '}', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (openSymbols.contains(c)) {
                stack.push(c);
            } else if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if ((open == '(' && c != ')') ||
                        (open == '{' && c != '}') ||
                        (open == '[' && c != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Exemplo de uso da função solve
    public static void main(String[] args) {
        ExerBalanceamento exer = new ExerBalanceamento();

        // Exemplos de expressões balanceadas e não balanceadas
        String exp1 = "{[()]}";
        String exp2 = "{[(])}";
        String exp3 = "{{[[(())]]}}";

        System.out.println("Expressão 1 balanceada? " + exer.solve("2*(3+4+5*[2+3)]")); // true
        System.out.println("Expressão 2 balanceada? " + exer.solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]")); // false

    }
}
package collections.optionalTask;

import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("(({}))[] = " + isValidParentheses("(({}))[]"));
        System.out.println("([{()}])() = " + isValidParentheses("([{()}])()"));
        System.out.println("){}([] = " + isValidParentheses("){}([]"));
        System.out.println("[{]} = " + isValidParentheses("[{]}"));
    }

    private static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (char currentChar : str.toCharArray())
            if (stack.size() > 0 && isPair(stack.peek(), currentChar)) stack.pop();
            else stack.push(currentChar);
        return stack.size() == 0;
    }

    private static boolean isPair(char stackPeek, char currentChar) {
        return  (stackPeek == '(' && currentChar == ')') ||
                (stackPeek == '[' && currentChar == ']') ||
                (stackPeek == '{' && currentChar == '}');
    }
}

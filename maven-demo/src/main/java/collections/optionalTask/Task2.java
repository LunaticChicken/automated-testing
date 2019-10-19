package collections.optionalTask;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        StringBuilder outputReverseString = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        while (stack.size() != 0) outputReverseString.append(stack.pop());
        System.out.println("Reversed string: " + outputReverseString);
    }
}

package org.example;

import java.util.Map;
import java.util.Stack;

public class ValidParanthes {

    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        final Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            // { [ ( ) ] }
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        final ValidParanthes validParanthes = new ValidParanthes();
        System.out.println(validParanthes.isValid("{ [ ( ) ] }"));
    }

}

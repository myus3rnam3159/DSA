package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    private static final Map<Character, Character> brackets = new HashMap<Character, Character>(){
        {
            put('(', ')');
            put('{', '}');
            put('[', ']');
        }
    

    };
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<Character>();
            boolean isBalanced = true; // Track if the brackets are balanced

            for (char c : input.toCharArray()) {

                if (brackets.containsKey(c)) {
                    stack.push(c);
                } else {
                    // Check if the stack is empty or the current character does not match the expected closing bracket
                    if (stack.isEmpty() || c != brackets.get(stack.pop())) {
                        isBalanced = false;
                        break; // No need to check further
                    }
                }
            }
            // Ensure the stack is empty (no unmatched opening brackets) and the brackets are balanced
            if (!stack.isEmpty() || !isBalanced) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
        sc.close();
    }
}

import java.util.Stack;

public class ParenthesisChecker {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            switch (ch) {
                case '(': case '[': case '{':
                    stack.push(ch);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}

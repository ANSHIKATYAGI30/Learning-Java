import java.util.Stack;

public class Stack_Level3 {

    // Operator Precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    // 1. INFIX TO POSTFIX
    static String infixToPostfix(String exp) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : exp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(')
                    ans.append(st.pop());
                st.pop();
            }

            else {
                while (!st.isEmpty() &&
                        precedence(st.peek()) >= precedence(ch))
                    ans.append(st.pop());
                st.push(ch);
            }
        }

        while (!st.isEmpty())
            ans.append(st.pop());
        return ans.toString();
    }

   
    // 2. INFIX TO PREFIX
    static String infixToPrefix(String exp) {

        StringBuilder input = new StringBuilder(exp);
        input.reverse();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                input.setCharAt(i, ')');
            else if (input.charAt(i) == ')')
                input.setCharAt(i, '(');
        }

        String postfix = infixToPostfix(input.toString());
        return new StringBuilder(postfix).reverse().toString();
    }

    // ============================================================
    // 3. POSTFIX TO INFIX
    // ============================================================

    static String postfixToInfix(String exp) {

        Stack<String> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {

                st.push(ch + "");

            }

            else {

                String b = st.pop();
                String a = st.pop();

                st.push("(" + a + ch + b + ")");
            }

        }

        return st.peek();
    }

    // ============================================================
    // 4. PREFIX TO INFIX
    // ============================================================

    static String prefixToInfix(String exp) {

        Stack<String> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {

                st.push(ch + "");

            }

            else {

                String a = st.pop();
                String b = st.pop();

                st.push("(" + a + ch + b + ")");
            }

        }

        return st.peek();
    }

    // ============================================================
    // 5. EVALUATE POSTFIX
    // ============================================================

    static int evaluatePostfix(String exp) {

        Stack<Integer> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch)) {

                st.push(ch - '0');

            }

            else {

                int b = st.pop();
                int a = st.pop();

                switch (ch) {

                    case '+':
                        st.push(a + b);
                        break;

                    case '-':
                        st.push(a - b);
                        break;

                    case '*':
                        st.push(a * b);
                        break;

                    case '/':
                        st.push(a / b);
                        break;
                }

            }

        }

        return st.peek();
    }

    // ============================================================
    // 6. EVALUATE PREFIX
    // ============================================================

    static int evaluatePrefix(String exp) {

        Stack<Integer> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {

                st.push(ch - '0');

            }

            else {

                int a = st.pop();
                int b = st.pop();

                switch (ch) {

                    case '+':
                        st.push(a + b);
                        break;

                    case '-':
                        st.push(a - b);
                        break;

                    case '*':
                        st.push(a * b);
                        break;

                    case '/':
                        st.push(a / b);
                        break;
                }

            }

        }

        return st.peek();
    }

    // ============================================================
    // MAIN
    // ============================================================

    public static void main(String[] args) {

        String infix = "A+B*C";

        System.out.println("Infix : " + infix);

        System.out.println("Postfix : " + infixToPostfix(infix));

        System.out.println("Prefix : " + infixToPrefix(infix));

        System.out.println();

        System.out.println("Postfix to Infix");

        System.out.println(postfixToInfix("ABC*+"));

        System.out.println();

        System.out.println("Prefix to Infix");

        System.out.println(prefixToInfix("+A*BC"));

        System.out.println();

        System.out.println("Evaluate Postfix");

        System.out.println(evaluatePostfix("23*54*+"));

        System.out.println();

        System.out.println("Evaluate Prefix");

        System.out.println(evaluatePrefix("+*234"));
    }
}

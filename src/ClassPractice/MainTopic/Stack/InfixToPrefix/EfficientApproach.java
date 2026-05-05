package ClassPractice.MainTopic.Stack.InfixToPrefix;

import java.util.Stack;

public class EfficientApproach {
    public static int precedence(char op){
        if(op == '^') return 3;
        if(op == '*' || op == '/') return 2;
        if(op == '+' || op == '-') return 1;
        return -1;
    }

    public static void main(String[] args) {
        String ex = "(A + B) * (C - D)";
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i = ex.length()-1; i >= 0; i--)
        {
            char ch = ex.charAt(i);
            if(Character.isLetterOrDigit(ch)) result.append(ch);
            else if(ch == ')') st.push(ch);
            else if(ch == '(')
            {
                while (!st.isEmpty() && st.peek() != ')')
                {
                    result.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            }
            else {
                while (!st.isEmpty() && (precedence(ch) < precedence(st.peek()) || (precedence(ch) == precedence(st.peek()) && st.peek() != '^')))
                {
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty())
        {
            result.append(st.pop());
        }
        System.out.println(result.reverse().toString());
    }
}
